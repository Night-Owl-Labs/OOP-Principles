# Object-Oriented Programming (OOP) Principles

## Overview

This repository provides a brief explanation of the four main principles of Object-Oriented Programming (OOP) along with corresponding examples in Java.<br>
**Note:** The OOP principals apply to all Objective Oriented languages, I just used Java for this example but I encourage you to apply them in the language of your choice.

## 1. Encapsulation

Encapsulation is the practice of bundling data and methods that operate on that data within a single unit (object). It helps protect the object's internal state from direct manipulation and enforces controlled access through well-defined methods.

Example in Java:

```java
class BankAccount {
    private double balance;

    // Getter method to access the balance (read-only)
    public double getBalance() {
        return balance;
    }

    // Setter method to update the balance (write-only)
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
```

In this example, the `balance` data member is encapsulated within the `BankAccount` class. External code cannot directly modify the `balance`, but it can interact with the account through the `deposit` and `withdraw` methods, which ensure controlled access to the balance.

## 2. Abstraction

Abstraction involves simplifying complex reality by creating classes that represent essential characteristics and behaviors while hiding unnecessary details.

Example in Java:

```java
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
```

Here, the `Shape` class is an abstract class that defines the concept of a shape with an abstract method `calculateArea()`. The `Circle` and `Rectangle` classes are concrete subclasses that extend `Shape` and provide their implementations for the `calculateArea()` method. The details of the shape's type (circle or rectangle) are abstracted away, and we can work with shapes in a more generalized manner.

## 3. Inheritance

Inheritance allows a class (subclass) to inherit properties and behaviors from another class (superclass). It promotes code reuse and supports the "is-a" relationship.

Example in Java:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
```

In this example, the `Animal` class serves as the superclass, and `Dog` and `Cat` are subclasses. They inherit the `makeSound()` method from the `Animal` class, but each subclass provides its implementation, representing the "is-a" relationship between animals and specific types of animals.

## 4. Polymorphism

Polymorphism allows objects to take on multiple forms or methods to have multiple implementations. It enables a unified interface for different classes.

Example in Java:

```java
class Printer {
    void print(String content) {
        System.out.println("Printing: " + content);
    }
}

class LaserPrinter extends Printer {
    @Override
    void print(String content) {
        System.out.println("Laser printing: " + content);
    }
}

class InkjetPrinter extends Printer {
    @Override
    void print(String content) {
        System.out.println("Inkjet printing: " + content);
    }
}
```

In this example, the `Printer` class has a `print()` method, and both `LaserPrinter` and `InkjetPrinter` are subclasses of `Printer`. Depending on the object type, the appropriate implementation of the `print()` method is invoked at runtime, achieving polymorphic behavior.

## Conclusion

Understanding and applying these four principles of Object-Oriented Programming in Java can lead to more organized, reusable, and maintainable code. Feel free to explore the provided examples and experiment further with OOP concepts. Happy coding!