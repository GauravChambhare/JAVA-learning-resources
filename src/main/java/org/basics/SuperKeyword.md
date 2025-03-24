The `super` keyword in Java is a reference variable used to refer to the immediate parent class of a subclass. It plays a crucial role in object-oriented programming by allowing subclasses to access members (fields, methods, and constructors) of their superclass. Here’s a detailed overview of its usage and characteristics:

### **Key Uses of the `super` Keyword**

1. **Accessing Superclass Methods**:
   - The `super` keyword can be used to call methods from the superclass that have been overridden in the subclass. This is useful when you want to extend the functionality of the superclass method rather than completely replace it.
   - **Example**:
     ```java
     class Animal {
         void display() {
             System.out.println("I am an animal.");
         }
     }

     class Dog extends Animal {
         void display() {
             super.display(); // Calls the display method of Animal
             System.out.println("I am a dog.");
         }
     }

     public class Main {
         public static void main(String[] args) {
             Dog dog = new Dog();
             dog.display();
         }
     }
     ```
   - **Output**:
     ```
     I am an animal.
     I am a dog.
     ```

2. **Accessing Superclass Fields**:
   - If a subclass has a field with the same name as one in its superclass, you can use `super` to access the superclass's field.
   - **Example**:
     ```java
     class Animal {
         String name = "Animal";
     }

     class Dog extends Animal {
         String name = "Dog";

         void display() {
             System.out.println("Superclass name: " + super.name); // Accesses Animal's name
             System.out.println("Subclass name: " + name); // Accesses Dog's name
         }
     }

     public class Main {
         public static void main(String[] args) {
             Dog dog = new Dog();
             dog.display();
         }
     }
     ```
   - **Output**:
     ```
     Superclass name: Animal
     Subclass name: Dog
     ```

3. **Invoking Superclass Constructors**:
   - The `super()` keyword is used to invoke the constructor of the superclass from within the subclass constructor. This is essential for initializing inherited members before initializing subclass members.
   - **Example**:
     ```java
     class Animal {
         Animal(String name) {
             System.out.println("Animal constructor called: " + name);
         }
     }

     class Dog extends Animal {
         Dog(String name) {
             super(name); // Calls the constructor of Animal
             System.out.println("Dog constructor called");
         }
     }

     public class Main {
         public static void main(String[] args) {
             Dog dog = new Dog("Buddy");
         }
     }
     ```
   - **Output**:
     ```
     Animal constructor called: Buddy
     Dog constructor called
     ```

### **Characteristics of the `super` Keyword**
- **Scope**: It can only be used within instance methods or constructors of a subclass.
- **Constructor Call**: The call to `super()` must be the first statement in a subclass constructor.
- **Static Context**: The `super` keyword cannot be used in static methods or static blocks.
- **Method Overriding**: If a method is not overridden in the subclass, calling it without `super` will automatically call the superclass's version.
