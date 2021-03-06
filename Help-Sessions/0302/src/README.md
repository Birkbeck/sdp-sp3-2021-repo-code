# SOLID - OOP Design Principles

+ Proposed (but not named) by Robert C. Martin (Uncle Bob)
+ 2000 paper Design Principles and Design Patterns
+ OOP software design more understandable and maintainable
+ Analogous to *Normalisation* in database theory

## S - Single Responsibility Principle

+ Do one thing and do it well
+ Avoid "God-like" objects
+ Responsibility - *reason to change*

## O - Open/Closed Principle

+ Closed for modification
+ Open for extension

## L - Liskov Substitution Principle

+ Barbara Liskov @ MIT
+ Substitute every subclass (or derived type) for their base (parent) class (type).
+ Breaking example - List iterator in Java which has a `remove` method. 

## I - Interface Segregation Principle

+ A client should never be forced to implement an interface it does not use.
+ A client should never be required to implement methods it will **never** use.

## D - Dependency Inversion Principle

+ Entities must depend upon *abstractions*, i.e., interfaces.
+ High level modules must not depend on low level modules.
