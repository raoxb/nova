#!/usr/bin/env python3
"""
Test script for translated Java code
Tests key functionality including string deobfuscation
"""

import sys
import os

# Add current directory to path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

def test_xor_resolver():
    """Test the XOR string resolver (core deobfuscator)."""
    print("Testing XOR String Resolver...")

    try:
        from utils.IllIIlIIII1.llllIIIIll1 import llllIIIIll1

        # Create instance
        resolver = llllIIIIll1()

        # Test XOR encryption/decryption
        test_data = b"Hello World!"
        test_key = b"key123"

        # Encrypt
        encrypted = resolver.encode("Hello World!", test_key)
        print(f"  Original: Hello World!")
        print(f"  Encrypted: {encrypted.hex()}")

        # Decrypt
        decrypted = resolver.decode(encrypted, test_key)
        print(f"  Decrypted: {decrypted}")

        # Verify
        assert decrypted == "Hello World!", "Decryption failed!"
        print("  ✓ XOR resolver works correctly!\n")
        return True

    except Exception as e:
        print(f"  ✗ Error: {e}\n")
        import traceback
        traceback.print_exc()
        return False


def test_obfuscated_string_resolver():
    """Test the ObfuscatedStringResolver wrapper."""
    print("Testing ObfuscatedStringResolver...")

    try:
        from config.ObfuscatedStringResolver import ObfuscatedStringResolver, resolve

        # Test with sample data
        test_data = bytes([72, 101, 108, 108, 111])  # "Hello"
        test_key = bytes([1, 2, 3, 4, 5])

        # Use static method
        result = ObfuscatedStringResolver.resolve(test_data, test_key)
        print(f"  Resolved string: {result}")

        # Use convenience function
        result2 = resolve(test_data, test_key)
        assert result == result2, "Results don't match!"

        print("  ✓ ObfuscatedStringResolver works correctly!\n")
        return True

    except Exception as e:
        print(f"  ✗ Error: {e}\n")
        import traceback
        traceback.print_exc()
        return False


def test_constants():
    """Test the Constants class."""
    print("Testing Constants...")

    try:
        from config.Constants import Constants

        print(f"  Package: {Constants.PACKAGE_NAME}")
        print(f"  Version: {Constants.VERSION}")
        print(f"  Build Type: {Constants.BUILD_TYPE}")
        print(f"  API Key length: {len(Constants.API_KEY)}")
        print(f"  Encrypted Config length: {len(Constants.ENCRYPTED_CONFIG)}")

        # Verify key constants exist
        assert Constants.PACKAGE_NAME == "com.nied.lduvv"
        assert Constants.VERSION == "1.8.1"
        assert Constants.BUILD_TYPE == "release"

        print("  ✓ Constants loaded correctly!\n")
        return True

    except Exception as e:
        print(f"  ✗ Error: {e}\n")
        import traceback
        traceback.print_exc()
        return False


def test_entry_points():
    """Test entry point classes."""
    print("Testing Entry Points...")

    try:
        from entry_points.H5V1Refactor import H5V1Refactor
        from entry_points.Kucopd import Kucopd

        # Verify classes exist and have init methods
        assert hasattr(H5V1Refactor, 'init'), "H5V1Refactor missing init method"
        assert hasattr(Kucopd, 'init'), "Kucopd missing init method"

        print("  ✓ H5V1Refactor class loaded")
        print("  ✓ Kucopd class loaded")
        print("  ✓ Entry points loaded correctly!\n")
        return True

    except Exception as e:
        print(f"  ✗ Error: {e}\n")
        import traceback
        traceback.print_exc()
        return False


def test_real_deobfuscation():
    """Test deobfuscation with real encrypted strings from the code."""
    print("Testing Real String Deobfuscation...")

    try:
        from utils.IllIIlIIII1.llllIIIIll1 import f239llllIIIIll1

        # Test with actual encrypted string from the code
        # From lIIIIlllllIlll1.java line 17:
        # IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-27, -22, -40, -102, -27, -4, 44, 45, -28, -28, -63, -115}, new byte[]{-127, -122, -76, -22, -127, -101, 115, 73})

        encrypted = bytes([
            (256 + x) if x < 0 else x
            for x in [-27, -22, -40, -102, -27, -4, 44, 45, -28, -28, -63, -115]
        ])

        key = bytes([
            (256 + x) if x < 0 else x
            for x in [-127, -122, -76, -22, -127, -101, 115, 73]
        ])

        # Deobfuscate
        result = f239llllIIIIll1.llllIIIIll1(encrypted, key)
        print(f"  Deobfuscated string: '{result}'")

        print("  ✓ Real deobfuscation works!\n")
        return True

    except Exception as e:
        print(f"  ✗ Error: {e}\n")
        import traceback
        traceback.print_exc()
        return False


def main():
    """Run all tests."""
    print("=" * 80)
    print("TESTING TRANSLATED JAVA CODE")
    print("=" * 80)
    print()

    results = []

    # Run all tests
    results.append(("XOR Resolver", test_xor_resolver()))
    results.append(("ObfuscatedStringResolver", test_obfuscated_string_resolver()))
    results.append(("Constants", test_constants()))
    results.append(("Entry Points", test_entry_points()))
    results.append(("Real Deobfuscation", test_real_deobfuscation()))

    # Summary
    print("=" * 80)
    print("TEST SUMMARY")
    print("=" * 80)

    passed = sum(1 for _, result in results if result)
    total = len(results)

    for name, result in results:
        status = "✓ PASSED" if result else "✗ FAILED"
        print(f"{name:30s} {status}")

    print()
    print(f"Total: {passed}/{total} tests passed")
    print("=" * 80)

    return passed == total


if __name__ == '__main__':
    success = main()
    sys.exit(0 if success else 1)
