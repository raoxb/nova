"""Update signaling status response for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class UpdateSignalingStatusResponse:
    """
    Represents a response to an update signaling status request.
    Contains a status code and message indicating the result of the update operation.
    """

    code: int = -1
    message: str = ""

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'UpdateSignalingStatusResponse':
        """
        Create an UpdateSignalingStatusResponse instance from a dictionary.

        Args:
            data: Dictionary containing the response data

        Returns:
            A new UpdateSignalingStatusResponse instance
        """
        return UpdateSignalingStatusResponse(
            code=data.get('code', -1),
            message=data.get('message', '')
        )

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this UpdateSignalingStatusResponse instance to a dictionary.

        Returns:
            Dictionary representation of the UpdateSignalingStatusResponse
        """
        return {
            'code': self.code,
            'message': self.message
        }
