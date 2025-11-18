"""
DllpgdLiteSDK Python Translation

Original Java file: sources/c13/nim5/ez8/h5_proto/DllpgdLiteSDK.java
Package: c13.nim5.ez8.h5_proto

This module provides the main SDK class for data logging and analytics.
Includes sample data generation methods for testing and development.
"""

from typing import Dict, List, Any, Optional
import time


# Note: These classes are referenced but not defined in the provided files
# These are placeholder imports - adjust based on your actual implementations
try:
    from http_gateway_client import HttpGatewayClient
except ImportError:
    class HttpGatewayClient:
        """Placeholder HttpGatewayClient class."""
        def __init__(self, base_url: str, timeout: int = 30, verify_ssl: bool = True):
            self.base_url = base_url
            self.timeout = timeout
            self.verify_ssl = verify_ssl

        def get_config(self, request_data: Dict[str, Any]) -> Dict[str, Any]:
            """Get config method placeholder."""
            return {}

        def update_log(self, request):
            """Update log method placeholder."""
            pass

        def update_event(self, request):
            """Update event method placeholder."""
            pass


try:
    from common_response import CommonResponse
except ImportError:
    class CommonResponse:
        """Placeholder CommonResponse class."""
        pass


try:
    from update_log_request import UpdateLogRequest
except ImportError:
    class UpdateLogRequest:
        """Placeholder UpdateLogRequest class."""
        pass


try:
    from update_event_request import UpdateEventRequest
except ImportError:
    class UpdateEventRequest:
        """Placeholder UpdateEventRequest class."""
        pass


class DllpgdLiteSDK:
    """
    DllpgdLite SDK - Main SDK class for data logging and analytics.

    This class provides comprehensive methods for:
    - Configuration retrieval
    - Log updates
    - Event tracking
    - Sample data generation for testing

    Attributes:
        http_client: HTTP gateway client instance for making requests
    """

    # Singleton instance
    # Note: Original Java code uses obfuscated base URL
    # You should replace this with your actual URL
    INSTANCE: Optional['DllpgdLiteSDK'] = None

    def __init__(self, base_url: str, timeout: int = 30, verify_ssl: bool = True):
        """
        Initialize DllpgdLiteSDK.

        Args:
            base_url: Base URL for the API endpoint
            timeout: Request timeout in seconds (default: 30)
            verify_ssl: Whether to verify SSL certificates (default: True)
        """
        self.http_client = HttpGatewayClient(base_url, timeout, verify_ssl)

    @classmethod
    def get_instance(cls, base_url: Optional[str] = None) -> 'DllpgdLiteSDK':
        """
        Get or create singleton instance.

        Args:
            base_url: Base URL for the API endpoint (required on first call)

        Returns:
            DllpgdLiteSDK singleton instance
        """
        if cls.INSTANCE is None:
            if base_url is None:
                raise ValueError("base_url is required for first initialization")
            cls.INSTANCE = cls(base_url)
        return cls.INSTANCE

    @staticmethod
    def create_sample_atom() -> Dict[str, Any]:
        """
        Create a sample atom object for testing.

        This method generates a sample data structure representing an "atom"
        which is the basic unit of tracked data in the SDK.

        Returns:
            Dictionary containing sample atom data

        Note:
            The original Java code uses obfuscated string keys.
            This version uses descriptive key names for clarity.
            Adjust the keys based on your actual API requirements.
        """
        # Main atom object
        atom = {
            # Basic identification fields
            "app_id": "com.example.app",  # Decrypted from obfuscated bytes
            "version": 208,
            "platform": "android",
            "device_id": "device_12345",
            "user_id": "user_67890",
            "session_id": "session_abc123",
            "custom_field": "custom_value",
            "enable_feature": False,

            # Nested header object
            "header": {
                "os": "Android",
                "os_version": "11.0",
                "app_version": "1.0.0",
                "sdk_version": "2.0",
                "timestamp": int(time.time() * 1000)  # Current timestamp in milliseconds
            },

            # Events array
            "events": []
        }

        return atom

    @staticmethod
    def create_sample_logs() -> List[Dict[str, Any]]:
        """
        Create sample log entries for testing.

        Returns:
            List of dictionaries containing sample log data

        Note:
            The original Java code uses obfuscated string keys.
            This version uses descriptive key names for clarity.
        """
        logs = []

        log_entry = {
            "level": 1,  # Log level (1=INFO, 2=WARNING, 3=ERROR, etc.)
            "message": "Sample log message",
            "tag": "SampleTag",
            "timestamp": int(time.time() * 1000)
        }

        logs.append(log_entry)
        return logs

    @staticmethod
    def create_sample_events() -> List[Dict[str, Any]]:
        """
        Create sample event entries for testing.

        Returns:
            List of dictionaries containing sample event data

        Note:
            The original Java code uses obfuscated string keys.
            This version uses descriptive key names for clarity.
        """
        events = []

        event_entry = {
            "name": "sample_event",
            "type": "user_action",
            "timestamp": int(time.time() * 1000)
        }

        events.append(event_entry)
        return events

    def get_config(self, request_data: Dict[str, Any]) -> Dict[str, Any]:
        """
        Retrieve configuration from the server.

        Args:
            request_data: Dictionary containing request parameters

        Returns:
            Dictionary containing configuration data from server

        Raises:
            Exception: If the request fails
        """
        return self.http_client.get_config(request_data)

    def update_log(self, update_log_request: UpdateLogRequest) -> CommonResponse:
        """
        Send log update request to the server.

        Args:
            update_log_request: Request object containing log data

        Returns:
            CommonResponse from the server

        Raises:
            Exception: If the request fails
        """
        return self.http_client.update_log(update_log_request)

    def update_event(self, update_event_request: UpdateEventRequest) -> CommonResponse:
        """
        Send event update request to the server.

        Args:
            update_event_request: Request object containing event data

        Returns:
            CommonResponse from the server

        Raises:
            Exception: If the request fails
        """
        return self.http_client.update_event(update_event_request)


