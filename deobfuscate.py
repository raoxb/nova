#!/usr/bin/env python3
"""
Java代码反混淆工具
根据sourcemap映射关系，将混淆的Java代码还原为更易读的形式
"""

import os
import re
import json
from pathlib import Path
from collections import defaultdict

class JavaDeobfuscator:
    def __init__(self, sourcemap_path):
        """加载sourcemap映射数据"""
        with open(sourcemap_path, 'r', encoding='utf-8') as f:
            self.sourcemap = json.load(f)

        # 构建反向映射表
        self.build_reverse_mappings()

        # 推断合理的原始包名
        self.infer_original_package_names()

    def build_reverse_mappings(self):
        """构建混淆名 -> 原始名的反向映射"""
        self.obfuscated_to_clear = {}

        # 类映射
        self.class_mappings = {}
        for class_path, info in self.sourcemap['classes'].items():
            if info['is_obfuscated']:
                obf_full = info['full_name']
                self.class_mappings[obf_full] = class_path

        # 字段映射
        self.field_mappings = defaultdict(dict)
        for class_name, fields in self.sourcemap['fields'].items():
            for obf_name, mapping in fields.items():
                self.field_mappings[class_name][obf_name] = mapping['original']

    def infer_original_package_names(self):
        """推断原始包名"""
        self.package_mappings = {
            # 基于使用模式推断的原始包名
            'IlIlllIIlI1': 'com.obfuscated.crypto',  # 字符串加解密
            'IIIlIllIlI1': 'com.obfuscated.webview',  # WebView操作
            'IllIIlIIII1': 'com.obfuscated.encoding',  # 编码相关
            'lIIlllIIIlllII1': 'com.obfuscated.websocket',  # WebSocket
            'IllllIllllll1': 'com.obfuscated.websocket.extensions',  # WebSocket扩展
            'IlIIIIllllIlI1': 'com.obfuscated.frame',  # 帧处理
            'IlIlIIIlIlIlll1': 'com.obfuscated.client',  # 客户端
            'lIIlIIIIlIlII1': 'com.obfuscated.opcode',  # 操作码
            'lIllIIIlIl1': 'com.obfuscated.util',  # 工具类
            'llllIIIIll1': 'com.obfuscated.helper',  # 辅助类
        }

        # 类名映射推断
        self.class_name_mappings = {
            'IllIIlIIII1': 'StringDecryptor',  # 字符串解密器
            'llllIIIIll1': 'Helper',
            'lIIIIlllllIlll1': 'Constants',
            'IlIlllIIlI1': 'DataHandler',
            'IlIlIIlIII1': 'WebViewHook',
            'IlIllIlllIllI1': 'Frame',
            'llllIllIl1': 'Exception',
            'llllllIlIIIlll1': 'ByteBuffer',
        }

    def infer_field_name(self, original_obfuscated_name, context_class):
        """推断字段的语义化名称"""
        # 如果是常见模式，给出更好的名称
        if 'llllIIIIll1' in original_obfuscated_name:
            if 'crypto' in context_class or 'Decryptor' in context_class:
                return 'stringDecryptor'
            return 'helper'

        if 'lIIIIlllllIlll1' in original_obfuscated_name:
            return 'constants'

        if 'IlIlllIIlI1' in original_obfuscated_name:
            return 'dataHandler'

        # 根据字段位置推断
        if original_obfuscated_name.startswith('f'):
            # 移除f前缀，保持原始混淆名
            return 'field_' + original_obfuscated_name[1:]

        return original_obfuscated_name

    def deobfuscate_package_name(self, package_name):
        """反混淆包名"""
        if package_name in self.package_mappings:
            return self.package_mappings[package_name]

        # 如果不在映射表中，保持原样
        if not re.match(r'^[IlL1]+$', package_name):
            return package_name

        return f'com.obfuscated.unknown.{package_name}'

    def deobfuscate_class_name(self, class_name, package_context=''):
        """反混淆类名"""
        if class_name in self.class_name_mappings:
            return self.class_name_mappings[class_name]

        # 保持清晰的类名
        if not re.match(r'^[IlL1]+$', class_name):
            return class_name

        return f'Obfuscated_{class_name}'

    def deobfuscate_field_name(self, field_name, class_context):
        """反混淆字段名"""
        # 查找映射
        if class_context in self.field_mappings:
            if field_name in self.field_mappings[class_context]:
                original = self.field_mappings[class_context][field_name]
                return self.infer_field_name(original, class_context)

        # 如果是明显的混淆字段名，尝试改进
        if re.match(r'^f\d+[IlL1]+$', field_name):
            return self.infer_field_name(field_name, class_context)

        return field_name

    def deobfuscate_import(self, import_line):
        """反混淆import语句"""
        match = re.match(r'^import\s+([\w.]+);', import_line)
        if not match:
            return import_line

        full_import = match.group(1)
        parts = full_import.split('.')

        # 反混淆每个部分
        deobf_parts = []
        for i, part in enumerate(parts):
            if i == len(parts) - 1:  # 类名
                deobf_parts.append(self.deobfuscate_class_name(part))
            else:  # 包名
                deobf_parts.append(self.deobfuscate_package_name(part))

        return f"import {'.'.join(deobf_parts)};"

    def deobfuscate_file(self, file_path, output_dir):
        """反混淆单个Java文件"""
        try:
            with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
        except Exception as e:
            print(f"Error reading {file_path}: {e}")
            return None

        # 提取包名和类名
        package_match = re.search(r'^\s*package\s+([\w.]+);', content, re.MULTILINE)
        class_match = re.search(r'public\s+(?:class|interface|enum)\s+(\w+)', content)

        if not package_match or not class_match:
            return None

        original_package = package_match.group(1)
        original_class = class_match.group(1)
        class_context = f"{original_package}.{original_class}"

        # 反混淆包名
        deobf_package_parts = [self.deobfuscate_package_name(p) for p in original_package.split('.')]
        deobf_package = '.'.join(deobf_package_parts)

        # 反混淆类名
        deobf_class = self.deobfuscate_class_name(original_class, original_package)

        # 开始替换
        deobf_content = content

        # 替换包声明
        deobf_content = re.sub(
            r'package\s+' + re.escape(original_package) + r';',
            f'package {deobf_package};',
            deobf_content
        )

        # 替换类名（小心不要替换import中的）
        deobf_content = re.sub(
            r'\bpublic\s+(class|interface|enum)\s+' + re.escape(original_class) + r'\b',
            rf'public \1 {deobf_class}',
            deobf_content
        )

        # 替换import语句
        import_pattern = r'^import\s+[\w.]+;'
        imports = re.findall(import_pattern, deobf_content, re.MULTILINE)
        for imp in imports:
            deobf_imp = self.deobfuscate_import(imp)
            deobf_content = deobf_content.replace(imp, deobf_imp)

        # 替换字段名
        if class_context in self.field_mappings:
            for obf_field, original in self.field_mappings[class_context].items():
                better_name = self.infer_field_name(original, class_context)
                # 匹配字段声明和使用
                deobf_content = re.sub(
                    r'\b' + re.escape(obf_field) + r'\b',
                    better_name,
                    deobf_content
                )

        # 添加注释说明
        header = f'''/**
 * 反混淆的Java类
 * 原始包名: {original_package}
 * 原始类名: {original_class}
 * 反混淆后: {deobf_package}.{deobf_class}
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

'''
        deobf_content = header + deobf_content

        # 生成输出路径
        rel_path = os.path.relpath(file_path, '/home/user/nova/sources')
        output_path = os.path.join(output_dir, 'deobfuscated', rel_path)

        # 创建目录
        os.makedirs(os.path.dirname(output_path), exist_ok=True)

        # 写入文件
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write(deobf_content)

        return output_path

    def deobfuscate_all(self, sources_dir, output_dir):
        """反混淆所有Java文件"""
        count = 0
        errors = 0

        for root, dirs, files in os.walk(sources_dir):
            for file in files:
                if not file.endswith('.java'):
                    continue

                file_path = os.path.join(root, file)

                # 只处理混淆文件
                with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                    first_line = f.readline()
                    if 'package' in first_line:
                        package = re.search(r'package\s+([\w.]+)', first_line)
                        if package:
                            pkg_name = package.group(1).split('.')[0]
                            # 跳过清晰命名的文件
                            if not re.match(r'^[IlL1]+$', pkg_name):
                                continue

                try:
                    output_path = self.deobfuscate_file(file_path, output_dir)
                    if output_path:
                        count += 1
                        if count % 10 == 0:
                            print(f"已处理 {count} 个文件...")
                except Exception as e:
                    print(f"处理 {file_path} 时出错: {e}")
                    errors += 1

        return count, errors

