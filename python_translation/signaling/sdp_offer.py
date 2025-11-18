"""SDP offer for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class SDPOffer:
    """
    Represents an SDP (Session Description Protocol) offer in the WebRTC signaling protocol.
    This is sent to initiate a WebRTC connection negotiation.
    """

    type: str = ""
    sdp: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'SDPOffer':
        """
        Create an SDPOffer instance from a dictionary.

        Args:
            data: Dictionary containing the SDP offer data

        Returns:
            A new SDPOffer instance
        """
        return SDPOffer(
            type=data.get('type', ''),
            sdp=data.get('sdp', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this SDPOffer instance to a dictionary.

        Returns:
            Dictionary representation of the SDPOffer
        """
        return {
            'type': self.type,
            'sdp': self.sdp
        }
