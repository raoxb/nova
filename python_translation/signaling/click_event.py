"""Click event for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class ClickEvent:
    """
    Represents a click event in the WebRTC signaling protocol.
    Contains normalized coordinates (0.0 to 1.0) for the click position.
    """

    normalized_x: float = 0.0
    normalized_y: float = 0.0

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'ClickEvent':
        """
        Create a ClickEvent instance from a dictionary.

        Args:
            data: Dictionary containing the click event data

        Returns:
            A new ClickEvent instance
        """
        return ClickEvent(
            normalized_x=data.get('normalizedX', 0.0),
            normalized_y=data.get('normalizedY', 0.0)
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this ClickEvent instance to a dictionary.

        Returns:
            Dictionary representation of the ClickEvent
        """
        return {
            'normalizedX': self.normalized_x,
            'normalizedY': self.normalized_y
        }
