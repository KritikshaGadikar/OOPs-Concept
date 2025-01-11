### When we have to keep the things common to all
### It can't be change 
### we should not use this keyword to define class 

### Static in Java

The `static` keyword in Java is used to create members of a class that belong to the class itself rather than to any specific instance of the class. These members are shared across all objects of the class.

#### Key Uses of `static`:
1. **Static Fields (Variables)**:
    - A static field is shared among all instances of the class.
    - It is initialized only once at the time of class loading.
    - Useful for creating constants or tracking shared data.

   Example:
   ```java
   class Example {
       static int count = 0;  // Shared across all objects
   }
   ```
- we can save memory by this as it is static so memory is allocated once but for object it is allocated multiple times.