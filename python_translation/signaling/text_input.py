"""Text input event for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class TextInput:
    """
    Represents a text input event in the WebRTC signaling protocol.
    Used to send text input from the client to the remote session.
    """

    text: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'TextInput':
        """
        Create a TextInput instance from a dictionary.

        Args:
            data: Dictionary containing the text input data

        Returns:
            A new TextInput instance
        """
        return TextInput(
            text=data.get('text', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this TextInput instance to a dictionary.

        Returns:
            Dictionary representation of the TextInput
        """
        return {
            'text': self.text
        }
