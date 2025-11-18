"""Test file for WebRTC signaling protocol classes."""

import sys
import os

# Add parent directory to path
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from signaling import (
    # Simple classes
    Done, Ping, Pong, Error, TextInput, ClickEvent, ScrollEvent,
    ICECandidate, SDPAnswer, SDPOffer,

    # Enums
    ConnectionStatus, SignalingStatus,

    # Request/Response
    CheckSignalingPluginStartRequest, CheckSignalingPluginStartResponse,
    UpdateSignalingStatusRequest, UpdateSignalingStatusResponse,

    # Control commands
    ControlCommand, ClickCommand, ScrollCommand, InputCommand,

    # Signaling request/response
    SignalingRequest, SignalingResponse,
    RequestSdpOfferContent, RequestIceCandidateContent, ControlContent,
    ResponseSdpOfferContent, StatusContent, DoneMessageContent
)


def test_simple_classes():
    """Test simple data model classes."""
    print("Testing simple classes...")

    # Test Done
    done = Done()
    done_dict = done.to_dict()
    done_restored = Done.from_dict(done_dict)
    assert done == done_restored
    print("✓ Done class works")

    # Test Ping
    ping = Ping(message="test ping")
    ping_dict = ping.to_dict()
    ping_restored = Ping.from_dict(ping_dict)
    assert ping.message == ping_restored.message
    print("✓ Ping class works")

    # Test Pong
    pong = Pong(message="test pong")
    pong_dict = pong.to_dict()
    pong_restored = Pong.from_dict(pong_dict)
    assert pong.message == pong_restored.message
    print("✓ Pong class works")

    # Test Error
    error = Error(code=404, message="Not found")
    error_dict = error.to_dict()
    error_restored = Error.from_dict(error_dict)
    assert error.code == error_restored.code
    assert error.message == error_restored.message
    print("✓ Error class works")

    # Test ClickEvent
    click = ClickEvent(normalized_x=0.5, normalized_y=0.7)
    click_dict = click.to_dict()
    click_restored = ClickEvent.from_dict(click_dict)
    assert click.normalized_x == click_restored.normalized_x
    assert click.normalized_y == click_restored.normalized_y
    print("✓ ClickEvent class works")

    # Test ScrollEvent
    scroll = ScrollEvent(delta_x=10.0, delta_y=20.0)
    scroll_dict = scroll.to_dict()
    scroll_restored = ScrollEvent.from_dict(scroll_dict)
    assert scroll.delta_x == scroll_restored.delta_x
    assert scroll.delta_y == scroll_restored.delta_y
    print("✓ ScrollEvent class works")

    # Test ICECandidate
    ice = ICECandidate(
        candidate="candidate:1 1 UDP 2130706431 192.168.1.1 54321 typ host",
        sdp_mid="0",
        sdp_mline_index=0
    )
    ice_dict = ice.to_dict()
    ice_restored = ICECandidate.from_dict(ice_dict)
    assert ice.candidate == ice_restored.candidate
    assert ice.sdp_mid == ice_restored.sdp_mid
    assert ice.sdp_mline_index == ice_restored.sdp_mline_index
    print("✓ ICECandidate class works")

    # Test SDPOffer
    sdp_offer = SDPOffer(type="offer", sdp="v=0\r\no=- 123456 2 IN IP4 127.0.0.1\r\n")
    sdp_offer_dict = sdp_offer.to_dict()
    sdp_offer_restored = SDPOffer.from_dict(sdp_offer_dict)
    assert sdp_offer.type == sdp_offer_restored.type
    assert sdp_offer.sdp == sdp_offer_restored.sdp
    print("✓ SDPOffer class works")

    # Test SDPAnswer
    sdp_answer = SDPAnswer(type="answer", sdp="v=0\r\no=- 789012 2 IN IP4 127.0.0.1\r\n")
    sdp_answer_dict = sdp_answer.to_dict()
    sdp_answer_restored = SDPAnswer.from_dict(sdp_answer_dict)
    assert sdp_answer.type == sdp_answer_restored.type
    assert sdp_answer.sdp == sdp_answer_restored.sdp
    print("✓ SDPAnswer class works")


def test_enums():
    """Test enum classes."""
    print("\nTesting enums...")

    # Test ConnectionStatus
    status = ConnectionStatus.CONNECTED
    assert status.get_value() == 0
    status2 = ConnectionStatus.from_value(0)
    assert status == status2
    print("✓ ConnectionStatus enum works")

    # Test SignalingStatus
    sig_status = SignalingStatus.START
    assert sig_status.get_value() == 1
    sig_status2 = SignalingStatus.from_value(1)
    assert sig_status == sig_status2
    print("✓ SignalingStatus enum works")


def test_control_commands():
    """Test control command classes."""
    print("\nTesting control commands...")

    # Test ClickCommand
    click_event = ClickEvent(normalized_x=0.3, normalized_y=0.6)
    click_cmd = ClickCommand(click=click_event)
    click_dict = click_cmd.to_dict()
    assert click_dict['type'] == 'click'
    click_cmd_restored = ControlCommand.from_dict(click_dict)
    assert isinstance(click_cmd_restored, ClickCommand)
    assert click_cmd_restored.click.normalized_x == 0.3
    print("✓ ClickCommand works")

    # Test ScrollCommand
    scroll_event = ScrollEvent(delta_x=5.0, delta_y=10.0)
    scroll_cmd = ScrollCommand(scroll=scroll_event)
    scroll_dict = scroll_cmd.to_dict()
    assert scroll_dict['type'] == 'scroll'
    scroll_cmd_restored = ControlCommand.from_dict(scroll_dict)
    assert isinstance(scroll_cmd_restored, ScrollCommand)
    assert scroll_cmd_restored.scroll.delta_y == 10.0
    print("✓ ScrollCommand works")

    # Test InputCommand
    text_input = TextInput(text="Hello World")
    input_cmd = InputCommand(input=text_input)
    input_dict = input_cmd.to_dict()
    assert input_dict['type'] == 'input'
    input_cmd_restored = ControlCommand.from_dict(input_dict)
    assert isinstance(input_cmd_restored, InputCommand)
    assert input_cmd_restored.input.text == "Hello World"
    print("✓ InputCommand works")


