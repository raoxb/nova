# Complete API Endpoints Documentation

## 🌐 Server Configuration

**Default Server**: `dllpgd.click`
- Discovered in: `DllpgdLiteSDK.java` line 11
- Decrypted value: `dllpgd.click`
- Used for both HTTP and WebSocket connections

## 📡 HTTP API Endpoints

All HTTP endpoints use **AES-256-CFB encryption** with hardcoded key "GreenDay".

### Base Configuration
- **Protocol**: HTTPS
- **Server**: `dllpgd.click`
- **Content-Type**: `application/json`
- **User-Agent**: `DllpgdLiteClient/2.0`
- **Encryption**: Multi-layer (JSON → GZIP → Base64 → AES → Base64)

### Endpoint 1: Get Configuration
```
POST https://dllpgd.click/api/v1/dllpgd/getConfig
```
**Purpose**: Retrieve client configuration from server

**Request Body**: Encrypted JSON
```json
{
  "atom": {
    "deviceId": "string",
    "appVersion": "string",
    // ... additional device info
  }
}
```

**Implementation**: `HttpGatewayClient.java` line 77

---

### Endpoint 2: Upload Logs
```
POST https://dllpgd.click/api/v1/dllpgd/updateLog
```
**Purpose**: Send client logs to server

**Request Body**: Encrypted JSON
```json
{
  "logs": [
    {
      "level": 1,
      "message": "string",
      "tag": "string",
      "timestamp": 1700000000
    }
  ]
}
```

**Implementation**: `HttpGatewayClient.java` line 97

---

### Endpoint 3: Upload Events
```
POST https://dllpgd.click/api/v1/dllpgd/updateEvent
```
**Purpose**: Send client events to server

**Request Body**: Encrypted JSON
```json
{
  "events": [
    {
      "type": "string",
      "data": "string",
      "timestamp": 1700000000
    }
  ]
}
```

**Implementation**: `HttpGatewayClient.java` line 117

---

## 🔌 WebSocket API (Signaling System)

The application uses **WebSocket** for real-time signaling, particularly for WebRTC connections.

### WebSocket Connection
```
wss://dllpgd.click/[signaling-endpoint]
```

