"""
WebRTC Signaling Protocol Classes

This package contains all the data models for the WebRTC signaling protocol,
including requests, responses, events, and control commands.
"""

# Simple data models
from .done import Done
from .error import Error
from .ping import Ping
from .pong import Pong
from .text_input import TextInput
from .click_event import ClickEvent
from .scroll_event import ScrollEvent
from .ice_candidate import ICECandidate
from .sdp_answer import SDPAnswer
from .sdp_offer import SDPOffer

# Enums
from .connection_status import ConnectionStatus
from .update_signaling_status_request import SignalingStatus

# Request/Response classes
from .check_signaling_plugin_start_request import CheckSignalingPluginStartRequest
from .check_signaling_plugin_start_response import CheckSignalingPluginStartResponse
from .update_signaling_status_request import UpdateSignalingStatusRequest
from .update_signaling_status_response import UpdateSignalingStatusResponse

# Polymorphic classes
from .control_command import (
    ControlCommand,
    ClickCommand,
    ScrollCommand,
    InputCommand
)

from .signaling_request import (
    SignalingRequest,
    SignalingRequestContent,
    SdpOfferContent as RequestSdpOfferContent,
    SdpAnswerContent as RequestSdpAnswerContent,
    IceCandidateContent as RequestIceCandidateContent,
    ControlContent,
    PingMessageContent
)

from .signaling_response import (
    SignalingResponse,
    SignalingResponseContent,
    SdpOfferContent as ResponseSdpOfferContent,
    SdpAnswerContent as ResponseSdpAnswerContent,
    IceCandidateContent as ResponseIceCandidateContent,
    StatusContent,
    PongMessageContent,
    DoneMessageContent
)

__all__ = [
    # Simple data models
    'Done',
    'Error',
    'Ping',
    'Pong',
    'TextInput',
    'ClickEvent',
    'ScrollEvent',
    'ICECandidate',
    'SDPAnswer',
    'SDPOffer',

    # Enums
    'ConnectionStatus',
    'SignalingStatus',

    # Request/Response classes
    'CheckSignalingPluginStartRequest',
    'CheckSignalingPluginStartResponse',
    'UpdateSignalingStatusRequest',
    'UpdateSignalingStatusResponse',

    # Control commands
    'ControlCommand',
    'ClickCommand',
    'ScrollCommand',
    'InputCommand',

    # Signaling request
    'SignalingRequest',
    'SignalingRequestContent',
    'RequestSdpOfferContent',
    'RequestSdpAnswerContent',
    'RequestIceCandidateContent',
    'ControlContent',
    'PingMessageContent',

    # Signaling response
    'SignalingResponse',
    'SignalingResponseContent',
    'ResponseSdpOfferContent',
    'ResponseSdpAnswerContent',
    'ResponseIceCandidateContent',
    'StatusContent',
    'PongMessageContent',
    'DoneMessageContent',
]
