"""Pong message for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class Pong:
    """
    Represents a pong message in the WebRTC signaling protocol.
    Used as a response to ping messages for keep-alive and connection health checks.
    """

    message: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'Pong':
        """
        Create a Pong instance from a dictionary.

        Args:
            data: Dictionary containing the pong data

        Returns:
            A new Pong instance
        """
        return Pong(
            message=data.get('message', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this Pong instance to a dictionary.

        Returns:
            Dictionary representation of the Pong
        """
        return {
            'message': self.message
        }
