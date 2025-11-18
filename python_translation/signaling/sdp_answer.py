"""SDP answer for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class SDPAnswer:
    """
    Represents an SDP (Session Description Protocol) answer in the WebRTC signaling protocol.
    This is sent in response to an SDP offer to establish a WebRTC connection.
    """

    type: str = ""
    sdp: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'SDPAnswer':
        """
        Create an SDPAnswer instance from a dictionary.

        Args:
            data: Dictionary containing the SDP answer data

        Returns:
            A new SDPAnswer instance
        """
        return SDPAnswer(
            type=data.get('type', ''),
            sdp=data.get('sdp', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this SDPAnswer instance to a dictionary.

        Returns:
            Dictionary representation of the SDPAnswer
        """
        return {
            'type': self.type,
            'sdp': self.sdp
        }
