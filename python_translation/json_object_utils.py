"""
JsonObjectUtils Python Translation

Original Java file: sources/c13/nim5/ez8/h5_proto/JsonObjectUtils.java
Package: c13.nim5.ez8.h5_proto

This module provides utility functions for converting objects to/from JSON dictionaries
using reflection (introspection in Python).
"""

from typing import Any, Dict, List, Type, TypeVar, get_type_hints, get_origin, get_args
import inspect
from dataclasses import is_dataclass, fields as dataclass_fields


T = TypeVar('T')


class JsonObjectUtils:
    """
    Utility class for converting Python objects to/from JSON dictionaries.
    Supports dataclasses, primitive types, and nested objects.
    """

    @staticmethod
    def to_json_object(obj: Any) -> Dict[str, Any]:
        """
        Convert a Python object to a JSON-compatible dictionary.

        Args:
            obj: Object to convert (preferably a dataclass)

        Returns:
            Dictionary representation of the object

        Raises:
            ValueError: If conversion fails
        """
        if obj is None:
            return None

        json_obj = {}

        try:
            # Get all fields from the object
            if is_dataclass(obj):
                # Handle dataclasses
                for field in dataclass_fields(obj):
                    field_name = field.name
                    field_value = getattr(obj, field_name)

                    if field_value is None:
                        json_obj[field_name] = JsonObjectUtils._get_default_value(field.type)
                    elif JsonObjectUtils._is_primitive_or_wrapper(type(field_value)) or isinstance(field_value, str):
                        json_obj[field_name] = field_value
                    elif isinstance(field_value, list):
                        json_array = []
                        for item in field_value:
                            if JsonObjectUtils._is_primitive_or_wrapper(type(item)) or isinstance(item, str):
                                json_array.append(item)
                            else:
                                json_array.append(JsonObjectUtils.to_json_object(item))
                        json_obj[field_name] = json_array
                    else:
                        json_obj[field_name] = JsonObjectUtils.to_json_object(field_value)
            else:
                # Handle regular objects using __dict__
                for field_name, field_value in obj.__dict__.items():
                    if field_value is None:
                        json_obj[field_name] = None
                    elif JsonObjectUtils._is_primitive_or_wrapper(type(field_value)) or isinstance(field_value, str):
                        json_obj[field_name] = field_value
                    elif isinstance(field_value, list):
                        json_array = []
                        for item in field_value:
                            if JsonObjectUtils._is_primitive_or_wrapper(type(item)) or isinstance(item, str):
                                json_array.append(item)
                            else:
                                json_array.append(JsonObjectUtils.to_json_object(item))
                        json_obj[field_name] = json_array
                    else:
                        json_obj[field_name] = JsonObjectUtils.to_json_object(field_value)

            return json_obj

        except Exception as e:
            raise ValueError(f"Error converting object to JSON: {e}") from e

    @staticmethod
    def from_json_object(json_obj: Dict[str, Any], cls: Type[T]) -> T:
        """
        Create an object from a JSON dictionary.

        Args:
            json_obj: Dictionary to convert
            cls: Class type to instantiate

        Returns:
            Instance of the specified class

        Raises:
            ValueError: If conversion fails
        """
        if json_obj is None:
            return None

        try:
            # Create instance
            instance = cls()

            # Get all fields
            if is_dataclass(cls):
                # Handle dataclasses
                for field in dataclass_fields(cls):
                    field_name = field.name
                    field_type = field.type

                    if field_name not in json_obj or json_obj[field_name] is None:
                        setattr(instance, field_name, JsonObjectUtils._get_default_value(field_type))
                    else:
                        field_value = json_obj[field_name]

                        if JsonObjectUtils._is_primitive_or_wrapper(field_type) or field_type == str:
                            setattr(instance, field_name, JsonObjectUtils._convert_primitive(field_value, field_type))
                        elif get_origin(field_type) == list or field_type == list:
                            if isinstance(field_value, list):
                                converted_list = []
                                for item in field_value:
                                    converted_list.append(item)
                                setattr(instance, field_name, converted_list)
                        elif isinstance(field_value, dict):
                            setattr(instance, field_name, JsonObjectUtils.from_json_object(field_value, field_type))
            else:
                # Handle regular objects
                for field_name, field_value in json_obj.items():
                    if hasattr(instance, field_name):
                        setattr(instance, field_name, field_value)

            return instance

        except Exception as e:
            raise ValueError(f"Error creating object from JSON: {e}") from e

    @staticmethod
    def _is_primitive_or_wrapper(cls: Type) -> bool:
        """
        Check if a type is a primitive or wrapper type.

        Args:
            cls: Type to check

        Returns:
            True if primitive or wrapper type
        """
        primitive_types = (bool, int, float, bytes, bytearray)
        return cls in primitive_types

    @staticmethod
    def _convert_primitive(value: Any, target_type: Type) -> Any:
        """
        Convert a value to a primitive type.

        Args:
            value: Value to convert
            target_type: Target type

        Returns:
            Converted value
        """
        if target_type == bool:
            return bool(value)
        elif target_type == int:
            return int(value)
        elif target_type == float:
            return float(value)
        elif target_type == str:
            return str(value)
        else:
            return value

    @staticmethod
    def _get_default_value(cls: Type) -> Any:
        """
        Get the default value for a type.

        Args:
            cls: Type to get default value for

        Returns:
            Default value for the type
        """
        if cls == bool:
            return False
        elif cls == int:
            return 0
        elif cls == float:
            return 0.0
        elif cls == str:
            return ""
        elif get_origin(cls) == list or cls == list:
            return []
        else:
            try:
                return cls()
            except:
                return None


# Example usage and test
if __name__ == "__main__":
    from dataclasses import dataclass
    from typing import List

    @dataclass
    class Person:
        name: str = ""
        age: int = 0
        email: str = ""

    @dataclass
    class Team:
        team_name: str = ""
        members: List[Person] = None

        def __post_init__(self):
            if self.members is None:
                self.members = []

    # Test object to JSON
    person1 = Person(name="Alice", age=30, email="alice@example.com")
    person2 = Person(name="Bob", age=25, email="bob@example.com")

    team = Team(team_name="Engineering", members=[person1, person2])

    json_data = JsonObjectUtils.to_json_object(team)
    print(f"Team as JSON: {json_data}")

    # Test JSON to object
    # Note: This is a simplified version, full type inference would require more work
    # In practice, you'd need to specify the types for nested objects