def main():
    print("Java代码反混淆工具")
    print("=" * 60)

    sourcemap_path = '/home/user/nova/sourcemap.json'
    sources_dir = '/home/user/nova/sources'
    output_dir = '/home/user/nova'

    print(f"加载sourcemap: {sourcemap_path}")
    deobf = JavaDeobfuscator(sourcemap_path)

    print(f"开始反混淆 {sources_dir} 中的文件...")
    count, errors = deobf.deobfuscate_all(sources_dir, output_dir)

    print("\n" + "=" * 60)
    print(f"反混淆完成!")
    print(f"成功处理: {count} 个文件")
    print(f"错误: {errors} 个")
    print(f"输出目录: {output_dir}/deobfuscated/")

    # 生成索引文件
    index_path = os.path.join(output_dir, 'deobfuscated', 'INDEX.md')
    with open(index_path, 'w', encoding='utf-8') as f:
        f.write("# 反混淆代码索引\n\n")
        f.write(f"成功反混淆了 {count} 个Java文件\n\n")
        f.write("## 推断的包名映射\n\n")
        for obf, clear in deobf.package_mappings.items():
            f.write(f"- `{obf}` -> `{clear}`\n")
        f.write("\n## 推断的类名映射\n\n")
        for obf, clear in deobf.class_name_mappings.items():
            f.write(f"- `{obf}` -> `{clear}`\n")

    print(f"索引文件: {index_path}")

if __name__ == '__main__':
    main()
