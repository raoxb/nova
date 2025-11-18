"""
Vector2 Python Translation

Original Java file: sources/c13/nim5/ez8/h5_proto/Vector2.java
Package: c13.nim5.ez8.h5_proto

This module provides a 2D vector class with serialization support.
"""

from dataclasses import dataclass, field
from typing import Optional, Dict, Any


@dataclass
class Vector2:
    """
    2D Vector class representing x and y coordinates.

    Attributes:
        x: X coordinate (Long/int)
        y: Y coordinate (Long/int)
    """
    x: Optional[int] = 0
    y: Optional[int] = 0

    def __post_init__(self):
        """Initialize default values."""
        if self.x is None:
            self.x = 0
        if self.y is None:
            self.y = 0

    @staticmethod
    def from_json_object(json_obj: Dict[str, Any]) -> 'Vector2':
        """
        Create a Vector2 instance from a JSON object (dict).

        Args:
            json_obj: Dictionary containing 'x' and 'y' keys

        Returns:
            Vector2 instance

        Raises:
            ValueError: If JSON parsing fails
        """
        vector2 = Vector2()

        # Note: Original Java code uses obfuscated string keys
        # The decrypted keys are likely "x" and "y"
        if 'x' in json_obj and json_obj['x'] is not None:
            vector2.x = int(json_obj['x'])

        if 'y' in json_obj and json_obj['y'] is not None:
            vector2.y = int(json_obj['y'])

        return vector2

    def get_x(self) -> Optional[int]:
        """Get X coordinate."""
        return self.x

    def set_x(self, x: Optional[int]) -> None:
        """Set X coordinate."""
        self.x = x

    def get_y(self) -> Optional[int]:
        """Get Y coordinate."""
        return self.y

    def set_y(self, y: Optional[int]) -> None:
        """Set Y coordinate."""
        self.y = y

    def __str__(self) -> str:
        """
        String representation of the Vector2.

        Returns:
            String in format "Vector2{x=..., y=...}"
        """
        return f"Vector2{{x={self.x}, y={self.y}}}"

    def to_json_object(self) -> Dict[str, Any]:
        """
        Convert Vector2 to a JSON object (dict).

        Returns:
            Dictionary representation of the vector
        """
        return {
            'x': self.x,
            'y': self.y
        }


# Example usage and test
if __name__ == "__main__":
    # Test creation
    v1 = Vector2()
    print(f"Default vector: {v1}")

    # Test with values
    v2 = Vector2(x=10, y=20)
    print(f"Vector with values: {v2}")

    # Test JSON serialization
    json_data = v2.to_json_object()
    print(f"JSON representation: {json_data}")

    # Test JSON deserialization
    v3 = Vector2.from_json_object(json_data)
    print(f"Vector from JSON: {v3}")

    # Test getters/setters
    v3.set_x(100)
    v3.set_y(200)
    print(f"After setters: {v3}")
    print(f"X: {v3.get_x()}, Y: {v3.get_y()}")
