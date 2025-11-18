#!/usr/bin/env python3
"""
完整的Java反混淆工具
正确的反混淆顺序：
1. 包名/文件夹重组
2. 类名/文件名重命名
3. 方法名重命名
4. 变量名重命名
5. 字符串解密
"""

import os
import re
import json
import shutil
from pathlib import Path
from collections import defaultdict

class CompleteDeobfuscator:
    def __init__(self, sourcemap_path):
        with open(sourcemap_path, 'r', encoding='utf-8') as f:
            self.sourcemap = json.load(f)

        # 定义完整的映射表
        self.package_mappings = {
            'IIIlIllIlI1': 'com/webview',
            'IlIlllIIlI1': 'com/crypto',
            'IllllIllllll1': 'com/websocket/extensions',
            'lIIlllIIIlllII1': 'com/websocket',
            'IlIIIIllllIlI1': 'com/frame',
            'IlIlIIIlIlIlll1': 'com/client',
            'lIIlIIIIlIlII1': 'com/opcode',
            'lIllIIIlIl1': 'com/util',
            'llllIIIIll1': 'com/helper',
            'IllIIlIIII1': 'com/encoding',
        }

        self.class_mappings = {
            'IlIlIIlIII1': 'WebViewHook',
            'IllIIlIIII1': 'VirtualDisplayCapture',
            'lIllIIIlIl1': 'WebMessageHandler',
            'llllIIIIll1': 'PerMessageDeflate',
            'lIIIIlllllIlll1': 'Constants',
            'IlIlllIIlI1': 'DataHandler',
            'IlIllIlllIllI1': 'Frame',
            'llllIllIl1': 'DeobfuscationException',
            'llllllIlIIIlll1': 'ByteBufferWrapper',
        }

        # 方法名映射
        self.method_patterns = {
            r'lIIIIlllllIlll1': 'getClassLoader',
            r'llllIllIl1': 'getWebViewProvider',
            r'llllIIIIll1': 'decrypt',
            r'IllIIlIIII1': 'isEnabled',
            r'IlIlIIlIII1': 'initialize',
        }

    def xor_decrypt(self, encrypted, key):
        """XOR解密"""
        try:
            result = []
            for i, b in enumerate(encrypted):
                result.append(b ^ key[i % len(key)])
            return bytes(result).decode('utf-8', errors='ignore')
        except:
            return None

    def parse_byte_array(self, text):
        """解析字节数组"""
        match = re.search(r'new\s+byte\[\]\s*\{([^}]+)\}', text)
        if match:
            try:
                return [int(b.strip()) & 0xFF for b in match.group(1).split(',') if b.strip()]
            except:
                pass
        return None

    def create_package_structure(self, base_dir):
        """创建新的包结构"""
        structure = {}

        for obf_pkg, clear_pkg in self.package_mappings.items():
            clear_path = os.path.join(base_dir, 'fully_deobfuscated', clear_pkg)
            os.makedirs(clear_path, exist_ok=True)
            structure[obf_pkg] = clear_path

        return structure

    def deobfuscate_file_completely(self, file_path, output_base):
        """完全反混淆一个文件"""
        try:
            with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
        except:
            return None

        # 提取原始包名和类名
        pkg_match = re.search(r'package\s+([\w.]+);', content)
        cls_match = re.search(r'public\s+(?:class|interface|enum)\s+(\w+)', content)

        if not pkg_match or not cls_match:
            return None

        original_package = pkg_match.group(1)
        original_class = cls_match.group(1)

        # 获取新的包名和类名
        pkg_parts = original_package.split('.')
        new_pkg_parts = []

        for part in pkg_parts:
            if part in self.package_mappings:
                new_pkg_parts.extend(self.package_mappings[part].split('/'))
            else:
                new_pkg_parts.append(part)

        new_package = '.'.join(new_pkg_parts)
        new_class = self.class_mappings.get(original_class, original_class)

        print(f"\n处理: {original_package}.{original_class}")
        print(f"  → {new_package}.{new_class}")

        # 1. 替换包声明
        content = re.sub(
            r'package\s+' + re.escape(original_package) + r';',
            f'package {new_package};',
            content
        )

        # 2. 替换类名（声明）
        content = re.sub(
            r'\bpublic\s+(class|interface|enum)\s+' + re.escape(original_class) + r'\b',
            rf'public \1 {new_class}',
            content
        )

        # 3. 替换import语句中的混淆包名
        for obf_pkg, clear_pkg in self.package_mappings.items():
            clear_pkg_dot = clear_pkg.replace('/', '.')
            content = re.sub(
                r'\bimport\s+' + re.escape(obf_pkg) + r'\.',
                f'import {clear_pkg_dot}.',
                content
            )

        # 4. 替换import语句中的混淆类名
        for obf_cls, clear_cls in self.class_mappings.items():
            content = re.sub(
                r'\bimport\s+([\w.]+)\.' + re.escape(obf_cls) + r';',
                rf'import \1.{clear_cls};',
                content
            )

        # 5. 解密所有字符串
        decrypt_count = 0
        pattern = r'(\w+\.)?llllIIIIll1\s*\(\s*new\s+byte\[\]\s*\{([^}]+)\}\s*,\s*new\s+byte\[\]\s*\{([^}]+)\}\s*\)'

        for match in re.finditer(pattern, content):
            encrypted = self.parse_byte_array(f'new byte[]{{{match.group(2)}}}')
            key = self.parse_byte_array(f'new byte[]{{{match.group(3)}}}')

            if encrypted and key:
                decrypted = self.xor_decrypt(encrypted, key)
                if decrypted and decrypted.isprintable():
                    content = content.replace(match.group(0), f'"{decrypted}"')
                    decrypt_count += 1

        if decrypt_count > 0:
            print(f"  ✓ 解密 {decrypt_count} 个字符串")

        # 6. 重命名方法（基于模式）
        method_count = 0
        for obf_pattern, clear_name in self.method_patterns.items():
            if re.search(obf_pattern, content):
                # 只替换方法定义，不替换所有出现
                old_count = len(re.findall(obf_pattern, content))
                content = re.sub(
                    r'\b' + obf_pattern + r'\s*\(',
                    f'{clear_name}(',
                    content
                )
                new_count = len(re.findall(obf_pattern, content))
                if new_count < old_count:
                    method_count += 1

        if method_count > 0:
            print(f"  ✓ 重命名 {method_count} 个方法模式")

        # 7. 改进变量名
        # 常见的混淆变量名模式
        var_replacements = {
            r'\bbArr\b': 'byteArray',
            r'\bbArr2\b': 'keyArray',
            r'\bbArr3\b': 'encryptedData',
            r'\bbArr4\b': 'decryptionKey',
            r'\bobj\b': 'object',
            r'\bobj2\b': 'provider',
            r'\bobj3\b': 'handler',
            r'\bcls\b': 'clazz',
            r'\bcls2\b': 'providerClass',
            r'\bstr\b': 'message',
            r'\bstr2\b': 'logMessage',
            r'\bz\b': 'result',
        }

        var_count = 0
        for pattern, replacement in var_replacements.items():
            if re.search(pattern, content):
                content = re.sub(pattern, replacement, content)
                var_count += 1

        if var_count > 0:
            print(f"  ✓ 改进 {var_count} 个变量名")

        # 8. 简化字节数组初始化
        content = self.simplify_byte_arrays(content)

        # 9. 添加文件头注释
        header = f'''/**
 * 完全反混淆的Java类
 *
 * 原始: {original_package}.{original_class}
 * 反混淆: {new_package}.{new_class}
 *
 * 反混淆处理:
 * ✓ 包名重组: {original_package} → {new_package}
 * ✓ 类名重命名: {original_class} → {new_class}
 * ✓ 字符串解密: {decrypt_count} 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

'''

        content = header + content

        # 10. 确定输出路径（使用新的包结构）
        output_pkg_path = os.path.join(output_base, 'fully_deobfuscated', *new_pkg_parts)
        os.makedirs(output_pkg_path, exist_ok=True)

        output_file = os.path.join(output_pkg_path, f'{new_class}.java')

        # 写入文件
        with open(output_file, 'w', encoding='utf-8') as f:
            f.write(content)

        return output_file

    def simplify_byte_arrays(self, content):
        """简化字节数组初始化"""
        # 匹配模式：byte[] var = new byte[N]; var[0]=...; var[1]=...;
        pattern = r'byte\[\]\s+(\w+)\s*=\s*new\s+byte\[(\d+)\];((?:\s+\1\[\d+\]\s*=\s*-?\d+;)+)'

        def replace_array(match):
            var_name = match.group(1)
            size = int(match.group(2))
            assignments = match.group(3)

            # 提取所有赋值
            values = re.findall(rf'{var_name}\[(\d+)\]\s*=\s*(-?\d+);', assignments)

            if len(values) != size:
                return match.group(0)

            # 排序并生成数组
            values.sort(key=lambda x: int(x[0]))
            bytes_str = ', '.join(v[1] for v in values)

            return f'byte[] {var_name} = new byte[]{{{bytes_str}}};'

        return re.sub(pattern, replace_array, content, flags=re.MULTILINE)

    def process_all_files(self, sources_dir, output_dir):
        """处理所有Java文件"""
        count = 0
        errors = 0

        # 创建包结构
        print("创建新的包结构...")
        self.create_package_structure(output_dir)

        print("\n开始完全反混淆所有文件...\n")
        print("=" * 70)

        for root, dirs, files in os.walk(sources_dir):
            for file in files:
                if not file.endswith('.java'):
                    continue

                file_path = os.path.join(root, file)

                # 检查是否是混淆文件
                pkg_name = os.path.basename(root)
                if pkg_name not in self.package_mappings and not re.match(r'^[IlL1]+$', pkg_name):
                    # 跳过清晰命名的文件（c13.nim5等）
                    continue

                try:
                    output_path = self.deobfuscate_file_completely(file_path, output_dir)
                    if output_path:
                        count += 1
                except Exception as e:
                    print(f"\n错误: {file_path}")
                    print(f"  {e}")
                    errors += 1

        return count, errors

