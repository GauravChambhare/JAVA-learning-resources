## Java Data Types

In Java, data types define the size and type of variables. Java's data types are categorized into two main groups:

- **Primitive Data Types**
- **Non-Primitive (Reference) Data Types**

### 1. **Primitive Data Types**
There are 8 primitive data types in Java, which store simple values.

#### 1.1 **byte**
- **Size**: 8 bits (1 byte)
- **Range**: -128 to 127
- **Default Value**: `0`
- **Usage**: Useful for saving memory in large arrays of integers.

Example:
```java
byte smallNumber = 100;
```

#### 1.2 **short**
- **Size**: 16 bits (2 bytes)
- **Range**: -32,768 to 32,767
- **Default Value**: `0`
- **Usage**: Useful in cases where memory is limited, and larger integer ranges aren’t needed.

Example:
```java
short mediumNumber = 30000;
```

#### 1.3 **int**
- **Size**: 32 bits (4 bytes)
- **Range**: -2^31 to 2^31 - 1 (-2,147,483,648 to 2,147,483,647)
- **Default Value**: `0`
- **Usage**: Most commonly used integer type for general-purpose numerical operations.

Example:
```java
int age = 25;
```

#### 1.4 **long**
- **Size**: 64 bits (8 bytes)
- **Range**: -2^63 to 2^63 - 1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
- **Default Value**: `0L`
- **Usage**: Used when the `int` range is insufficient.

Example:
```java
long distanceToSun = 149600000000L;
```

#### 1.5 **float**
- **Size**: 32 bits (4 bytes)
- **Range**: Approximately 6 to 7 decimal digits
- **Default Value**: `0.0f`
- **Usage**: Used to save memory in floating-point operations where double precision isn't required.

Example:
```java
float weight = 65.5f;
```

#### 1.6 **double**
- **Size**: 64 bits (8 bytes)
- **Range**: Approximately 15 decimal digits
- **Default Value**: `0.0d`
- **Usage**: The default choice for floating-point operations because of its higher precision.

Example:
```java
double pi = 3.141592653589793;
```

#### 1.7 **char**
- **Size**: 16 bits (2 bytes)
- **Range**: `\u0000` (0) to `\uffff` (65,535)
- **Default Value**: `\u0000`
- **Usage**: Stores single characters.

Example:
```java
char letter = 'A';
```

#### 1.8 **boolean**
- **Size**: 1 bit (JVM dependent)
- **Range**: `true` or `false`
- **Default Value**: `false`
- **Usage**: Used for simple true/false conditions.

Example:
```java
boolean isJavaFun = true;
```

### 2. **Wrapper Classes**
Each primitive type has a corresponding **Wrapper Class** in the `java.lang` package, providing additional functionality.

| Primitive Type | Wrapper Class |
|----------------|---------------|
| byte           | Byte          |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |
| char           | Character     |
| boolean        | Boolean       |

#### 2.1 **Key Methods and Properties of Wrapper Classes**
All wrapper classes contain helpful constants and methods for converting, comparing, and analyzing values.

##### Common Constants
- **`MAX_VALUE`**: The largest value a wrapper class can hold.
- **`MIN_VALUE`**: The smallest value a wrapper class can hold.

Example:
```java
System.out.println("Max int: " + Integer.MAX_VALUE); // Output: 2147483647
System.out.println("Min int: " + Integer.MIN_VALUE); // Output: -2147483648
```

##### Other Useful Methods
1. **`parseXXX(String s)`**: Converts a `String` into the primitive type.
    - Example:
      ```java
      int num = Integer.parseInt("100");
      ```

2. **`valueOf(String s)`**: Returns a wrapper class object (autoboxing).
    - Example:
      ```java
      Integer numObject = Integer.valueOf("100");
      ```

3. **`toString()`**: Converts the value into a `String`.
    - Example:
      ```java
      String str = Integer.toString(123);
      ```

