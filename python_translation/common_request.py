"""
CommonRequest Python Translation

Original Java file: sources/c13/nim5/ez8/h5_proto/CommonRequest.java
Package: c13.nim5.ez8.h5_proto

This module provides a common request wrapper class.
"""

from dataclasses import dataclass, field
from typing import Optional, Dict, Any


# Note: Atom class is referenced but not defined in the provided files
# This is a placeholder import - adjust based on your actual Atom implementation
try:
    from atom import Atom
except ImportError:
    # Fallback if Atom is not available
    class Atom:
        """Placeholder Atom class."""
        def __init__(self):
            pass

        @staticmethod
        def from_json_object(json_obj: Dict[str, Any]) -> 'Atom':
            """Create Atom from JSON."""
            return Atom()

        def to_json_object(self) -> Dict[str, Any]:
            """Convert Atom to JSON."""
            return {}

        def __str__(self) -> str:
            return "Atom{}"


@dataclass
class CommonRequest:
    """
    Common request wrapper containing an Atom object.

    Attributes:
        atom: Atom object containing request data
    """
    atom: Optional[Atom] = None

    def __post_init__(self):
        """Initialize with default Atom if not provided."""
        if self.atom is None:
            self.atom = Atom()

    @staticmethod
    def from_json_object(json_obj: Dict[str, Any]) -> 'CommonRequest':
        """
        Create a CommonRequest instance from a JSON object (dict).

        Args:
            json_obj: Dictionary containing 'atom' key

        Returns:
            CommonRequest instance

        Raises:
            ValueError: If JSON parsing fails
        """
        common_request = CommonRequest()

        # Note: Original Java code uses obfuscated string key
        # The decrypted key is likely "atom"
        if 'atom' in json_obj and json_obj['atom'] is not None:
            common_request.atom = Atom.from_json_object(json_obj['atom'])

        return common_request

    def get_atom(self) -> Optional[Atom]:
        """Get the Atom object."""
        return self.atom

    def set_atom(self, atom: Optional[Atom]) -> None:
        """Set the Atom object."""
        self.atom = atom

    def __str__(self) -> str:
        """
        String representation of the CommonRequest.

        Returns:
            String in format "CommonRequest{atom=...}"
        """
        return f"CommonRequest{{atom={self.atom}}}"

    def to_json_object(self) -> Dict[str, Any]:
        """
        Convert CommonRequest to a JSON object (dict).

        Returns:
            Dictionary representation of the request
        """
        json_obj = {}
        if self.atom is not None:
            json_obj['atom'] = self.atom.to_json_object()
        return json_obj


# Example usage and test
if __name__ == "__main__":
    # Test creation
    req1 = CommonRequest()
    print(f"Default request: {req1}")

    # Test with Atom
    atom = Atom()
    req2 = CommonRequest(atom=atom)
    print(f"Request with atom: {req2}")

    # Test JSON serialization
    json_data = req2.to_json_object()
    print(f"JSON representation: {json_data}")

    # Test JSON deserialization
    req3 = CommonRequest.from_json_object(json_data)
    print(f"Request from JSON: {req3}")

    # Test getters/setters
    new_atom = Atom()
    req3.set_atom(new_atom)
    print(f"After setter: {req3}")
    print(f"Atom: {req3.get_atom()}")
