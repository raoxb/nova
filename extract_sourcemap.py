#!/usr/bin/env python3
"""
提取Java混淆文件的sourcemap映射
分析注释中的 'renamed from:' 信息并生成映射关系
"""

import os
import re
import json
from pathlib import Path
from collections import defaultdict

def extract_package_from_file(file_path):
    """从Java文件中提取包名"""
    try:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
            for line in f:
                match = re.match(r'^\s*package\s+([\w.]+);', line)
                if match:
                    return match.group(1)
    except Exception as e:
        print(f"Error reading {file_path}: {e}")
    return None

def extract_class_name(file_path):
    """从文件路径提取类名"""
    return Path(file_path).stem

def extract_renamed_mappings(file_path):
    """提取文件中所有的重命名映射"""
    mappings = []
    try:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()

        # 查找所有的 renamed from 注释
        # 格式: /* renamed from: original_name, reason: collision with root package name */
        pattern = r'/\*\s*renamed from:\s*([^,]+),\s*reason:\s*([^*]+)\*/'
        matches = re.finditer(pattern, content)

        for match in matches:
            original_name = match.group(1).strip()
            reason = match.group(2).strip()

            # 查找这个注释后面的字段或方法声明
            # 找到注释位置后的代码
            start_pos = match.end()
            remaining = content[start_pos:start_pos+500]

            # 尝试匹配字段声明
            field_match = re.search(r'public\s+(?:static\s+)?(?:final\s+)?(\w+(?:\[\])?(?:<[^>]+>)?)\s+(\w+)', remaining)
            if field_match:
                obfuscated_name = field_match.group(2)
                mappings.append({
                    'original': original_name,
                    'obfuscated': obfuscated_name,
                    'type': 'field',
                    'reason': reason
                })

        # 查找 loaded from 注释来获取类映射
        loaded_pattern = r'/\*\s*loaded from:\s*[^:]+:([^*]+)\*/'
        loaded_match = re.search(loaded_pattern, content)
        if loaded_match:
            loaded_path = loaded_match.group(1).strip()
            # 将路径转换为包名
            class_path = loaded_path.replace('/', '.').replace('.class', '').replace('.java', '')
            return mappings, class_path

    except Exception as e:
        print(f"Error extracting mappings from {file_path}: {e}")

    return mappings, None

def analyze_sources(sources_dir):
    """分析sources目录下的所有Java文件"""
    sourcemap = {
        'classes': {},
        'packages': {},
        'fields': defaultdict(dict),
        'statistics': {
            'total_files': 0,
            'obfuscated_files': 0,
            'clear_files': 0
        }
    }

    # 遍历所有Java文件
    for root, dirs, files in os.walk(sources_dir):
        for file in files:
            if not file.endswith('.java'):
                continue

            file_path = os.path.join(root, file)
            sourcemap['statistics']['total_files'] += 1

            # 提取包名
            package_name = extract_package_from_file(file_path)
            if not package_name:
                continue

            # 提取类名
            class_name = extract_class_name(file_path)
            full_class = f"{package_name}.{class_name}"

            # 提取重命名映射
            field_mappings, loaded_class_path = extract_renamed_mappings(file_path)

            # 判断是否是混淆文件
            is_obfuscated = bool(re.match(r'^[IlL1]+$', package_name.split('.')[0]))

            if is_obfuscated:
                sourcemap['statistics']['obfuscated_files'] += 1
            else:
                sourcemap['statistics']['clear_files'] += 1

            # 记录类映射
            if loaded_class_path:
                sourcemap['classes'][loaded_class_path] = {
                    'package': package_name,
                    'class': class_name,
                    'full_name': full_class,
                    'file_path': file_path.replace(sources_dir, ''),
                    'is_obfuscated': is_obfuscated
                }

            # 记录字段映射
            if field_mappings:
                for mapping in field_mappings:
                    if full_class not in sourcemap['fields']:
                        sourcemap['fields'][full_class] = {}
                    sourcemap['fields'][full_class][mapping['obfuscated']] = {
                        'original': mapping['original'],
                        'type': mapping['type'],
                        'reason': mapping['reason']
                    }

            # 记录包名（如果是混淆包名）
            if is_obfuscated:
                if package_name not in sourcemap['packages']:
                    sourcemap['packages'][package_name] = {
                        'files': [],
                        'type': 'obfuscated'
                    }
                sourcemap['packages'][package_name]['files'].append(class_name)

    return sourcemap