**Protocol**: WebSocket Secure (wss://)
**Implementation**:
- Client: `sources/IlIlIIlIII1/IllIIlIIII1.java` (WebSocket client)
- Service: `sources/IlIlIIlIII1/llllIllIl1.java` (SignalingService)
- Base: `sources/lllIlIIIlI1/lIIIIlllllIlll1.java` (Abstract WebSocket client)

### Signaling Endpoint 1: Check Plugin Start
```
HTTP POST https://dllpgd.click/api/signaling/check-plugin-start
```
**Purpose**: Verify if signaling plugin is ready to start

**Implementation**: `sources/IlIlIIlIII1/llllIllIl1.java` line 36

**Request**:
```json
{
  "CheckSignalingPluginStartRequest": {
    // request parameters
  }
}
```

**Response**:
```json
{
  "CheckSignalingPluginStartResponse": {
    "ready": boolean,
    "message": "string"
  }
}
```

---

### Signaling Endpoint 2: Update Status
```
HTTP POST https://dllpgd.click/api/signaling/update-status
```
**Purpose**: Update signaling connection status

**Implementation**: `sources/IlIlIIlIII1/llllIllIl1.java` line 55

**Request**:
```json
{
  "UpdateSignalingStatusRequest": {
    "status": 1  // ConnectionStatus enum value
  }
}
```

**Response**:
```json
{
  "UpdateSignalingStatusResponse": {
    "success": boolean
  }
}
```

---

## 🎥 WebRTC Signaling Messages

The WebSocket connection carries **bidirectional signaling messages** for WebRTC peer connections.

### Message Types

#### Client → Server (SignalingRequest)

1. **SDP Offer**
```json
{
  "content": {
    "messageType": "sdp-offer",
    "sdpOffer": {
      "type": "offer",
      "sdp": "v=0\r\no=- ..."
    }
  },
  "atom": { /* device info */ }
}
```

2. **SDP Answer**
```json
{
  "content": {
    "messageType": "sdp-answer",
    "sdpAnswer": {
      "type": "answer",
      "sdp": "v=0\r\no=- ..."
    }
  },
  "atom": { /* device info */ }
}
```

3. **ICE Candidate**
```json
{
  "content": {
    "messageType": "ice-candidate",
    "iceCandidate": {
      "candidate": "string",
      "sdpMid": "string",
      "sdpMLineIndex": 0
    }
  },
  "atom": { /* device info */ }
}
```

4. **Control Commands**
```json
{
  "content": {
    "messageType": "control",
    "control": {
      "type": "click|scroll|text",
      "data": {
        // Click event
        "x": 100.0,
        "y": 200.0

        // OR Scroll event
        "deltaX": 10.0,
        "deltaY": 20.0

        // OR Text input
        "text": "string"
      }
    }
  },
  "atom": { /* device info */ }
}
```

5. **Ping**
```json
{
  "content": {
    "messageType": "ping",
    "ping": {
      "timestamp": 1700000000
    }
  },
  "atom": { /* device info */ }
}
```

---

#### Server → Client (SignalingResponse)

1. **SDP Offer** (from server)
```json
{
  "content": {
    "messageType": "sdp-offer",
    "sdpOffer": {
      "type": "offer",
      "sdp": "v=0\r\no=- ..."
    }
  },
  "error": null
}
```

2. **SDP Answer** (from server)
```json
{
  "content": {
    "messageType": "sdp-answer",
    "sdpAnswer": {
      "type": "answer",
      "sdp": "v=0\r\no=- ..."
    }
  },
  "error": null
}
```

3. **ICE Candidate** (from server)
```json
{
  "content": {
    "messageType": "ice-candidate",
    "iceCandidate": {
      "candidate": "string",
      "sdpMid": "string",
      "sdpMLineIndex": 0
    }
  },
  "error": null
}
```

4. **Connection Status**
```json
{
  "content": {
    "messageType": "status",
    "status": 1  // 0=disconnected, 1=connecting, 2=connected, etc.
  },
  "error": null
}
```

5. **Pong**
```json
{
  "content": {
    "messageType": "pong",
    "pong": {
      "timestamp": 1700000000
    }
  },
  "error": null
}
```

6. **Done**
```json
{
  "content": {
    "messageType": "done",
    "done": {
      "success": true
    }
  },
  "error": null
}
```

7. **Error Response**
```json
{
  "content": null,
  "error": {
    "code": 500,
    "message": "Error description"
  }
}
```

---

## 🔧 Implementation Files

### HTTP Client
- **Core**: `sources/c13/nim5/ez8/h5_proto/HttpGatewayClient.java`
- **SDK Wrapper**: `sources/c13/nim5/ez8/h5_proto/DllpgdLiteSDK.java`
- **Analysis**: `manual_analysis/HttpGatewayClient_ANALYSIS.java`
- **Crypto Tool**: `manual_analysis/http_crypto_tool.py`

### WebSocket Client
- **WebSocket Base**: `sources/lllIlIIIlI1/lIIIIlllllIlll1.java`
- **Abstract WebSocket**: `sources/llIIllIl1/llllIIIIll1.java`
- **Signaling Client**: `sources/IlIlIIlIII1/IllIIlIIII1.java`
- **Signaling Service**: `sources/IlIlIIlIII1/llllIllIl1.java`
- **Signaling Manager**: `sources/IlIlIIlIII1/lIIIIlllllIlll1.java`

### Signaling Data Models (18 files)
- `sources/c13/nim5/ez8/h5_proto/signaling/SignalingRequest.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/SignalingResponse.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/SDPOffer.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/SDPAnswer.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/ICECandidate.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/ControlCommand.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/ClickEvent.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/ScrollEvent.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/TextInput.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/Ping.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/Pong.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/Done.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/Error.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/ConnectionStatus.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/CheckSignalingPluginStartRequest.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/CheckSignalingPluginStartResponse.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/UpdateSignalingStatusRequest.java`
- `sources/c13/nim5/ez8/h5_proto/signaling/UpdateSignalingStatusResponse.java`

---

## 🎯 System Architecture

```
┌─────────────────┐
│  Android App    │
└────────┬────────┘
         │
    ┌────┴────┐
    │         │
    ▼         ▼
┌───────┐  ┌──────────┐
│ HTTP  │  │WebSocket │
│Client │  │ Client   │
└───┬───┘  └────┬─────┘
    │           │
    │ AES       │ JSON
    │ Encrypted │ Signaling
    │           │
    └────┬──────┘
         │
         ▼
┌────────────────────┐
│   dllpgd.click     │
│                    │
│ ┌────────────────┐ │
│ │ HTTP Endpoints │ │
│ │ /api/v1/dllpgd/│ │
│ │  - getConfig   │ │
│ │  - updateLog   │ │
│ │  - updateEvent │ │
│ └────────────────┘ │
│                    │
│ ┌────────────────┐ │
│ │WS Signaling    │ │
│ │ /api/signaling/│ │
│ │  - WebRTC SDP  │ │
│ │  - ICE         │ │
│ │  - Control     │ │
│ └────────────────┘ │
└────────────────────┘
         │
         ▼
┌────────────────────┐
│  WebRTC P2P        │
│  Video/Audio       │
│  Screen Sharing    │
└────────────────────┘
```

---

## ⚠️ Security Analysis

### HTTP Encryption Issues
1. **Hardcoded AES Key**: "GreenDay"
   - Anyone with the APK can decrypt all traffic
2. **Weak Key Derivation**: 8-byte key padded with zeros
3. **No HMAC/Integrity Check**: Traffic can be modified
4. **No Certificate Pinning**: Vulnerable to MITM

### WebSocket Security
1. **Uses wss:// (secure)**: Encrypted transport layer
2. **No Additional Encryption**: Messages sent as plain JSON over TLS
3. **No Authentication Token Visible**: May rely on session cookies or headers
4. **Connection Loss Detection**: Implements ping/pong with 60-second timeout

### WebRTC Security
1. **Signaling over WebSocket**: Control messages for P2P setup
2. **ICE Candidates**: Network topology exposed
3. **Remote Control Capability**: Can send click/scroll/text events
   - **CRITICAL**: This enables remote control of the device!

---

## 🚨 Functionality Assessment

### Primary Purpose
This is a **remote control and monitoring system** with the following capabilities:

1. **Device Configuration**: Pull configuration from server
2. **Logging & Analytics**: Upload logs and events to server
3. **WebRTC Connection**: Establish peer-to-peer video/audio/screen sharing
4. **Remote Control**: Send user input events (clicks, scrolls, text)
5. **Status Monitoring**: Track connection and signaling status

### Potential Use Cases
- Remote device management
- Screen sharing/mirroring
- Remote technical support
- Device monitoring and analytics
- **Potentially malicious**: Remote surveillance and control without user knowledge

---

**Analysis Date**: 2025-11-18
**Analyst**: Claude (Deep manual analysis + WebSocket discovery)
**Methodology**: XOR decryption + String analysis + WebSocket protocol reverse engineering
