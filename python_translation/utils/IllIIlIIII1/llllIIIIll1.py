"""
XOR-based string resolver implementation (translated from Java)
Original: IllIIlIIII1/llllIIIIll1.java
"""

from __future__ import annotations
from typing import Optional
import sys
import os

# Add parent directory to path for imports
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from lIIIIlllllIlll1.llllIllIl1 import llllIllIl1


class llllIIIIll1(llllIllIl1):
    """
    XOR-based string encryption/decryption implementation.
    This is the CORE STRING DEOBFUSCATOR used throughout the application.

    Implements a simple XOR cipher that repeatedly applies the key bytes
    to the data bytes using XOR operation.

    Original package: IllIIlIIII1
    """

    @staticmethod
    def lIIIIlllllIlll1(data: bytes, key: bytes) -> bytes:
        """
        Apply XOR cipher to data using key (repeating key if necessary).

        Args:
            data: Data bytes to encrypt/decrypt
            key: Key bytes to use for XOR operation

        Returns:
            XOR'd bytes (modifies data in-place and returns it)
        """
        data_len = len(data)
        key_len = len(key)
        i = 0
        i2 = 0

        # Create mutable bytearray
        result = bytearray(data)

        while i < data_len:
            if i2 >= key_len:
                i2 = 0
            result[i] = result[i] ^ key[i2]
            i += 1
            i2 += 1

        return bytes(result)

    def encode(self, data: str, key: bytes) -> bytes:
        """
        Encode string with key using XOR.

        Args:
            data: Input string
            key: Encryption key bytes

        Returns:
            Encrypted bytes
        """
        return self.lIIIIlllllIlll1(data.encode('utf-8'), key)

    def decode(self, data: bytes, key: bytes) -> str:
        """
        Decode bytes with key using XOR.

        Args:
            data: Encrypted data bytes
            key: Decryption key bytes

        Returns:
            Decrypted string
        """
        decrypted = self.lIIIIlllllIlll1(data, key)
        return decrypted.decode('utf-8')

    def is_valid(self, data: str) -> bool:
        """
        Check if data is valid (always returns True in this implementation).

        Args:
            data: Data string to check

        Returns:
            True (always valid)
        """
        return True

    # Java compatibility methods
    def llllIIIIll1(self, *args, **kwargs):
        """Legacy method name for Java compatibility."""
        if len(args) == 2:
            if isinstance(args[0], str):
                return self.encode(args[0], args[1])
            else:
                return self.decode(args[0], args[1])
        elif len(args) == 1:
            return self.is_valid(args[0])
        else:
            raise ValueError("Invalid arguments for llllIIIIll1")


# Create singleton instance for global access
# This matches the Java pattern: IllIIlIIII1.f239llllIIIIll1
f239llllIIIIll1 = llllIIIIll1()
