"""Update signaling status request for WebRTC signaling protocol."""

from dataclasses import dataclass
from enum import Enum
from typing import Dict, Any, Optional
import sys
import os

# Add parent directory to path to import Atom
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
from models import Atom


class SignalingStatus(Enum):
    """
    Represents the status of a signaling session.
    Used to track the lifecycle of a WebRTC signaling session.
    """

    UNKNOWN = 0
    START = 1
    IN_LANDING = 2
    DONE = 3

    @staticmethod
    def from_value(value: int) -> 'SignalingStatus':
        """
        Create a SignalingStatus from an integer value.

        Args:
            value: Integer value representing the signaling status

        Returns:
            Corresponding SignalingStatus enum value, defaults to UNKNOWN if not found
        """
        for status in SignalingStatus:
            if status.value == value:
                return status
        return SignalingStatus.UNKNOWN

    def get_value(self) -> int:
        """
        Get the integer value of this signaling status.

        Returns:
            Integer value
        """
        return self.value


@dataclass
class UpdateSignalingStatusRequest:
    """
    Represents a request to update the signaling status.
    Used to notify the server about changes in the signaling session state.
    """

    atom: Optional[Atom] = None
    job_id: str = ""
    status: SignalingStatus = SignalingStatus.UNKNOWN
    url: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'UpdateSignalingStatusRequest':
        """
        Create an UpdateSignalingStatusRequest instance from a dictionary.

        Args:
            data: Dictionary containing the request data

        Returns:
            A new UpdateSignalingStatusRequest instance
        """
        atom_data = data.get('atom')
        atom = Atom.from_dict(atom_data) if atom_data else None

        return UpdateSignalingStatusRequest(
            atom=atom,
            job_id=data.get('jobId', ''),
            status=SignalingStatus.from_value(data.get('status', 0)),
            url=data.get('url', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this UpdateSignalingStatusRequest instance to a dictionary.

        Returns:
            Dictionary representation of the UpdateSignalingStatusRequest
        """
        return {
            'atom': self.atom.to_dict() if self.atom else {},
            'jobId': self.job_id,
            'status': self.status.get_value(),
            'url': self.url
        }