def test_signaling_request():
    """Test SignalingRequest with various content types."""
    print("\nTesting SignalingRequest...")

    # Test with SDP offer content
    sdp_offer = SDPOffer(type="offer", sdp="test sdp")
    offer_content = RequestSdpOfferContent(sdp_offer=sdp_offer)
    request = SignalingRequest(content=offer_content, atom=None)
    request_dict = request.to_dict()
    request_restored = SignalingRequest.from_dict(request_dict)
    assert isinstance(request_restored.content, RequestSdpOfferContent)
    assert request_restored.content.sdp_offer.type == "offer"
    print("✓ SignalingRequest with SDP offer works")

    # Test with control command content
    click_event = ClickEvent(normalized_x=0.5, normalized_y=0.5)
    click_cmd = ClickCommand(click=click_event)
    control_content = ControlContent(control=click_cmd)
    request2 = SignalingRequest(content=control_content, atom=None)
    request2_dict = request2.to_dict()
    request2_restored = SignalingRequest.from_dict(request2_dict)
    assert isinstance(request2_restored.content, ControlContent)
    assert isinstance(request2_restored.content.control, ClickCommand)
    print("✓ SignalingRequest with control command works")


def test_signaling_response():
    """Test SignalingResponse with various content types."""
    print("\nTesting SignalingResponse...")

    # Test with status content
    status = ConnectionStatus.CONNECTED
    status_content = StatusContent(status=status)
    response = SignalingResponse(content=status_content, error=None)
    response_dict = response.to_dict()
    response_restored = SignalingResponse.from_dict(response_dict)
    assert isinstance(response_restored.content, StatusContent)
    assert response_restored.content.status == ConnectionStatus.CONNECTED
    print("✓ SignalingResponse with status works")

    # Test with error
    error = Error(code=500, message="Internal error")
    response2 = SignalingResponse(content=None, error=error)
    response2_dict = response2.to_dict()
    response2_restored = SignalingResponse.from_dict(response2_dict)
    assert response2_restored.error is not None
    assert response2_restored.error.code == 500
    print("✓ SignalingResponse with error works")

    # Test with done content
    done = Done()
    done_content = DoneMessageContent(done=done)
    response3 = SignalingResponse(content=done_content, error=None)
    response3_dict = response3.to_dict()
    response3_restored = SignalingResponse.from_dict(response3_dict)
    assert isinstance(response3_restored.content, DoneMessageContent)
    print("✓ SignalingResponse with done message works")


def test_check_signaling_plugin():
    """Test CheckSignalingPluginStartRequest and Response."""
    print("\nTesting CheckSignalingPlugin classes...")

    # Test request
    request = CheckSignalingPluginStartRequest(atom=None)
    request_dict = request.to_dict()
    request_restored = CheckSignalingPluginStartRequest.from_dict(request_dict)
    assert request_restored.atom is None
    print("✓ CheckSignalingPluginStartRequest works")

    # Test response
    response = CheckSignalingPluginStartResponse(
        code=200,
        message="OK",
        run=True,
        offer_id="offer123",
        job_id="job456"
    )
    response_dict = response.to_dict()
    response_restored = CheckSignalingPluginStartResponse.from_dict(response_dict)
    assert response_restored.code == 200
    assert response_restored.run is True
    assert response_restored.offer_id == "offer123"
    assert response_restored.job_id == "job456"
    assert response_restored.is_run() is True
    print("✓ CheckSignalingPluginStartResponse works")


def test_update_signaling_status():
    """Test UpdateSignalingStatusRequest and Response."""
    print("\nTesting UpdateSignalingStatus classes...")

    # Test request
    request = UpdateSignalingStatusRequest(
        atom=None,
        job_id="job789",
        status=SignalingStatus.START,
        url="https://example.com"
    )
    request_dict = request.to_dict()
    request_restored = UpdateSignalingStatusRequest.from_dict(request_dict)
    assert request_restored.job_id == "job789"
    assert request_restored.status == SignalingStatus.START
    assert request_restored.url == "https://example.com"
    print("✓ UpdateSignalingStatusRequest works")

    # Test response
    response = UpdateSignalingStatusResponse(
        code=200,
        message="Updated successfully"
    )
    response_dict = response.to_dict()
    response_restored = UpdateSignalingStatusResponse.from_dict(response_dict)
    assert response_restored.code == 200
    assert response_restored.message == "Updated successfully"
    print("✓ UpdateSignalingStatusResponse works")


if __name__ == '__main__':
    print("=" * 60)
    print("Running WebRTC Signaling Protocol Tests")
    print("=" * 60)

    try:
        test_simple_classes()
        test_enums()
        test_control_commands()
        test_signaling_request()
        test_signaling_response()
        test_check_signaling_plugin()
        test_update_signaling_status()

        print("\n" + "=" * 60)
        print("ALL TESTS PASSED! ✓")
        print("=" * 60)

    except Exception as e:
        print(f"\n✗ TEST FAILED: {e}")
        import traceback
        traceback.print_exc()
        sys.exit(1)