def infer_package_mappings(sourcemap):
    """根据导入关系和使用模式推断包名映射"""
    # 分析清晰命名的文件中使用的混淆包名
    package_usage = defaultdict(set)

    sources_dir = '/home/user/nova/sources'

    # 遍历所有清晰命名的文件
    for class_path, class_info in sourcemap['classes'].items():
        if not class_info['is_obfuscated']:
            file_path = os.path.join(sources_dir, class_info['file_path'].lstrip('/'))
            try:
                with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()

                # 查找import语句中的混淆包名
                import_pattern = r'import\s+([\w.]+);'
                for match in re.finditer(import_pattern, content):
                    imported = match.group(1)
                    # 检查是否是混淆的包名
                    parts = imported.split('.')
                    if parts and re.match(r'^[IlL1]+$', parts[0]):
                        package_usage[class_info['full_name']].add(imported)
            except Exception as e:
                pass

    sourcemap['package_usage'] = {k: list(v) for k, v in package_usage.items()}
    return sourcemap

def generate_readable_report(sourcemap, output_path):
    """生成人类可读的映射报告"""
    with open(output_path, 'w', encoding='utf-8') as f:
        f.write("=" * 80 + "\n")
        f.write("Java混淆代码 SourceMap 分析报告\n")
        f.write("=" * 80 + "\n\n")

        # 统计信息
        f.write("## 统计信息\n\n")
        stats = sourcemap['statistics']
        f.write(f"总文件数: {stats['total_files']}\n")
        f.write(f"混淆文件数: {stats['obfuscated_files']}\n")
        f.write(f"清晰文件数: {stats['clear_files']}\n\n")

        # 包名映射
        f.write("=" * 80 + "\n")
        f.write("## 混淆包名列表\n\n")
        for package_name, info in sorted(sourcemap['packages'].items()):
            f.write(f"包名: {package_name}\n")
            f.write(f"  类型: {info['type']}\n")
            f.write(f"  包含类: {', '.join(sorted(info['files']))}\n\n")

        # 清晰命名的类
        f.write("=" * 80 + "\n")
        f.write("## 清晰命名的类\n\n")
        for class_path, info in sorted(sourcemap['classes'].items()):
            if not info['is_obfuscated']:
                f.write(f"类: {info['full_name']}\n")
                f.write(f"  文件: {info['file_path']}\n")

                # 显示这个类使用的混淆包
                if info['full_name'] in sourcemap.get('package_usage', {}):
                    imports = sourcemap['package_usage'][info['full_name']]
                    f.write(f"  导入的混淆包:\n")
                    for imp in sorted(imports):
                        f.write(f"    - {imp}\n")
                f.write("\n")

        # 字段映射
        f.write("=" * 80 + "\n")
        f.write("## 字段名称映射 (混淆 -> 原始)\n\n")
        for class_name in sorted(sourcemap['fields'].keys()):
            fields = sourcemap['fields'][class_name]
            if fields:
                f.write(f"类: {class_name}\n")
                for obfuscated, mapping in sorted(fields.items()):
                    f.write(f"  {obfuscated} -> {mapping['original']}\n")
                f.write("\n")

def main():
    sources_dir = '/home/user/nova/sources'

    print("开始分析混淆代码...")
    sourcemap = analyze_sources(sources_dir)

    print("推断包映射关系...")
    sourcemap = infer_package_mappings(sourcemap)

    # 保存JSON格式的完整映射
    json_output = '/home/user/nova/sourcemap.json'
    print(f"保存JSON格式映射到 {json_output}")
    with open(json_output, 'w', encoding='utf-8') as f:
        json.dump(sourcemap, f, indent=2, ensure_ascii=False)

    # 生成人类可读的报告
    report_output = '/home/user/nova/sourcemap_report.txt'
    print(f"生成可读报告到 {report_output}")
    generate_readable_report(sourcemap, report_output)

    print("\n分析完成!")
    print(f"总文件数: {sourcemap['statistics']['total_files']}")
    print(f"混淆文件数: {sourcemap['statistics']['obfuscated_files']}")
    print(f"清晰文件数: {sourcemap['statistics']['clear_files']}")
    print(f"发现字段映射: {sum(len(v) for v in sourcemap['fields'].values())} 个")

if __name__ == '__main__':
    main()
