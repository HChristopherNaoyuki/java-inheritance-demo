# ICE TASK 4 - Demonstrating Inheritance

## Description
This project showcases the concept of inheritance in Java by creating a general `Party` class and a specialized `DinnerParty` subclass. The `DinnerParty` class extends the functionality of the `Party` class by adding a dinner menu feature. This example illustrates how subclassing allows for more specific versions of a general class while maintaining shared behaviors.

## Features
- **Party Class**: Represents a general event with the ability to set and get the number of guests.
- **DinnerParty Class**: Inherits from the `Party` class and adds functionality for managing a dinner menu.
- **JUnit Tests**: Includes test classes to validate the functionality of both the `Party` and `DinnerParty` classes.

## Classes
- `Party`: A class that encapsulates basic properties and behaviors of a party.
- `DinnerParty`: A subclass of `Party` that includes a dinner menu.
- `Main`: Demonstrates the usage of the `Party` and `DinnerParty` classes.
- `PartyTest`: Unit tests for the `Party` class.
- `DinnerPartyTest`: Unit tests for the `DinnerParty` class.

## Usage
1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE.
3. Compile all classes.
4. Run the `Main` class to see the demonstration of both the `Party` and `DinnerParty` classes.
5. Run the test classes `PartyTest` and `DinnerPartyTest` to validate functionality.

## Example Output
```
Party with 50 guests.
Party with 25 guests.
Dinner menu: Italian Cuisine
```

## Testing
To run the tests, you need a JUnit testing environment set up in your IDE. The tests validate the following:
- Setting and getting the number of guests in the `Party` class.
- Setting and getting the dinner menu in the `DinnerParty` class.
- Proper display of party details.

## Requirements
- Java Development Kit (JDK) 8 or higher
- IDE that supports Java (e.g., IntelliJ IDEA, Eclipse)
