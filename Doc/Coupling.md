### **Coupling (Definition)**
Coupling refers to the level of dependency between classes or modules in a program.

---

### **Loose Coupling**
- Classes are independent and interact through well-defined interfaces or abstractions.
- Promotes flexibility, maintainability, and scalability.
- **Example:** Using dependency injection.

---

### **Tight Coupling**
- Classes are highly dependent on each other’s implementations.
- Reduces flexibility and makes code harder to maintain.
- **Example:** A class directly instantiates another class.  

```java
//Loose coupling
// Interface
interface Animal {
    void sound();
}

// Dog class implements Animal
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class implements Animal
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Can be swapped with Cat
        animal.sound();
    }
}
```

```java
//Tight coupling

class Dog {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Tight coupling
        dog.sound();
    }
}
```

