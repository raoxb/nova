"""Done message for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any


@dataclass
class Done:
    """
    Represents a done/completion message in the signaling protocol.
    This is a marker class with no fields.
    """

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'Done':
        """
        Create a Done instance from a dictionary.

        Args:
            data: Dictionary (ignored, no fields to parse)

        Returns:
            A new Done instance
        """
        return Done()

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this Done instance to a dictionary.

        Returns:
            Empty dictionary
        """
        return {}

    def __eq__(self, other: object) -> bool:
        """Check equality - all Done instances are equal."""
        return isinstance(other, Done)

    def __hash__(self) -> int:
        """Hash based on class name."""
        return hash(Done.__name__)
