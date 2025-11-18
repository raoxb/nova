"""
Obfuscated String Resolver - Main entry point for string deobfuscation
Original: string_resolver/ObfuscatedStringResolver.java
"""

from __future__ import annotations
from typing import Optional
import sys
import os

# Add utils directory to path
sys.path.insert(0, os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'utils'))

from IllIIlIIII1.llllIIIIll1 import llllIIIIll1


class ObfuscatedStringResolver:
    """
    Main string deobfuscator class.

    This is the CRITICAL STRING DEOBFUSCATOR used throughout the application.
    It uses XOR-based decryption to decode obfuscated strings.

    Usage:
        result = ObfuscatedStringResolver.resolve(encrypted_bytes, key_bytes)

    Original package: string_resolver
    """

    # Singleton instance of the string resolver
    INSTANCE: 'StringResolverInstance' = None

    class StringResolverInstance:
        """
        Inner class that provides the actual string resolution functionality.
        """

        def __init__(self):
            """Initialize the string resolver instance."""
            self._resolver = llllIIIIll1()

        def resolve(self, data: bytes, key: bytes) -> str:
            """
            Resolve (decrypt) an obfuscated string.

            Args:
                data: Encrypted data bytes
                key: Decryption key bytes

            Returns:
                Decrypted string

            Example:
                # Decrypt a string
                encrypted = bytes([53, 29, 39, 91])
                key = bytes([71, 104, 73, 20])
                result = resolver.resolve(encrypted, key)
            """
            return self._resolver.decode(data, key)

        def llllIIIIll1(self, data: bytes, key: bytes) -> str:
            """Legacy method name for Java compatibility."""
            return self.resolve(data, key)

    @staticmethod
    def resolve(data: bytes, key: bytes) -> str:
        """
        Static method to resolve obfuscated strings.

        Args:
            data: Encrypted data bytes
            key: Decryption key bytes

        Returns:
            Decrypted string

        Example:
            # Decrypt using static method
            result = ObfuscatedStringResolver.resolve(encrypted_bytes, key_bytes)
        """
        return ObfuscatedStringResolver.INSTANCE.resolve(data, key)


# Initialize the singleton instance
ObfuscatedStringResolver.INSTANCE = ObfuscatedStringResolver.StringResolverInstance()


def resolve(data: bytes, key: bytes) -> str:
    """
    Convenience function for string resolution.

    Args:
        data: Encrypted data bytes
        key: Decryption key bytes

    Returns:
        Decrypted string
    """
    return ObfuscatedStringResolver.resolve(data, key)
