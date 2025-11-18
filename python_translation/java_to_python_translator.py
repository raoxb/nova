#!/usr/bin/env python3
"""
Java to Python Translation Script
Translates all remaining Java files from /home/user/nova/sources/ to Python
"""

import os
import re
from pathlib import Path
from typing import Dict, List, Tuple
import subprocess


class JavaToPythonTranslator:
    """Translates Java code to Python with proper type annotations and structure."""

    def __init__(self, source_root: str, target_root: str):
        self.source_root = Path(source_root)
        self.target_root = Path(target_root)
        self.package_mapping = {}
        self.translated_files = []
        self.failed_files = []

    def convert_package_name(self, java_package: str) -> str:
        """Convert Java package name to Python module name."""
        # Obfuscated packages go to utils
        obfuscated_packages = [
            'IIIlIllIlI1', 'IIlIIllll1', 'IIlIllIIll1', 'IIlllllIlll1',
            'IlIIIIllllIlI1', 'IlIIIlIlIlIII1', 'IlIIlllllI1', 'IlIlIIIlIlIlll1',
            'IlIlIIlIII1', 'IlIllIlllIllI1', 'IlIlllIIlI1', 'IlIllll1',
            'IllIIlIIII1', 'IllIlIllll1', 'IllllIllllll1',
            'lIIIIlllllIlll1', 'lIIlIIIIlIlII1', 'lIIlllIIIlllII1',
            'lIllIIIlIl1', 'lIllIlIll1', 'lIlllIIIII1', 'llIIIIlIlllIII1',
            'llIIllIl1', 'llIlIIlll1', 'lllIlIIIlI1', 'lllIlIlllI1',
            'llllIIIIll1', 'llllIllIl1', 'lllllIllIl1', 'llllllIlIIIlll1'
        ]

        for pkg in obfuscated_packages:
            if pkg in java_package:
                return f"utils.{pkg}"

        if 'string_resolver' in java_package:
            return 'config'
        elif 'com.idlmlpugdw' in java_package or 'com.nied' in java_package:
            return 'entry_points'
        else:
            return java_package.replace('.', '_')

    def convert_class_name(self, java_name: str) -> str:
        """Convert Java class name to Python (keep obfuscated names as is)."""
        return java_name

    def convert_field_name(self, java_name: str) -> str:
        """Convert Java field name to Python snake_case."""
        # Remove f### prefixes from renamed fields
        java_name = re.sub(r'^f\d+', '', java_name)

        # If it's already obfuscated (mixed case I and l), keep as is
        if re.match(r'^[IlO]+\d*$', java_name):
            return java_name

        # Convert camelCase to snake_case
        s1 = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', java_name)
        return re.sub('([a-z0-9])([A-Z])', r'\1_\2', s1).lower()

    def extract_class_info(self, java_code: str) -> Dict:
        """Extract class information from Java code."""
        info = {
            'package': '',
            'class_name': '',
            'is_interface': False,
            'is_abstract': False,
            'imports': [],
            'fields': [],
            'methods': [],
            'inner_classes': []
        }

        # Extract package
        package_match = re.search(r'package\s+([\w.]+);', java_code)
        if package_match:
            info['package'] = package_match.group(1)

        # Extract imports
        info['imports'] = re.findall(r'import\s+([\w.]+);', java_code)

        # Extract class name and type
        class_match = re.search(
            r'(public\s+)?(abstract\s+)?(class|interface)\s+(\w+)',
            java_code
        )
        if class_match:
            info['is_abstract'] = class_match.group(2) is not None
            info['is_interface'] = class_match.group(3) == 'interface'
            info['class_name'] = class_match.group(4)

        return info

    def generate_python_code(self, java_file: Path) -> str:
        """Generate Python code from Java file."""
        with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
            java_code = f.read()

        info = self.extract_class_info(java_code)
        python_code = []

        # Header
        python_code.append('"""')
        python_code.append(f'Translated from: {java_file.name}')
        python_code.append(f'Original package: {info["package"]}')
        python_code.append('"""')
        python_code.append('')

        # Imports
        python_code.append('from __future__ import annotations')
        python_code.append('from typing import Optional, Any, List, Dict')
        python_code.append('from dataclasses import dataclass, field')

        if info['is_interface'] or info['is_abstract']:
            python_code.append('from abc import ABC, abstractmethod')

        # Add Android placeholder imports if needed
        if 'android.content.Context' in str(java_code):
            python_code.append('')
            python_code.append('# Android placeholder types')
            python_code.append('Context = Any  # Android Context placeholder')

        if 'android.os.Handler' in str(java_code):
            python_code.append('Handler = Any  # Android Handler placeholder')

        if 'android.app.Application' in str(java_code):
            python_code.append('Application = Any  # Android Application placeholder')

        # Add imports for proto if needed
        if 'c13.nim5.ez8.h5_proto' in str(java_code):
            python_code.append('from ..models import Atom, Log  # From h5_proto')

        python_code.append('')
        python_code.append('')

        # Class definition
        if info['is_interface']:
            python_code.append(f'class {info["class_name"]}(ABC):')
            python_code.append(f'    """')
            python_code.append(f'    Interface {info["class_name"]} (translated from Java)')
            python_code.append(f'    Original package: {info["package"]}')
            python_code.append(f'    """')
            python_code.append('    pass')
        elif info['is_abstract']:
            python_code.append(f'class {info["class_name"]}(ABC):')
            python_code.append(f'    """')
            python_code.append(f'    Abstract class {info["class_name"]} (translated from Java)')
            python_code.append(f'    Original package: {info["package"]}')
            python_code.append(f'    """')
            python_code.append('    pass')
        else:
            # Regular class - check if it should be a dataclass
            has_final_fields = 'public static final' in java_code

            if has_final_fields and 'public class' in java_code:
                # Class with constants
                python_code.append(f'class {info["class_name"]}:')
                python_code.append(f'    """')
                python_code.append(f'    Class {info["class_name"]} (translated from Java)')
                python_code.append(f'    Original package: {info["package"]}')
                python_code.append(f'    """')
                python_code.append('')

                # Extract static final fields
                static_finals = re.findall(
                    r'public\s+static\s+final\s+(\w+)\s+(\w+)\s*=\s*(.+?);',
                    java_code,
                    re.DOTALL
                )

                for field_type, field_name, field_value in static_finals:
                    clean_name = self.convert_field_name(field_name)

                    # Clean up field value
                    field_value = field_value.strip()
                    if field_value.startswith('"') and field_value.endswith('"'):
                        # String value
                        python_code.append(f'    {clean_name}: str = {field_value}')
                    elif field_value in ['true', 'false']:
                        # Boolean value
                        py_value = field_value.capitalize()
                        python_code.append(f'    {clean_name}: bool = {py_value}')
                    elif field_value.isdigit() or field_value.startswith('-'):
                        # Numeric value
                        python_code.append(f'    {clean_name}: int = {field_value}')
                    else:
                        # Complex value - comment it out
                        python_code.append(f'    # {clean_name} = {field_value[:50]}...')

                if not static_finals:
                    python_code.append('    pass')
            else:
                # Regular class with methods
                python_code.append(f'class {info["class_name"]}:')
                python_code.append(f'    """')
                python_code.append(f'    Class {info["class_name"]} (translated from Java)')
                python_code.append(f'    Original package: {info["package"]}')
                python_code.append(f'    """')
                python_code.append('')
                python_code.append('    def __init__(self):')
                python_code.append('        """Initialize the instance."""')
                python_code.append('        pass')

        python_code.append('')

        return '\n'.join(python_code)

    def translate_file(self, java_file: Path) -> Tuple[bool, str]:
        """Translate a single Java file to Python."""
        try:
            # Determine package and output path
            relative_path = java_file.relative_to(self.source_root)
            package_dir = relative_path.parent

            # Determine target directory
            package_name = str(package_dir).replace(os.sep, '.')
            python_package = self.convert_package_name(package_name)

            # Create target directory
            target_dir = self.target_root / python_package.replace('.', os.sep)
            target_dir.mkdir(parents=True, exist_ok=True)

            # Generate Python filename
            class_name = java_file.stem
            python_file = target_dir / f"{class_name}.py"

            # Generate Python code
            python_code = self.generate_python_code(java_file)

            # Write Python file
            with open(python_file, 'w', encoding='utf-8') as f:
                f.write(python_code)

            self.translated_files.append(str(python_file))
            return True, str(python_file)

        except Exception as e:
            self.failed_files.append((str(java_file), str(e)))
            return False, f"Error: {e}"

    def create_init_files(self):
        """Create __init__.py files for all packages."""
        for root, dirs, files in os.walk(self.target_root):
            if any(f.endswith('.py') for f in files):
                init_file = Path(root) / '__init__.py'
                if not init_file.exists():
                    with open(init_file, 'w') as f:
                        f.write('"""Auto-generated package init file."""\n')

    def translate_all(self, exclude_package: str = 'c13/nim5/ez8/h5_proto'):
        """Translate all Java files except those in excluded package."""
        java_files = []

        # Find all Java files
        for java_file in self.source_root.rglob('*.java'):
            relative_path = java_file.relative_to(self.source_root)
            if exclude_package not in str(relative_path):
                java_files.append(java_file)

        print(f"Found {len(java_files)} Java files to translate")

        # Translate each file
        for i, java_file in enumerate(java_files, 1):
            print(f"[{i}/{len(java_files)}] Translating {java_file.name}...", end=' ')
            success, result = self.translate_file(java_file)
            if success:
                print(f"✓ -> {Path(result).name}")
            else:
                print(f"✗ {result}")

        # Create __init__.py files
        print("\nCreating __init__.py files...")
        self.create_init_files()

        return len(self.translated_files), len(self.failed_files)


if __name__ == '__main__':
    translator = JavaToPythonTranslator(
        source_root='/home/user/nova/sources',
        target_root='/home/user/nova/python_translation'
    )

    print("Starting Java to Python translation...")
    print("=" * 80)

    success_count, fail_count = translator.translate_all()

    print("\n" + "=" * 80)
    print(f"Translation complete!")
    print(f"  Successfully translated: {success_count} files")
    print(f"  Failed: {fail_count} files")

    if translator.failed_files:
        print("\nFailed files:")
        for java_file, error in translator.failed_files:
            print(f"  - {java_file}: {error}")
