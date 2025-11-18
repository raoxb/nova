"""Scroll event for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class ScrollEvent:
    """
    Represents a scroll event in the WebRTC signaling protocol.
    Contains delta values for horizontal and vertical scrolling.
    """

    delta_x: float = 0.0
    delta_y: float = 0.0

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'ScrollEvent':
        """
        Create a ScrollEvent instance from a dictionary.

        Args:
            data: Dictionary containing the scroll event data

        Returns:
            A new ScrollEvent instance
        """
        return ScrollEvent(
            delta_x=data.get('deltaX', 0.0),
            delta_y=data.get('deltaY', 0.0)
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this ScrollEvent instance to a dictionary.

        Returns:
            Dictionary representation of the ScrollEvent
        """
        return {
            'deltaX': self.delta_x,
            'deltaY': self.delta_y
        }
