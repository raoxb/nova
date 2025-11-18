"""
Constants for the application (translated from Java)
Original: string_resolver/Constants.java (llllIIIIll1.java)
"""

from __future__ import annotations


class Constants:
    """
    Application constants including package names, API keys, and encrypted data.
    Original package: string_resolver
    """

    # Debug flag
    DEBUG: bool = False

    # Package name
    PACKAGE_NAME: str = "com.nied.lduvv"

    # Build type
    BUILD_TYPE: str = "release"

    # API key (Base64 encoded)
    API_KEY: str = "y6EhqVxKRhT5a0423mel6jFJrJrQaX1nM0YRFC5zIPs="

    # Version
    VERSION: str = "1.8.1"

    # Encrypted configuration data (Base64 encoded)
    # This contains the main encrypted configuration blob
    ENCRYPTED_CONFIG: str = (
        "m6O2W2Fj8Mcu3aYhmyNqB3Bl4/owbF64OXfNePp+rN4cQZrueyBPt85DeTo1ZX69hV9vT63cufQTgf5ZhFFMuZK/XeGUOCTPj+yXV64283VNnkM4If1VNtMtyIVPEQzc"
        "4G+wTP+jEIWO3MymYz+YeCFaDWOik9Ygn7xNBBNC7ubKozP5BEO2s6NlKdZbYOyTQstCD/V2cmqam2zhPsOmhsi4XDuG9DK/4E7cLiuymMaiMtsLp2o7ZYWfpL49GmS7"
        "d0cE8tHYgBv8dQ4txzrdBiO3lezXC9R4SBo8UnDj/W9t+BeySYofgHmVAziYm9uqeerXovsHzg800w3wuapwIiE4e3at/M4zvrsBobnyOSKVVdBvRZyg3hkW8SbrKHP1"
        "JvVgcmir+XIb+G7zB7700qzwSYo0f0ni38OG2Qj5XkmIJrKQLv6RuxmVtAYSe07XVCfcAwUDXOlcnogR+AQbSo0DpU+ppiW5ruUbM6G9d5Y9uV1x83g6qbygaoMi2/oO"
        "GYQFrbO4d+KlS3wKQl6nODwYJXNcmulqAgUai2hxpXb/zZEkXELrLEPGzdYiFYnFJLXD3y8Rx/korjDZHiDmdhvffl+/YJUCNsDkwGf3Vxfhb+h7FzqCPnQsTByicCDe"
        "A9q1GzhtD8wzlTSZSEuzefbynR8Vn709ctEV3QqT712VgT/HuA1kPEzRKb8KAL2PuFCBOncxZwIeJDhmuu+yIKkaMsxXzH+Tw/ay6Ng5RgA3ilVJ+glIHmppkbKML7PT"
        "Rz+XyqB5TaU/6+iS35TpfHMrKT6rR/j+EDRHTj+edm+/5kTav2pxChquTzexBS4g1aJnSqi37HyYQbK81SnGfiSVldJUqZaDglleo+Al9EzSoCRub1lhaqtTpec6P2sH"
        "+pCahWBuntHKtSO4YuPERlGW7ZQLm3XpGdsaN/42pypUyVY3iZx7RG6qjTCg6GyL0WjxX8gc87FZDepBcDq9cl2iT2b2JpLnqC/OyJ05SUiC5KhWYl69RNedqzHV8ubH"
        "1XG0pxfF0OI1acAMNJ+Oro5X6TJnA+vCZxKUYt8QqsfLOv4DZiaU80bTeAq65hl6aSbBXzQ84b3DuJX0dynj5t3AmhaCs93B+C6RpXgFZcI7BIXLG7X1dEdS/1IA2jEt"
        "cBFdrruQJbLt+3ji98AUBXvpe7rvgl0RqzsDEsi1L7ukjUVhzeXS27eYGv5wcjX7wz3aV3x5PkAZQS9gJ7SsAlEs2akfY3V5uiu8iHTxpCWOWzmXW6LIEVho/sy2rlYH"
        "7pY6mXjmw5hgN1ENtYmVjZSj4k0w7xSryAcAHmuLrdtuk3cZbNl9nUe30/UvoUFZLsQ="
    )

    # Encrypted key/IV data (Base64 encoded)
    ENCRYPTED_KEY_IV: str = "YT45FBwVKAlwu2Z8VulLYQ=="

    # Secondary debug flag
    DEBUG_FLAG: bool = False

    # Session/encryption data (Base64 encoded)
    SESSION_DATA: str = "8t4ZV1XdDPRTuyABH0EuqSR2m7HY0w6ZZAE4zJMMpoak831vY0rSoyY="

    # Short encrypted data
    SHORT_DATA: str = "oJ9MVw0="

    # Service class name
    SERVICE_CLASS_NAME: str = "null.service.KbcoihService"


# Legacy field name mapping (from obfuscated Java code)
# Original field names for reference:
# f249llllIIIIll1 -> DEBUG
# f250lIIIIlllllIlll1 -> PACKAGE_NAME
# f251llllIllIl1 -> BUILD_TYPE
# f252IllIIlIIII1 -> API_KEY
# f253IlIlllIIlI1 -> VERSION
# f254IlIllIlllIllI1 -> ENCRYPTED_CONFIG
# f255llllllIlIIIlll1 -> ENCRYPTED_KEY_IV
# f256IlIlIIlIII1 -> DEBUG_FLAG
# f257lIllIIIlIl1 -> SESSION_DATA
# f258IIlIllIIll1 -> SHORT_DATA
# f259IlIllll1 -> SERVICE_CLASS_NAME
