#!/usr/bin/env python3
"""
增强版Java反混淆工具
- 解密字符串常量
- 推断方法语义化名称
- 简化代码结构
- 添加功能注释
"""

import os
import re
import json
from pathlib import Path
from collections import defaultdict

class EnhancedDeobfuscator:
    def __init__(self, sourcemap_path):
        """加载sourcemap"""
        with open(sourcemap_path, 'r', encoding='utf-8') as f:
            self.sourcemap = json.load(f)

        # 构建映射表
        self.build_mappings()

    def build_mappings(self):
        """构建映射表"""
        self.field_mappings = defaultdict(dict)
        for class_name, fields in self.sourcemap['fields'].items():
            for obf_name, mapping in fields.items():
                self.field_mappings[class_name][obf_name] = mapping['original']

    def xor_decrypt(self, encrypted_bytes, key_bytes):
        """XOR解密字符串"""
        try:
            result = []
            for i, byte in enumerate(encrypted_bytes):
                result.append(byte ^ key_bytes[i % len(key_bytes)])
            return bytes(result).decode('utf-8', errors='ignore')
        except:
            return None

    def parse_byte_array(self, code_snippet):
        """从代码中解析字节数组"""
        try:
            # 查找 new byte[]{...} 模式
            match = re.search(r'new\s+byte\[\]\s*\{([^}]+)\}', code_snippet)
            if match:
                bytes_str = match.group(1)
                # 解析每个字节
                bytes_list = []
                for b in bytes_str.split(','):
                    b = b.strip()
                    if b:
                        bytes_list.append(int(b) & 0xFF)
                return bytes_list
        except:
            pass
        return None

    def decrypt_string_calls(self, content):
        """解密代码中的字符串调用"""
        # 查找所有的字符串解密调用
        # 格式: IllIIlIIII1.llllIIIIll1(new byte[]{...}, new byte[]{...})
        pattern = r'(\w+\.\w+\.)?llllIIIIll1\s*\(\s*new\s+byte\[\]\s*\{([^}]+)\}\s*,\s*new\s+byte\[\]\s*\{([^}]+)\}\s*\)'

        replacements = []
        for match in re.finditer(pattern, content):
            full_match = match.group(0)
            encrypted_str = match.group(2)
            key_str = match.group(3)

            # 解析字节数组
            encrypted = self.parse_byte_array(f'new byte[]{{{encrypted_str}}}')
            key = self.parse_byte_array(f'new byte[]{{{key_str}}}')

            if encrypted and key:
                decrypted = self.xor_decrypt(encrypted, key)
                if decrypted:
                    # 替换为解密后的字符串
                    replacements.append((full_match, f'"{decrypted}"'))

        # 执行替换
        for old, new in replacements:
            content = content.replace(old, new)

        return content, len(replacements)

    def infer_method_name(self, method_def, class_context, content):
        """推断方法的语义化名称"""
        # 提取方法名
        method_match = re.search(r'(public|private|protected)?\s*(static)?\s*(\w+(?:<[^>]+>)?(?:\[\])?)\s+(\w+)\s*\(', method_def)
        if not method_match:
            return method_def

        visibility = method_match.group(1) or ''
        is_static = method_match.group(2) or ''
        return_type = method_match.group(3)
        method_name = method_match.group(4)

        # 如果不是混淆名称，保持不变
        if not re.match(r'^[IlL1]+$', method_name):
            return method_def

        # 根据返回类型和内容推断名称
        new_name = None

        # 检查方法体内容
        method_body = self.extract_method_body(content, method_name)

        if 'WebView' in method_body:
            if 'getWebViewClassLoader' in method_body:
                new_name = 'getWebViewClassLoader'
            elif 'getDeclaredMethod' in method_body:
                new_name = 'getWebViewProvider'
            elif 'InvocationHandler' in method_body:
                new_name = 'getWebViewHandler'
            elif 'setAccessible' in method_body:
                new_name = 'enableWebViewDebugging'

        if 'VirtualDisplay' in method_body:
            if 'createVirtualDisplay' in method_body:
                new_name = 'createVirtualDisplay'
            elif 'acquireLatestImage' in method_body:
                new_name = 'captureScreen'
            elif 'ImageReader' in method_body:
                new_name = 'setupImageReader'

        if 'Deflater' in method_body or 'Inflater' in method_body:
            if 'deflate' in method_body:
                new_name = 'compressFrame'
            elif 'inflate' in method_body:
                new_name = 'decompressFrame'

        # 基于返回类型的推断
        if return_type == 'boolean':
            if not new_name:
                new_name = f'is{method_name.capitalize()}'
        elif return_type == 'void':
            if 'set' in method_def.lower():
                new_name = f'set{method_name.capitalize()}'

        if not new_name:
            new_name = f'method_{method_name}'

        # 替换方法名
        new_def = method_def.replace(f' {method_name}(', f' {new_name}(')
        return new_def

    def extract_method_body(self, content, method_name):
        """提取方法体内容"""
        # 简单提取：查找方法名后的内容
        pattern = f'{method_name}\\s*\\([^)]*\\)\\s*{{([^}}]{{0,500}})'
        match = re.search(pattern, content)
        if match:
            return match.group(1)
        return ''

    def add_documentation(self, content, class_name):
        """添加文档注释"""
        docs = []

        if 'WebView' in content and 'reflect' in content.lower():
            docs.append('/**')
            docs.append(' * WebView Hook工具类')
            docs.append(' * 通过反射访问WebView内部API')
            docs.append(' * 功能：检测和控制开发者工具')
            docs.append(' */')

        elif 'VirtualDisplay' in content and 'ImageReader' in content:
            docs.append('/**')
            docs.append(' * 屏幕捕获工具类')
            docs.append(' * 使用VirtualDisplay进行屏幕截图')
            docs.append(' * 可用于WebView内容捕获')
            docs.append(' */')

        elif 'Deflater' in content and 'Inflater' in content:
            docs.append('/**')
            docs.append(' * WebSocket压缩扩展')
            docs.append(' * 实现permessage-deflate协议')
            docs.append(' * 用于压缩WebSocket消息帧')
            docs.append(' */')

        elif 'XOR' in content or 'decrypt' in content.lower():
            docs.append('/**')
            docs.append(' * 字符串解密工具')
            docs.append(' * 使用XOR算法解密字符串常量')
            docs.append(' */')

        if docs:
            # 在类定义前插入
            class_pattern = r'(/\*[^*]*\*/\s*)?(public\s+class\s+\w+)'
            content = re.sub(class_pattern, '\n'.join(docs) + '\n\\2', content)

        return content

    def simplify_code(self, content):
        """简化代码结构"""
        # 简化字节数组初始化
        # 将多行的 bArr[0] = xx; bArr[1] = yy; 转换为 new byte[]{xx, yy, ...}

        # 查找字节数组初始化模式
        byte_array_pattern = r'byte\[\]\s+(\w+)\s*=\s*new\s+byte\[(\d+)\];((?:\s+\1\[\d+\]\s*=\s*-?\d+;)+)'

        def simplify_byte_array(match):
            var_name = match.group(1)
            size = match.group(2)
            assignments = match.group(3)

            # 提取所有赋值
            values = re.findall(rf'{var_name}\[(\d+)\]\s*=\s*(-?\d+);', assignments)
            if len(values) != int(size):
                return match.group(0)  # 保持原样

            # 排序并生成新数组
            values.sort(key=lambda x: int(x[0]))
            bytes_str = ', '.join(v[1] for v in values)

            return f'byte[] {var_name} = new byte[]{{{bytes_str}}};'

        content = re.sub(byte_array_pattern, simplify_byte_array, content, flags=re.MULTILINE)

        return content

    def deep_deobfuscate_file(self, file_path, output_dir):
        """深度反混淆单个文件"""
        try:
            with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
        except Exception as e:
            print(f"Error reading {file_path}: {e}")
            return None

        # 提取包名和类名
        package_match = re.search(r'package\s+([\w.]+);', content)
        class_match = re.search(r'public\s+(?:class|interface|enum)\s+(\w+)', content)

        if not package_match or not class_match:
            return None

        original_package = package_match.group(1)
        original_class = class_match.group(1)
        class_context = f"{original_package}.{original_class}"

        print(f"处理: {class_context}")

        # 1. 解密字符串
        content, decrypt_count = self.decrypt_string_calls(content)
        if decrypt_count > 0:
            print(f"  - 解密了 {decrypt_count} 个字符串")

        # 2. 简化代码结构
        content = self.simplify_code(content)

        # 3. 推断并重命名方法
        method_pattern = r'(public|private|protected)?\s*(static)?\s*\w+(?:<[^>]+>)?(?:\[\])?\s+\w+\s*\([^)]*\)\s*(?:throws[^{]+)?{'
        methods = re.finditer(method_pattern, content)
        method_renames = 0

        for match in methods:
            method_def = match.group(0)
            new_def = self.infer_method_name(method_def, class_context, content)
            if new_def != method_def:
                content = content.replace(method_def, new_def)
                method_renames += 1

        if method_renames > 0:
            print(f"  - 重命名了 {method_renames} 个方法")

        # 4. 添加文档注释
        content = self.add_documentation(content, original_class)

        # 5. 改进字段名
        if class_context in self.field_mappings:
            for obf_field in self.field_mappings[class_context]:
                # 给字段添加更好的命名
                better_name = self.get_better_field_name(obf_field, content)
                if better_name:
                    content = re.sub(r'\b' + re.escape(obf_field) + r'\b', better_name, content)

        # 生成输出路径
        rel_path = os.path.relpath(file_path, '/home/user/nova/sources')
        output_path = os.path.join(output_dir, 'enhanced_deobfuscated', rel_path)

        os.makedirs(os.path.dirname(output_path), exist_ok=True)

        # 添加文件头注释
        header = f'''/**
 * 深度反混淆的Java类
 * 原始类: {class_context}
 *
 * 反混淆处理:
 * - 解密字符串常量
 * - 推断方法语义化名称
 * - 简化代码结构
 * - 添加功能注释
 */

'''

        with open(output_path, 'w', encoding='utf-8') as f:
            f.write(header + content)

        return output_path

    def get_better_field_name(self, obf_field, content):
        """获取更好的字段名"""
        # 基于类型和用法推断
        if 'WebView' in content and obf_field.startswith('f'):
            if 'VirtualDisplay' in content:
                return 'virtualDisplay'
            elif 'ImageReader' in content:
                return 'imageReader'
            elif 'Bitmap' in content:
                return 'capturedBitmap'

        if 'Deflater' in content and 'deflater' not in obf_field.lower():
            if 'Deflater' in content[max(0, content.find(obf_field)-100):content.find(obf_field)+100]:
                return 'deflater'

        if 'Inflater' in content and 'inflater' not in obf_field.lower():
            if 'Inflater' in content[max(0, content.find(obf_field)-100):content.find(obf_field)+100]:
                return 'inflater'

        return None

    def process_all(self, sources_dir, output_dir):
        """处理所有文件"""
        count = 0
        errors = 0

        # 只处理关键的混淆文件
        key_packages = ['IIIlIllIlI1', 'IllllIllllll1', 'IlIlllIIlI1']

        for root, dirs, files in os.walk(sources_dir):
            # 检查是否是关键包
            pkg_name = os.path.basename(root)
            if pkg_name not in key_packages:
                continue

            for file in files:
                if not file.endswith('.java'):
                    continue

                file_path = os.path.join(root, file)

                try:
                    output_path = self.deep_deobfuscate_file(file_path, output_dir)
                    if output_path:
                        count += 1
                except Exception as e:
                    print(f"错误处理 {file_path}: {e}")
                    errors += 1

        return count, errors

def main():
    print("="*70)
    print("增强版Java反混淆工具")
    print("="*70)
    print()

    sourcemap_path = '/home/user/nova/sourcemap.json'
    sources_dir = '/home/user/nova/sources'
    output_dir = '/home/user/nova'

    deobf = EnhancedDeobfuscator(sourcemap_path)

    print("开始深度反混淆关键文件...")
    print()

    count, errors = deobf.process_all(sources_dir, output_dir)

    print()
    print("="*70)
    print(f"完成! 成功处理 {count} 个文件，错误 {errors} 个")
    print(f"输出目录: {output_dir}/enhanced_deobfuscated/")
    print("="*70)

if __name__ == '__main__':
    main()
