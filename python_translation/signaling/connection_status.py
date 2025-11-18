"""Connection status enum for WebRTC signaling protocol."""

from enum import Enum
from typing import Optional


class ConnectionStatus(Enum):
    """
    Represents the connection status in the WebRTC signaling protocol.
    Used to indicate the current state of the WebRTC connection.
    """

    CONNECTED = 0
    RECONNECTING = 1
    DISCONNECTED = 2

    @staticmethod
    def from_value(value: int) -> 'ConnectionStatus':
        """
        Create a ConnectionStatus from an integer value.

        Args:
            value: Integer value representing the connection status

        Returns:
            Corresponding ConnectionStatus enum value, defaults to CONNECTED if not found
        """
        for status in ConnectionStatus:
            if status.value == value:
                return status
        return ConnectionStatus.CONNECTED

    def get_value(self) -> int:
        """
        Get the integer value of this connection status.

        Returns:
            Integer value
        """
        return self.value
