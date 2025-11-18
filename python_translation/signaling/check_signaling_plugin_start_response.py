"""Check signaling plugin start response for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class CheckSignalingPluginStartResponse:
    """
    Represents a response to a check signaling plugin start request.
    Contains information about whether the signaling session should start,
    along with associated identifiers and status information.
    """

    code: int = -1
    message: str = ""
    run: bool = False
    offer_id: str = ""
    job_id: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'CheckSignalingPluginStartResponse':
        """
        Create a CheckSignalingPluginStartResponse instance from a dictionary.

        Args:
            data: Dictionary containing the response data

        Returns:
            A new CheckSignalingPluginStartResponse instance
        """
        return CheckSignalingPluginStartResponse(
            code=data.get('code', -1),
            message=data.get('message', ''),
            run=data.get('run', False),
            offer_id=data.get('offerId', ''),
            job_id=data.get('jobId', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this CheckSignalingPluginStartResponse instance to a dictionary.

        Returns:
            Dictionary representation of the CheckSignalingPluginStartResponse
        """
        return {
            'code': self.code,
            'message': self.message,
            'run': self.run,
            'offerId': self.offer_id,
            'jobId': self.job_id
        }

    def is_run(self) -> bool:
        """
        Check if the signaling session should run.

        Returns:
            True if the session should start, False otherwise
        """
        return self.run