4. **`compareTo(Wrapper obj)`**: Compares two wrapper objects.
    - Example:
      ```java
      Integer a = 10;
      Integer b = 20;
      System.out.println(a.compareTo(b)); // Output: -1 (a < b)
      ```

5. **`equals(Object obj)`**: Checks if two wrapper objects are equal.
    - Example:
      ```java
      Integer num1 = 100;
      Integer num2 = 100;
      System.out.println(num1.equals(num2)); // Output: true
      ```

6. **`intValue()`, `longValue()`, `floatValue()`, `doubleValue()`**: Converts wrapper objects back to primitives.
    - Example:
      ```java
      Integer num = 123;
      int primitiveNum = num.intValue();
      ```

##### Example of Using Wrapper Class Methods:
```java
Integer num = 100;
String numStr = num.toString();      // Converts Integer to String
int parsedNum = Integer.parseInt("100"); // Parses String to primitive int
Integer largerNum = Integer.valueOf("200"); // Returns an Integer object
System.out.println(num.compareTo(largerNum)); // Compares two Integer objects
```

### 3. **Type Conversion**
#### 3.1 **Implicit Type Conversion (Widening)**
Java automatically converts smaller types to larger types, e.g., `int` to `long`.

Example:
```java
int smallNum = 100;
long bigNum = smallNum; // Implicit widening
```

#### 3.2 **Explicit Type Conversion (Narrowing)**
Larger types must be explicitly cast into smaller types.

Example:
```java
long largeNum = 100000L;
int smallNum = (int) largeNum; // Explicit narrowing
```

### 4. **Autoboxing and Unboxing**
Java automatically converts between primitive types and their corresponding wrapper class objects.

#### 4.1 **Autoboxing**
Java automatically converts a primitive type into its wrapper class object.

Example:
```java
int num = 100;
Integer numObject = num; // Autoboxing
```

#### 4.2 **Unboxing**
Java automatically converts a wrapper class object back into its primitive type.

Example:
```java
Integer numObject = 100;
int num = numObject; // Unboxing
```

### 5. **Default Values**
Primitive types and wrapper classes have default values when declared but not initialized.

| Data Type  | Default Value |
|------------|---------------|
| byte       | 0             |
| short      | 0             |
| int        | 0             |
| long       | 0L            |
| float      | 0.0f          |
| double     | 0.0d          |
| char       | '\u0000'      |
| boolean    | false         |
| Object references | null |

### 6. **Non-Primitive (Reference) Data Types**
#### 6.1 **String**
- **Description**: Strings represent sequences of characters and are objects of the `String` class. Strings are **immutable**.
- **Memory**: Stored in the heap, but a reference is kept in the variable.

Example:
```java
String greeting = "Hello, Java!";
```

Common methods in `String` class:
- **`length()`**: Returns the length of the string.
- **`charAt(int index)`**: Returns the character at the specified index.
- **`substring(int beginIndex, int endIndex)`**: Returns a substring.

Example:
```java
String text = "Java Programming";
System.out.println(text.length()); // Output: 16
System.out.println(text.charAt(0)); // Output: J
System.out.println(text.substring(0, 4)); // Output: Java
```

#### 6.2 **Array**
- **Description**: An array is an object that holds a fixed number of values of a single type.
- **Usage**: Useful for storing multiple values of the same type.

Example:
```java
int[] numbers = {1, 2, 3, 4, 5};
```

#### 6.3 **Class**
- **Description**: A class is a blueprint for creating objects. Classes contain fields and methods.

Example:
```java
class Car {
    String

 model;
    int year;
  
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

---

### Summary
- **Primitive types** are simple, predefined types for efficiency.
- **Wrapper classes** provide useful methods and constants like `MAX_VALUE` and `MIN_VALUE`.
- **Non-primitive types** include reference types like `String`, `Array`, and `Class`.
- Java supports **automatic conversion** (autoboxing/unboxing) between primitives and their wrapper classes.
- Use the appropriate data type based on performance and memory needs.