Sure! Here's the **entire note** with the original 20 points plus the newly added sections on **Conditionals** and **Loops in Java** combined.

---

### Obsidian Notes: Core Java Concepts

#### 1. **Static Block Execution**
- **What is a static block?**  
  A `static` block in Java is a block of code that gets executed when the class is first loaded into memory, before any instance of the class is created.

- **Key Concept:**  
  Static blocks are executed **once** per class load and are useful for initializing static variables. They execute **before the constructor**.

- **Example:**
  ```java
  public class Test {
      static {
          int x = 20;
          System.out.print(x + " ");  // This executes first
      }

      int x = 10;
      
      public static void main(String[] args) {
          Test t = new Test();
          System.out.println(t.x);  // Then this prints the value of instance variable x
      }
  }
  // Output: 20 10
  ```

---

#### 2. **Primitive Types vs. Wrapper Classes**
- **Primitive Data Types:**  
  Java has eight primitive data types: `int`, `char`, `double`, `boolean`, `float`,`long`, `short`, `byte`.

- **Wrapper Classes:**  
  Every primitive data type has an equivalent wrapper class (e.g., `Integer` for `int`, `Double` for `double`). Wrapper classes are used for working with collections, nullability, and object-related operations.

- **Methods in Wrapper Classes:**
    - `Integer.parseInt()`: Converts a `String` to an `int`.
    - `Integer.valueOf()`: Converts a `String` or `int` to an `Integer` object.
    - Constants like `Integer.MAX_VALUE`, `Integer.MIN_VALUE`.

- **Example:**
  ```java
  int num = 5;  // Primitive
  Integer wrapperNum = Integer.valueOf(num);  // Wrapper class
  System.out.println(Integer.MAX_VALUE);  // Prints the maximum value an int can hold
  ```

---

#### 3. **Difference Between `==` and `.equals()`**
- **`==` Operator:**  
  Compares **references** (for objects) and **values** (for primitives).

- **`.equals()` Method:**  
  Used to compare the actual **content** or **values** inside the object.

- **Example:**
  ```java
  Integer a = new Integer(10);
  Integer b = new Integer(10);

  System.out.println(a == b);        // false (compares references)
  System.out.println(a.equals(b));   // true (compares values)
  ```

---

#### 4. **The `final` Keyword**
- **Variables:**  
  Once a variable is declared as `final`, its value cannot be changed.

- **Methods:**  
  A `final` method cannot be overridden by subclasses.

- **Classes:**  
  A `final` class cannot be subclassed (e.g., `String` is a `final` class in Java).

- **Example:**
  ```java
  final int x = 10;
  x = 20;  // Error: cannot assign a value to final variable
  ```

---

#### 5. **String Immutability**
- **What does immutable mean?**  
  Once a `String` object is created, it cannot be modified. Any operations like concatenation or substring creation result in new `String` objects being created.

- **Why are Strings immutable?**  
  Immutability helps in **security**, **performance** (string pool), and **thread safety**.

- **Example:**
  ```java
  String s = "Hello";
  s = s.concat(" World");  // A new String object is created
  System.out.println(s);   // "Hello World"
  ```

---

#### 6. **Garbage Collection**
- **What is garbage collection?**  
  Garbage collection is the process by which Java programs perform automatic memory management. Java automatically removes objects that are no longer reachable in memory.

- **Key Concept:**  
  You can't force garbage collection, but you can **suggest** it using `System.gc()`. Java's garbage collector uses algorithms like **Mark and Sweep** to reclaim memory.

---

#### 7. **Exceptions and Exception Handling**
- **Checked Exceptions:**  
  These are exceptions that must be either caught or declared in the method using `throws`.  
  **Examples:**
    - `IOException`
    - `SQLException`
    - `FileNotFoundException`

- **Unchecked Exceptions:**  
  These are exceptions that are not required to be handled.  
  **Examples:**
    - `NullPointerException`
    - `ArrayIndexOutOfBoundsException`
    - `ArithmeticException`
    - `IllegalArgumentException`

- **Try-Catch Block:**  
  A mechanism to handle exceptions to avoid program crashes.

  ```java
  try {
      int result = 10 / 0;
  } catch (ArithmeticException e) {
      System.out.println("Division by zero error.");
  } finally {
      System.out.println("This will always execute.");
  }
  ```

