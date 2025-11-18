"""Configuration package."""
from .Constants import Constants
from .ObfuscatedStringResolver import ObfuscatedStringResolver, resolve

__all__ = ['Constants', 'ObfuscatedStringResolver', 'resolve']
