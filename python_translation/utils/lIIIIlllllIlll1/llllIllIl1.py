"""
String resolver interface (translated from Java)
Original: lIIIIlllllIlll1/llllIllIl1.java
"""

from __future__ import annotations
from abc import ABC, abstractmethod
from typing import Optional


class llllIllIl1(ABC):
    """
    Interface for string resolution/deobfuscation.
    Provides XOR-based string encryption/decryption.
    Original package: lIIIIlllllIlll1
    """

    @abstractmethod
    def encode(self, data: str, key: bytes) -> bytes:
        """
        Encode string with key.

        Args:
            data: Input string
            key: Encryption key bytes

        Returns:
            Encrypted bytes
        """
        pass

    @abstractmethod
    def decode(self, data: bytes, key: bytes) -> str:
        """
        Decode bytes with key.

        Args:
            data: Encrypted data bytes
            key: Decryption key bytes

        Returns:
            Decrypted string
        """
        pass

    @abstractmethod
    def is_valid(self, data: str) -> bool:
        """
        Check if data is valid.

        Args:
            data: Data string to check

        Returns:
            True if valid
        """
        pass

    # Legacy method names for Java compatibility
    def llllIIIIll1(self, *args, **kwargs):
        """Legacy method name - dispatches to appropriate method based on arguments."""
        if len(args) == 2:
            if isinstance(args[0], str):
                return self.encode(args[0], args[1])
            else:
                return self.decode(args[0], args[1])
        elif len(args) == 1:
            return self.is_valid(args[0])
        else:
            raise ValueError("Invalid arguments for llllIIIIll1")
