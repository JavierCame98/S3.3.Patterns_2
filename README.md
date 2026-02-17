# S.3.3.Patterns_2

This repository demonstrates the implementation of the Builder Design Pattern, specifically focusing on the Fluent Builder and Progressive Interface approaches to manage complex object creation.

## Design Pattern: Builder
The Builder is a creational design pattern that allows for the step-by-step construction of complex objects. It separates the construction logic from the object's representation, making the code more readable and maintainable.
Purpose
Avoids "Telescoping Constructors": Eliminates constructors with long, confusing lists of parameters.
Fluent Interface: Enables method chaining for a more expressive and natural coding style.
Order Enforcement: Through Progressive Interfaces, it ensures that steps are followed in a logical sequence (e.g., you cannot add a dessert before a main course).
Encapsulation: Keeps the internal representation of a complex object hidden from the client.

## Exercise: Restaurant Menu System
Implement a flexible system to build restaurant menus using a Fluent Builder. The system must enforce business rules and logical dependencies during construction.
Business Rules & Features
Progressive Construction: The API guides the user through the steps (Entrant → Main Course → Dessert/Coffee → Drink).
Logical Constraints: * If a Dessert is chosen, Coffee cannot be added, and vice versa.
Specific items can be marked as isVegan() or isGlutenFree() without using confusing boolean flags.
Flexibility: Supports full menus, "Half Menus" (Main + Drink), and "Kids Menus" (Main + Dessert + Drink).
Optional Components: Drinks and Desserts are optional, but the construction must remain type-safe.

## Technical Implementation
Progressive Interfaces: Interfaces like IMainCourseStep, IDessertStep, and IDrinkStep are used to restrict which methods are available at each stage of construction.
Fluent API: Methods return the next valid interface to allow chaining.
SOLID Principles: High level of abstraction and single responsibility for each building step.


## Technologies & Testing
Backend: Java 17+
Testing: JUnit 5
Key Concepts: Method Chaining, Interface Segregation, Step-wise construction.
The implementation is validated through Unit Tests that verify:
Correct string representation of the built menus.
Enforcement of dietary flags (Vegan/Gluten-Free).
Compile-time prevention of illegal sequences (like adding two desserts).
