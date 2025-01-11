# Inheritance in Java (Short Overview)

**Inheritance** is a mechanism in Java where one class acquires the properties and behaviors of another class. It promotes code reuse and establishes a parent-child relationship between classes.

## Key Points

### Definition
Inheritance allows a class (child) to inherit fields and methods from another class (parent).

### Syntax
```java
class Parent {
    void display() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method.");
    }
}
```

# Types of Inheritance in Java

## 1. Single Inheritance
- **Definition**: One class inherits from another, forming a parent-child relationship.

## 2. Multilevel Inheritance
- **Definition**: A class inherits from another class, which is then inherited by a third class.

## 3. Hierarchical Inheritance
- **Definition**: Multiple classes inherit from a single parent class.

## 4. Hybrid Inheritance
- **Definition**: A combination of two or more types of inheritance (not directly supported in Java, but can be achieved using interfaces).

## 5. Multiple Inheritance
- **Definition**: A class inherits from multiple sources (achieved only through interfaces in Java).
