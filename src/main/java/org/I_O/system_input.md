# Title: Java Scanner Class and Input Handling

Tags: #Java #ScannerClass #InputHandling #Programming

## Summary
The Scanner class in Java, part of the java.util package, is used to obtain input of primitive types like int, double, etc., and strings. It can parse input from various sources, including input streams, strings, and files. Scanner provides methods to read and parse different types of input, making it a versatile tool for handling user input in Java applications.

## Detailed Description
- **Scanner Class**: The Scanner class is used to read input from various sources, such as standard input, strings, or files.
- **Constructors**: Common constructors include:
    - `Scanner(InputStream source)`: Reads from an input stream, commonly System.in.
    - `Scanner(File source)`: Reads from a file.
    - `Scanner(String source)`: Reads from a string.
- **Common Methods**: Methods used to read various types of input include `next()`, `nextLine()`, `nextInt()`, `nextDouble()`, etc.
    - **next()**: Finds and returns the next complete token.
    - **nextLine()**: Advances the scanner past the current line and returns the input that was skipped.
    - **nextInt()**: Scans the next token as an int.
    - **nextDouble()**: Scans the next token as a double.

## Key Examples

### Example 1: Reading Strings and Integers
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        scanner.close();
    }
}
```
**Output**:
```
Enter your name: Alice
Enter your age: 30
Name: Alice
Age: 30
```

### Example 2: Reading Different Data Types
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter a double: ");
        double dbl = scanner.nextDouble();
        
        System.out.print("Enter a boolean: ");
        boolean bool = scanner.nextBoolean();
        
        System.out.println("Integer: " + num);
        System.out.println("Double: " + dbl);
        System.out.println("Boolean: " + bool);
        
        scanner.close();
    }
}
```
**Output**:
```
Enter an integer: 42
Enter a double: 3.14
Enter a boolean: true
Integer: 42
Double: 3.14
Boolean: true
```

## Common Methods in Scanner

| Method             | Description                                       | Example Usage              |
|--------------------|---------------------------------------------------|----------------------------|
| `next()`           | Finds and returns the next complete token         | `String token = scanner.next();` |
| `nextLine()`       | Advances the scanner past the current line        | `String line = scanner.nextLine();` |
| `nextInt()`        | Scans the next token as an int                    | `int number = scanner.nextInt();` |
| `nextDouble()`     | Scans the next token as a double                  | `double value = scanner.nextDouble();` |
| `nextBoolean()`    | Scans the next token as a boolean                 | `boolean bool = scanner.nextBoolean();` |
| `hasNext()`        | Returns true if the scanner has another token     | `boolean hasToken = scanner.hasNext();` |
| `hasNextLine()`    | Returns true if the scanner has another line      | `boolean hasLine = scanner.hasNextLine();` |

## Important Points
1. **Delimiter**: Scanner uses whitespace as the default delimiter to separate tokens. You can change the delimiter using the `useDelimiter(String pattern)` method.
2. **Exception Handling**: Scanner methods can throw `InputMismatchException` if the input doesn't match the expected type. It's important to handle these exceptions to avoid runtime errors.
3. **Closing Scanner**: Always close the scanner object using `scanner.close()` to free up resources and avoid memory leaks.
4. **Locale Sensitivity**: The Scanner class is locale-sensitive and can be configured to use a specific locale using the `useLocale(Locale locale)` method.

## Example: Changing Delimiter
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "apple,banana,orange";
        Scanner scanner = new Scanner(input).useDelimiter(",");
        
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        
        scanner.close();
    }
}
```
**Output**:
```
apple
banana
orange
```

## Compress Connections
1. **User Input**: The Scanner class is commonly used for reading user input in console-based applications.
2. **File Reading**: Scanner can read and parse files, making it useful for simple file I/O operations.
3. **Data Parsing**: Scanner is effective for parsing data from strings and streams, facilitating the handling of various data formats.

