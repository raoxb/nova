"""Error message for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class Error:
    """
    Represents an error message in the WebRTC signaling protocol.
    Contains an error code and descriptive message.
    """

    code: int = -1
    message: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'Error':
        """
        Create an Error instance from a dictionary.

        Args:
            data: Dictionary containing the error data

        Returns:
            A new Error instance
        """
        return Error(
            code=data.get('code', -1),
            message=data.get('message', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this Error instance to a dictionary.

        Returns:
            Dictionary representation of the Error
        """
        return {
            'code': self.code,
            'message': self.message
        }