def main():
    print("=" * 70)
    print("完整的Java反混淆工具")
    print("=" * 70)
    print("\n反混淆顺序:")
    print("  1. 包名/文件夹重组")
    print("  2. 类名/文件名重命名")
    print("  3. 方法名重命名")
    print("  4. 变量名改进")
    print("  5. 字符串解密")
    print("\n" + "=" * 70)

    sourcemap_path = '/home/user/nova/sourcemap.json'
    sources_dir = '/home/user/nova/sources'
    output_dir = '/home/user/nova'

    deobf = CompleteDeobfuscator(sourcemap_path)

    count, errors = deobf.process_all_files(sources_dir, output_dir)

    print("\n" + "=" * 70)
    print(f"\n完成!")
    print(f"  ✓ 成功处理: {count} 个文件")
    print(f"  ✗ 错误: {errors} 个")
    print(f"\n输出目录: {output_dir}/fully_deobfuscated/")
    print("\n新的包结构:")
    print("  com/")
    print("    ├── webview/          # WebView Hook和监控")
    print("    ├── crypto/           # 字符串加解密")
    print("    ├── websocket/        # WebSocket通信")
    print("    │   └── extensions/   # 压缩扩展")
    print("    ├── frame/            # 帧处理")
    print("    ├── client/           # 客户端")
    print("    └── util/             # 工具类")
    print("=" * 70)

if __name__ == '__main__':
    main()