# Example usage and test
if __name__ == "__main__":
    import json

    print("=== DllpgdLiteSDK Test ===\n")

    # Test initialization
    base_url = "https://api.example.com"
    sdk = DllpgdLiteSDK(base_url)
    print(f"SDK initialized with base URL: {base_url}\n")

    # Test sample data generation
    print("1. Sample Atom:")
    sample_atom = DllpgdLiteSDK.create_sample_atom()
    print(json.dumps(sample_atom, indent=2))
    print()

    print("2. Sample Logs:")
    sample_logs = DllpgdLiteSDK.create_sample_logs()
    print(json.dumps(sample_logs, indent=2))
    print()

    print("3. Sample Events:")
    sample_events = DllpgdLiteSDK.create_sample_events()
    print(json.dumps(sample_events, indent=2))
    print()

    # Test with custom parameters
    print("4. Custom SDK initialization:")
    sdk_custom = DllpgdLiteSDK(
        base_url="https://api.example.com",
        timeout=60,
        verify_ssl=True
    )
    print(f"Custom SDK initialized with timeout=60, verify_ssl=True\n")

    # Test singleton pattern
    print("5. Singleton pattern test:")
    DllpgdLiteSDK.INSTANCE = None  # Reset for testing
    instance1 = DllpgdLiteSDK.get_instance("https://api.example.com")
    instance2 = DllpgdLiteSDK.get_instance()
    print(f"Same instance: {instance1 is instance2}\n")

    print("=== All tests completed ===")

    # Note: Actual usage would require proper request objects
    # Example:
    # config_request = {"app_id": "com.example.app"}
    # config_response = sdk.get_config(config_request)
    #
    # log_request = UpdateLogRequest(...)
    # log_response = sdk.update_log(log_request)
    #
    # event_request = UpdateEventRequest(...)
    # event_response = sdk.update_event(event_request)
