"""Ping message for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class Ping:
    """
    Represents a ping message in the WebRTC signaling protocol.
    Used for keep-alive and connection health checks.
    """

    message: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'Ping':
        """
        Create a Ping instance from a dictionary.

        Args:
            data: Dictionary containing the ping data

        Returns:
            A new Ping instance
        """
        return Ping(
            message=data.get('message', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this Ping instance to a dictionary.

        Returns:
            Dictionary representation of the Ping
        """
        return {
            'message': self.message
        }
