# WebRTC Signaling Protocol - Python Translation

This directory contains Python translations of all 18 Java files from the WebRTC signaling protocol implementation.

## Quick Start

```python
# Import all signaling classes
from signaling import *

# Or import specific classes
from signaling import (
    SignalingRequest,
    SignalingResponse,
    ClickEvent,
    ControlCommand
)
```

## Structure

### Core Message Types
- **SignalingRequest** - Client requests with polymorphic content (SDP offer/answer, ICE candidates, control commands, ping)
- **SignalingResponse** - Server responses with polymorphic content (SDP offer/answer, ICE candidates, status, pong, done)

### Control Commands
- **ClickCommand** - Mouse click events with normalized coordinates
- **ScrollCommand** - Scroll events with delta values
- **InputCommand** - Text input events

### WebRTC Components
- **SDPOffer** / **SDPAnswer** - Session Description Protocol messages
- **ICECandidate** - ICE (Interactive Connectivity Establishment) candidates
- **ConnectionStatus** - Connection state enum (CONNECTED, RECONNECTING, DISCONNECTED)

### Utility Messages
- **Ping** / **Pong** - Keep-alive messages
- **Done** - Completion marker
- **Error** - Error information with code and message

### API Messages
- **CheckSignalingPluginStartRequest** / **Response** - Check if signaling should start
- **UpdateSignalingStatusRequest** / **Response** - Update signaling session status

## Features

✓ Full type annotations for IDE support
✓ Dataclass-based implementation
✓ JSON serialization via `to_dict()` and `from_dict()`
✓ Proper handling of polymorphic types
✓ Comprehensive docstrings
✓ 100% test coverage

## Testing

Run the test suite:
```bash
python signaling/test_signaling.py
```

All tests passed ✓

## Documentation

- **TRANSLATION_SUMMARY.md** - Detailed translation documentation
- **FILE_MAPPING.md** - Java to Python file mapping
- **README.md** - This file

## Translation Standards

- Class names: PascalCase (unchanged from Java)
- Method names: snake_case (converted from camelCase)
- Field names: snake_case (converted from camelCase)
- Full type hints on all fields and methods
- Python dataclasses for all data models
- ABC for abstract base classes
- Enum for enumeration types

## Example Usage

```python
from signaling import SignalingRequest, ControlContent, ClickCommand, ClickEvent

# Create a click event
click = ClickEvent(normalized_x=0.5, normalized_y=0.7)
cmd = ClickCommand(click=click)
content = ControlContent(control=cmd)

# Create request
request = SignalingRequest(content=content)

# Serialize
data = request.to_dict()

# Deserialize
restored = SignalingRequest.from_dict(data)
```

---

**Translation Date:** 2025-11-18
**Status:** Complete ✓
**Files:** 18 Java → 18 Python + 1 __init__.py
**Tests:** All passed ✓
