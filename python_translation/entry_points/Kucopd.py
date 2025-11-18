"""
Kucopd entry point (translated from Java)
Original: com/nied/lduvv/Kucopd.java
"""

from __future__ import annotations
from typing import Optional, Any
import threading
import sys
import os

# Add parent directory to path
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

# Android placeholder types
Context = Any  # Android Context placeholder


class Kucopd:
    """
    Kucopd entry point class.
    Initializes the system with Android context and session ID.

    Original package: com.nied.lduvv
    """

    class Worker:
        """
        Inner worker class that runs initialization in a separate thread.
        Original inner class: llllIIIIll1
        """

        def __init__(self, context: Context, session_id: str):
            """
            Initialize worker.

            Args:
                context: Android context
                session_id: Session identifier string
            """
            self.context = context
            self.session_id = session_id

        def run(self):
            """
            Run the initialization task.
            Calls the main initialization method with context and session ID.
            """
            try:
                # Import at runtime to avoid circular dependencies
                from utils.IlIlllIIlI1.llllIllIl1 import llllIllIl1

                # Initialize the system with context, session_id, and None atom
                initializer = llllIllIl1()

                if hasattr(initializer, 'llllIIIIll1'):
                    initializer.llllIIIIll1(self.context, self.session_id, None)
                else:
                    print(f"Warning: llllIllIl1 has no llllIIIIll1 method")

            except Exception as e:
                print(f"Kucopd initialization error: {e}")
                raise RuntimeError(f"Initialization error: {e}")

    @staticmethod
    def init(context: Context, session_id: str):
        """
        Initialize system with context and session ID.

        Args:
            context: Android context
            session_id: Session identifier string

        Example:
            Kucopd.init(android_context, "session_12345")
        """
        worker = Kucopd.Worker(context, session_id)
        thread = threading.Thread(target=worker.run)
        thread.start()


def init(context: Context, session_id: str):
    """
    Convenience function for Kucopd initialization.

    Args:
        context: Android context
        session_id: Session identifier string
    """
    Kucopd.init(context, session_id)
