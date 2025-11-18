"""
H5Lite Python Translation

Original Java file: sources/c13/nim5/ez8/h5_proto/H5Lite.java
Package: c13.nim5.ez8.h5_proto

This module provides a simplified H5 SDK for logging and event tracking.
"""

from typing import Optional


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


class H5Lite:
    """
    H5 Lite SDK - Simplified version for H5 analytics and tracking.

    This class provides methods for sending logs and events to a remote server
    using the HTTP Gateway Client.

    Attributes:
        http_client: HTTP gateway client instance for making requests
    """

    # Singleton instance
    # Note: Original Java code uses obfuscated base URL
    # You should replace this with your actual URL
    INSTANCE: Optional['H5Lite'] = None

    def __init__(self, base_url: str, timeout: int = 30, verify_ssl: bool = True):
        """
        Initialize H5Lite SDK.

        Args:
            base_url: Base URL for the API endpoint
            timeout: Request timeout in seconds (default: 30)
            verify_ssl: Whether to verify SSL certificates (default: True)
        """
        self.http_client = HttpGatewayClient(base_url, timeout, verify_ssl)

    @classmethod
    def get_instance(cls, base_url: Optional[str] = None) -> 'H5Lite':
        """
        Get or create singleton instance.

        Args:
            base_url: Base URL for the API endpoint (required on first call)

        Returns:
            H5Lite singleton instance
        """
        if cls.INSTANCE is None:
            if base_url is None:
                raise ValueError("base_url is required for first initialization")
            cls.INSTANCE = cls(base_url)
        return cls.INSTANCE

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
    # Test initialization
    base_url = "https://api.example.com"
    sdk = H5Lite(base_url)
    print(f"H5Lite SDK initialized with base URL: {base_url}")

    # Test with custom parameters
    sdk_custom = H5Lite(
        base_url="https://api.example.com",
        timeout=60,
        verify_ssl=True
    )
    print(f"H5Lite SDK initialized with custom parameters")

    # Test singleton pattern
    H5Lite.INSTANCE = None  # Reset for testing
    instance1 = H5Lite.get_instance("https://api.example.com")
    instance2 = H5Lite.get_instance()
    print(f"Singleton test - Same instance: {instance1 is instance2}")

    # Note: Actual usage would require proper UpdateLogRequest and UpdateEventRequest objects
    # Example:
    # log_request = UpdateLogRequest(...)
    # response = sdk.update_log(log_request)
