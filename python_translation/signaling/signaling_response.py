"""Signaling response for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any, Optional
from abc import ABC, abstractmethod

from .connection_status import ConnectionStatus
from .done import Done
from .error import Error
from .ice_candidate import ICECandidate
from .pong import Pong
from .sdp_answer import SDPAnswer
from .sdp_offer import SDPOffer


class SignalingResponseContent(ABC):
    """
    Abstract base class for signaling response content.
    Content can be one of several types: SDP offer, SDP answer, ICE candidate, status, pong, or done.
    """

    @abstractmethod
    def to_dict(self) -> Dict[str, Any]:
        """Convert this content to a dictionary."""
        pass

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'SignalingResponseContent':
        """
        Create a SignalingResponseContent instance from a dictionary.

        Args:
            data: Dictionary containing the content data

        Returns:
            A SignalingResponseContent subclass instance based on the type field

        Raises:
            ValueError: If the type is unknown or missing
        """
        content_type = data.get('type', '')

        if content_type == 'sdpOffer':
            sdp_offer_data = data.get('sdpOffer', {})
            return SdpOfferContent(SDPOffer.from_dict(sdp_offer_data))
        elif content_type == 'sdpAnswer':
            sdp_answer_data = data.get('sdpAnswer', {})
            return SdpAnswerContent(SDPAnswer.from_dict(sdp_answer_data))
        elif content_type == 'iceCandidate':
            ice_candidate_data = data.get('iceCandidate', {})
            return IceCandidateContent(ICECandidate.from_dict(ice_candidate_data))
        elif content_type == 'status':
            status_value = data.get('status', 0)
            return StatusContent(ConnectionStatus.from_value(status_value))
        elif content_type == 'pong':
            pong_data = data.get('pong', {})
            return PongMessageContent(Pong.from_dict(pong_data))
        elif content_type == 'done':
            done_data = data.get('done', {})
            return DoneMessageContent(Done.from_dict(done_data))
        else:
            raise ValueError(f'Unknown signaling response content type: {content_type}')


@dataclass
class SdpOfferContent(SignalingResponseContent):
    """Represents SDP offer content."""

    sdp_offer: SDPOffer

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'sdpOffer',
            'sdpOffer': self.sdp_offer.to_dict()
        }


@dataclass
class SdpAnswerContent(SignalingResponseContent):
    """Represents SDP answer content."""

    sdp_answer: SDPAnswer

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'sdpAnswer',
            'sdpAnswer': self.sdp_answer.to_dict()
        }


@dataclass
class IceCandidateContent(SignalingResponseContent):
    """Represents ICE candidate content."""

    ice_candidate: ICECandidate

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'iceCandidate',
            'iceCandidate': self.ice_candidate.to_dict()
        }


@dataclass
class StatusContent(SignalingResponseContent):
    """Represents connection status content."""

    status: ConnectionStatus

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'status',
            'status': self.status.get_value()
        }


@dataclass
class PongMessageContent(SignalingResponseContent):
    """Represents pong message content."""

    pong: Pong

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'pong',
            'pong': self.pong.to_dict()
        }


@dataclass
class DoneMessageContent(SignalingResponseContent):
    """Represents done message content."""

    done: Done

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'done',
            'done': self.done.to_dict()
        }


@dataclass
class SignalingResponse:
    """
    Represents a signaling response in the WebRTC signaling protocol.
    Contains optional content and optional error information.
    """

    content: Optional[SignalingResponseContent] = None
    error: Optional[Error] = None

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'SignalingResponse':
        """
        Create a SignalingResponse instance from a dictionary.

        Args:
            data: Dictionary containing the response data

        Returns:
            A new SignalingResponse instance
        """
        content = None
        if 'content' in data and data['content'] is not None:
            content_data = data.get('content', {})
            content = SignalingResponseContent.from_dict(content_data)

        error = None
        if 'error' in data and data['error'] is not None:
            error_data = data.get('error', {})
            error = Error.from_dict(error_data)

        return SignalingResponse(content=content, error=error)

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this SignalingResponse to a dictionary.

        Returns:
            Dictionary representation of the SignalingResponse
        """
        result = {}
        if self.content is not None:
            result['content'] = self.content.to_dict()
        if self.error is not None:
            result['error'] = self.error.to_dict()
        return result
