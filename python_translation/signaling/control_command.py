"""Control command for WebRTC signaling protocol."""

from dataclasses import dataclass
from typing import Dict, Any, Union
from abc import ABC, abstractmethod

from .click_event import ClickEvent
from .scroll_event import ScrollEvent
from .text_input import TextInput


class ControlCommand(ABC):
    """
    Abstract base class for control commands in the WebRTC signaling protocol.
    Control commands represent user input events like clicks, scrolls, and text input.
    """

    @abstractmethod
    def to_dict(self) -> Dict[str, Any]:
        """Convert this control command to a dictionary."""
        pass

    @staticmethod
    def from_dict(data: Dict[str, Any]) -> 'ControlCommand':
        """
        Create a ControlCommand instance from a dictionary.

        Args:
            data: Dictionary containing the control command data

        Returns:
            A ControlCommand subclass instance based on the type field

        Raises:
            ValueError: If the type is unknown or missing
        """
        cmd_type = data.get('type', '')

        if cmd_type == 'click':
            click_data = data.get('click', {})
            return ClickCommand(ClickEvent.from_dict(click_data))
        elif cmd_type == 'scroll':
            scroll_data = data.get('scroll', {})
            return ScrollCommand(ScrollEvent.from_dict(scroll_data))
        elif cmd_type == 'input':
            input_data = data.get('input', {})
            return InputCommand(TextInput.from_dict(input_data))
        else:
            raise ValueError(f'Unknown control command type: {cmd_type}')


@dataclass
class ClickCommand(ControlCommand):
    """
    Represents a click command containing click event data.
    """

    click: ClickEvent

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this ClickCommand to a dictionary.

        Returns:
            Dictionary representation of the ClickCommand
        """
        return {
            'type': 'click',
            'click': self.click.to_dict()
        }


@dataclass
class ScrollCommand(ControlCommand):
    """
    Represents a scroll command containing scroll event data.
    """

    scroll: ScrollEvent

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this ScrollCommand to a dictionary.

        Returns:
            Dictionary representation of the ScrollCommand
        """
        return {
            'type': 'scroll',
            'scroll': self.scroll.to_dict()
        }


@dataclass
class InputCommand(ControlCommand):
    """
    Represents an input command containing text input data.
    """

    input: TextInput

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert this InputCommand to a dictionary.

        Returns:
            Dictionary representation of the InputCommand
        """
        return {
            'type': 'input',
            'input': self.input.to_dict()
        }