---

#### 8. **Constructors**
- **Default Constructor:**  
  If no constructor is defined, Java provides a no-argument default constructor.

- **Parameterized Constructor:**  
  A constructor with parameters to initialize objects with different values.

- **Constructor Overloading:**  
  Having multiple constructors with different parameter lists in the same class.

---

#### 9. **The `this` Keyword**
- **What is `this`?**  
  The `this` keyword refers to the current object in a method or constructor.

- **Usage:**
    1. To avoid naming conflicts between instance variables and parameters.
    2. To call other constructors within the same class.

- **Example:**
  ```java
  public class Example {
      int x;
      
      Example(int x) {
          this.x = x;  // this.x refers to the instance variable
      }
  }
  ```

---

#### 10. **Method Overloading vs. Method Overriding**
- **Method Overloading:**  
  Defining multiple methods with the same name but different parameters within the same class.

- **Method Overriding:**  
  Redefining a method of a parent class in a subclass with the same method signature.

- **Example of Overloading:**
  ```java
  public int add(int a, int b) {
      return a + b;
  }
  
  public double add(double a, double b) {
      return a + b;
  }
  ```

- **Example of Overriding:**
  ```java
  class Parent {
      void show() {
          System.out.println("Parent class");
      }
  }

  class Child extends Parent {
      @Override
      void show() {
          System.out.println("Child class");
      }
  }
  ```

---

#### 11. **Access Modifiers**
- **Public:** Accessible from any class.
- **Private:** Accessible only within the same class.
- **Protected:** Accessible within the same package and subclasses.
- **Default (Package-Private):** Accessible only within the same package.

---

#### 12. **Multithreading**
- **What is Multithreading?**  
  Multithreading is a Java feature that allows concurrent execution of two or more threads for maximum utilization of CPU.

- **Creating Threads:**
    1. **By Extending `Thread` Class:**
       ```java
       class MyThread extends Thread {
           public void run() {
               System.out.println("Thread running");
           }
       }
  
       public class Test {
           public static void main(String[] args) {
               MyThread t = new MyThread();
               t.start();
           }
       }
       ```
    2. **By Implementing `Runnable` Interface:**
       ```java
       class MyRunnable implements Runnable {
           public void run() {
               System.out.println("Runnable thread running");
           }
       }
  
       public class Test {
           public static void main(String[] args) {
               Thread t = new Thread(new MyRunnable());
               t.start();
           }
       }
       ```

- **Thread Lifecycle Methods:**
    - `start()`: Starts the thread.
    - `run()`: Contains the code executed by the thread.
    - `sleep(long millis)`: Pauses the thread for the specified time.
    - `join()`: Waits for the thread to finish execution.

---

#### 13. **Thread Safety**
- **What is Thread Safety?**  
  Thread safety ensures that shared data is accessed by multiple threads without causing inconsistencies or unexpected behavior.

- **Synchronization:**
    - **Synchronized Methods:**  
      Ensures that only one thread can access a method at a time.
      ```java
      public synchronized void increment() {
          count++;
      }
      ```
    - **Synchronized Blocks:**  
      Fine-grained control over synchronization.
      ```java
      public void increment() {
          synchronized(this) {
              count++;
          }
      }
      ```

- **Volatile Keyword:**  
  Declares a variable as `volatile` to ensure visibility of its changes across threads.
  ```java
  private volatile boolean flag = true;
  ```

- **Concurrent Collections:**  
  Use classes from `java.util.concurrent` package like `ConcurrentHashMap`, `CopyOnWriteArrayList` for thread-safe operations.

---

#### 14. **Inbuilt Exceptions in Java**
- **List of Common Inbuilt Exceptions:**
    - **ArithmeticException:**  
      Thrown when an exceptional arithmetic condition occurs

(e.g., division by zero).
- **NullPointerException:**  
Thrown when attempting to access an object through a `null` reference.
- **ArrayIndexOutOfBoundsException:**  
Thrown when attempting to access an array with an illegal index.
- **ClassCastException:**  
Thrown when an object is incorrectly cast to another class.

---

#### 15. **Java Packages**
- **What are Packages?**  
  A package in Java is a namespace that organizes classes and interfaces, preventing naming conflicts and providing access protection.

