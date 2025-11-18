"""Check signaling plugin start request for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any, Optional
import sys
import os

# Add parent directory to path to import Atom
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
from models import Atom


@dataclass
class CheckSignalingPluginStartRequest:
    """
    Represents a request to check if the signaling plugin should start.
    Used to query the server about whether to initiate a signaling session.
    """

    atom: Optional[Atom] = None

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'CheckSignalingPluginStartRequest':
        """
        Create a CheckSignalingPluginStartRequest instance from a dictionary.

        Args:
            data: Dictionary containing the request data

        Returns:
            A new CheckSignalingPluginStartRequest instance
        """
        atom_data = data.get('atom')
        atom = Atom.from_dict(atom_data) if atom_data else None

        return CheckSignalingPluginStartRequest(atom=atom)

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this CheckSignalingPluginStartRequest instance to a dictionary.

        Returns:
            Dictionary representation of the CheckSignalingPluginStartRequest
        """
        return {
            'atom': self.atom.to_dict() if self.atom else {}
        }
