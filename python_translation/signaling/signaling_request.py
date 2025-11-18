"""Signaling request for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any, Union, Optional
from abc import ABC, abstractmethod
import sys
import os

# Add parent directory to path to import Atom
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
from models import Atom

from .control_command import ControlCommand
from .ice_candidate import ICECandidate
from .ping import Ping
from .sdp_answer import SDPAnswer
from .sdp_offer import SDPOffer


class SignalingRequestContent(ABC):
    """
    Abstract base class for signaling request content.
    Content can be one of several types: SDP offer, SDP answer, ICE candidate, control, or ping.
    """

    @abstractmethod
    def to_dict(self) -> Dict[str, Any]:
        """Convert this content to a dictionary."""
        pass

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'SignalingRequestContent':
        """
        Create a SignalingRequestContent instance from a dictionary.

        Args:
            data: Dictionary containing the content data

        Returns:
            A SignalingRequestContent subclass instance based on the type field

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
        elif content_type == 'control':
            control_data = data.get('control', {})
            return ControlContent(ControlCommand.from_dict(control_data))
        elif content_type == 'ping':
            ping_data = data.get('ping', {})
            return PingMessageContent(Ping.from_dict(ping_data))
        else:
            raise ValueError(f'Unknown signaling request content type: {content_type}')


@dataclass
class SdpOfferContent(SignalingRequestContent):
    """Represents SDP offer content."""

    sdp_offer: SDPOffer

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'sdpOffer',
            'sdpOffer': self.sdp_offer.to_dict()
        }


@dataclass
class SdpAnswerContent(SignalingRequestContent):
    """Represents SDP answer content."""

    sdp_answer: SDPAnswer

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'sdpAnswer',
            'sdpAnswer': self.sdp_answer.to_dict()
        }


@dataclass
class IceCandidateContent(SignalingRequestContent):
    """Represents ICE candidate content."""

    ice_candidate: ICECandidate

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'iceCandidate',
            'iceCandidate': self.ice_candidate.to_dict()
        }


@dataclass
class ControlContent(SignalingRequestContent):
    """Represents control command content."""

    control: ControlCommand

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'control',
            'control': self.control.to_dict()
        }


@dataclass
class PingMessageContent(SignalingRequestContent):
    """Represents ping message content."""

    ping: Ping

    def to_dict(self) -> Dict[str, Any]:
        return {
            'type': 'ping',
            'ping': self.ping.to_dict()
        }


@dataclass
class SignalingRequest:
    """
    Represents a signaling request in the WebRTC signaling protocol.
    Contains content (one of several message types) and atom metadata.
    """

    content: SignalingRequestContent
    atom: Optional[Atom] = None

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'SignalingRequest':
        """
        Create a SignalingRequest instance from a dictionary.

        Args:
            data: Dictionary containing the request data

        Returns:
            A new SignalingRequest instance
        """
        content_data = data.get('content', {})
        content = SignalingRequestContent.from_dict(content_data)

        atom_data = data.get('atom')
        atom = Atom.from_dict(atom_data) if atom_data else None

        return SignalingRequest(content=content, atom=atom)

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this SignalingRequest to a dictionary.

        Returns:
            Dictionary representation of the SignalingRequest
        """
        result = {
            'content': self.content.to_dict()
        }
        if self.atom:
            result['atom'] = self.atom.to_dict()
        return result
