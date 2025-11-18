"""ICE candidate for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class ICECandidate:
    """
    Represents an ICE (Interactive Connectivity Establishment) candidate
    in the WebRTC signaling protocol. Used for establishing peer-to-peer connections.
    """

    candidate: str = ""
    sdp_mid: str = ""
    sdp_mline_index: int = 0

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'ICECandidate':
        """
        Create an ICECandidate instance from a dictionary.

        Args:
            data: Dictionary containing the ICE candidate data

        Returns:
            A new ICECandidate instance
        """
        return ICECandidate(
            candidate=data.get('candidate', ''),
            sdp_mid=data.get('sdpMid', ''),
            sdp_mline_index=data.get('sdpMlineIndex', 0)
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this ICECandidate instance to a dictionary.

        Returns:
            Dictionary representation of the ICECandidate
        """
        return {
            'candidate': self.candidate,
            'sdpMid': self.sdp_mid,
            'sdpMlineIndex': self.sdp_mline_index
        }