- **Types of Packages:**
    1. **Built-in Packages:**  
       Java provides a rich set of pre-built packages like `java.util`, `java.io`, `java.lang`.
    2. **User-defined Packages:**  
       You can create your own packages to organize classes.

  **Example of Package Declaration:**
  ```java
  package myPackage;
  
  public class MyClass {
      // class code
  }
  ```

---

#### 16. **Collections in Java**
- **List Interface:**  
  An ordered collection (also known as a sequence).
  ```java
  List<String> list = new ArrayList<>();
  list.add("Apple");
  list.add("Banana");
  ```

- **Set Interface:**  
  A collection that contains no duplicate elements.
  ```java
  Set<String> set = new HashSet<>();
  set.add("Apple");
  set.add("Banana");
  ```

- **Map Interface:**  
  An object that maps keys to values. Duplicate keys are not allowed.
  ```java
  Map<String, Integer> map = new HashMap<>();
  map.put("Apple", 1);
  map.put("Banana", 2);
  ```

- **Queue Interface:**  
  A collection for holding elements before processing, following FIFO (First In, First Out) order.
  ```java
  Queue<String> queue = new LinkedList<>();
  queue.add("Apple");
  queue.add("Banana");
  ```

---

#### 17. **Generics**
- **What are Generics?**  
  Generics allow types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. This helps achieve type safety and reduces the need for typecasting.

- **Example of Generic Class:**
  ```java
  public class Box<T> {
      private T t;
  
      public void set(T t) {
          this.t = t;
      }
  
      public T get() {
          return t;
      }
  }
  ```

---

#### 18. **Streams API**
- **What is Streams API?**  
  Introduced in Java 8, the Streams API is used to process collections of objects in a functional style, allowing operations like filtering, mapping, and reducing.

- **Example:**
  ```java
  List<String> list = Arrays.asList("apple", "banana", "orange");
  List<String> filteredList = list.stream()
                                  .filter(s -> s.startsWith("a"))
                                  .collect(Collectors.toList());
  ```

---

#### 19. **Lambda Expressions**
- **What are Lambda Expressions?**  
  Lambda expressions are a way to provide a clear and concise syntax for writing anonymous methods (functions). They are used to implement functional interfaces in Java.

- **Syntax:**
  ```java
  (parameters) -> expression
  (parameters) -> { statements; }
  ```

- **Example:**
  ```java
  List<String> list = Arrays.asList("apple", "banana", "orange");
  list.forEach(s -> System.out.println(s));
  ```

---

#### 20. **Optional Class**
- **What is the `Optional` class?**  
  Introduced in Java 8, `Optional` is a container object which may or may not contain a non-null value. It is used to avoid null pointer exceptions.

- **Example:**
  ```java
  Optional<String> opt = Optional.ofNullable(null);
  System.out.println(opt.isPresent());  // false
  ```

---

#### 21. **Conditionals**

- **If-Else:**
    - Basic conditional statement used to execute code based on whether a condition is true or false.
    - Example:
      ```java
      int x = 10;
      if (x > 5) {
          System.out.println("x is greater than 5");
      } else {
          System.out.println("x is less than or equal to 5");
      }
      ```

- **Switch Case:**
    - An alternative to multiple `if-else` conditions, commonly used for handling multiple discrete values of a variable.
    - Example:
      ```java
      int day = 2;
      switch(day) {
          case 1:
              System.out.println("Sunday");
              break;
          case 2:
              System.out.println("Monday");
              break;
          default:
              System.out.println("Invalid day");
      }
      ```

---

#### 22. **Loops**

- **For Loop:**
    - Executes a block of code a fixed number of times.
    - Example:
      ```java
      for (int i = 0; i < 5; i++) {
          System.out.println("i: " + i);
      }
      ```

- **While Loop:**
    - Executes a block of code as long as the condition remains true.
    - Example:
      ```java
      int i = 0;
      while (i < 5) {
          System.out.println("i: " + i);
          i++;
      }
      ```

- **Do-While Loop:**
    - Similar to the `while` loop, but ensures the loop is executed at least once before checking the condition.
    - Example:
      ```java
      int i = 0;
      do {
          System.out.println("i: " + i);
          i++;
      } while (i < 5);
      ```

---
