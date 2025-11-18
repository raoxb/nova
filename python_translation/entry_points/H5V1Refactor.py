"""
H5 V1 Refactor entry point (translated from Java)
Original: com/idlmlpugdw/h5_v1_refactor/H5V1Refactor.java
"""

from __future__ import annotations
from typing import Optional, Any
import threading
import json
import sys
import os

# Add parent directory to path
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

# Android placeholder types
Context = Any  # Android Context placeholder

try:
    from models import Atom
except ImportError:
    Atom = Any


class H5V1Refactor:
    """
    H5 V1 Refactor entry point class.
    Initializes the H5 system with JSON configuration and Android context.

    Original package: com.idlmlpugdw.h5_v1_refactor
    """

    class Worker:
        """
        Inner worker class that runs initialization in a separate thread.
        Original inner class: llllIIIIll1
        """

        def __init__(self, json_config: str, context: Context):
            """
            Initialize worker.

            Args:
                json_config: JSON configuration string
                context: Android context
            """
            self.json_config = json_config
            self.context = context

        def run(self):
            """
            Run the initialization task.
            Parses JSON config and initializes the system.
            """
            try:
                # Import at runtime to avoid circular dependencies
                from utils.IlIlllIIlI1.llllIllIl1 import llllIllIl1
                from utils.lIIlllIIIlllII1.llllIllIl1 import llllIllIl1 as ConfigClass

                # Parse JSON configuration
                config_obj = json.loads(self.json_config)

                # Create Atom from JSON
                if Atom is not Any:
                    atom = Atom.from_json_object(config_obj)
                else:
                    atom = config_obj

                # Initialize the system
                # llllIllIl1().llllIIIIll1(context, session_id, atom)
                initializer = llllIllIl1()
                session_id = getattr(ConfigClass, 'f377llllIllIl1', 'default_session')

                if hasattr(initializer, 'llllIIIIll1'):
                    initializer.llllIIIIll1(self.context, session_id, atom)

            except json.JSONDecodeError as e:
                raise RuntimeError(f"JSON parsing error: {e}")
            except Exception as e:
                raise RuntimeError(f"Initialization error: {e}")

    @staticmethod
    def init(context: Context, json_config: str):
        """
        Initialize H5 system with configuration.

        Args:
            context: Android context
            json_config: JSON configuration string

        Example:
            H5V1Refactor.init(android_context, '{"key": "value"}')
        """
        worker = H5V1Refactor.Worker(json_config, context)
        thread = threading.Thread(target=worker.run)
        thread.start()


def init(context: Context, json_config: str):
    """
    Convenience function for H5 initialization.

    Args:
        context: Android context
        json_config: JSON configuration string
    """
    H5V1Refactor.init(context, json_config)
