# Java Strings

Tags: #Java #Programming #Strings

## Overview

Strings in Java are objects that represent sequences of characters. They are widely used for storing and manipulating text. Java provides the `String` class to create and manipulate strings.

Escape sequences in Java are special characters used within strings to represent certain special characters that are otherwise difficult to include directly. These sequences start with a backslash (`\`) followed by a specific character or combination of characters. They are commonly used to manage formatting and special character inclusion within string literals.

## Detailed Description

### Common Escape Sequences

| Escape Sequence | Description                  | Example                    | Output               |
|-----------------|------------------------------|----------------------------|----------------------|
| `\n`            | New line                     | `"Hello\nWorld"`           | Hello               |
|                 |                              |                            | World               |
| `\t`            | Tab                          | `"Hello\tWorld"`           | Hello    World      |
| `\b`            | Backspace                    | `"Hello\bWorld"`           | HellWorld           |
| `\r`            | Carriage return              | `"Hello\rWorld"`           | World               |
| `\f`            | Form feed                    | `"Hello\fWorld"`           | Hello[FormFeed]World|
| `\'`            | Single quote                 | `"It\'s Java"`             | It's Java           |
| `\"`            | Double quote                 | `"She said \"Hello\""`     | She said "Hello"    |
| `\\`            | Backslash                    | `"C:\\Program Files"`      | C:\Program Files    |
| `\uXXXX`        | Unicode character            | `"\u20B9"` (Rupee symbol)  | ₹                   |

### Example Code

#### New Line (`\n`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello\nWorld";
        System.out.println(str);
    }
}
```
**Output**:
```
Hello
World
```

#### Tab (`\t`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello\tWorld";
        System.out.println(str);
    }
}
```
**Output**:
```
Hello    World
```

#### Backspace (`\b`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello\bWorld";
        System.out.println(str);
    }
}
```
**Output**:
```
HellWorld
```

#### Carriage Return (`\r`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello\rWorld";
        System.out.println(str);
    }
}
```
**Output**:
```
World
```

#### Form Feed (`\f`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello\fWorld";
        System.out.println(str);
    }
}
```
**Output**:
```
Hello
      World
```

#### Single Quote (`\'`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "It\'s Java";
        System.out.println(str);
    }
}
```
**Output**:
```
It's Java
```

#### Double Quote (`\"`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "She said \"Hello\"";
        System.out.println(str);
    }
}
```
**Output**:
```
She said "Hello"
```

#### Backslash (`\\`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "C:\\Program Files";
        System.out.println(str);
    }
}
```
**Output**:
```
C:\Program Files
```

#### Unicode Character (`\uXXXX`)
```java
public class Main {
    public static void main(String[] args) {
        String str = "\u20B9"; // Unicode for Rupee symbol
        System.out.println(str);
    }
}
```
**Output**:
```
₹
```
---

## Creating Strings

### Using String Literals

String literals are created by enclosing text in double quotes.

```java
String str1 = "Hello, World!";
```

### Using the `new` Keyword

Strings can also be created using the `new` keyword.

```java
String str2 = new String("Hello, World!");
```

## String Methods

### Length of a String

The `length()` method returns the number of characters in a string.

```java
String str = "Hello";
int length = str.length(); // 5
```

### Concatenation

Strings can be concatenated using the `+` operator or the `concat()` method.

```java
String str1 = "Hello";
String str2 = "World";
String result1 = str1 + ", " + str2 + "!"; // "Hello, World!"
String result2 = str1.concat(", ").concat(str2).concat("!"); // "Hello, World!"
```

### Character at Specific Index

The `charAt()` method returns the character at a specific index.

```java
String str = "Hello";
char ch = str.charAt(1); // 'e'
```

### Substring

The `substring()` method returns a new string that is a substring of the original string.
In method substring(index1, index2) index2 value is *excluded*.
```java
String str = "Hello, World!";
String subStr1 = str.substring(7); // "World!"
String subStr2 = str.substring(7, 12); // "World"
```

### Index of a Character or Substring

The `indexOf()` method returns the index of the first occurrence of a character or substring.

```java
String str = "Hello, World!";
int index1 = str.indexOf('o'); // 4
int index2 = str.indexOf("World"); // 7
```
### Trim()

The `Trim()` method removes trailing whitespace from a string.

```java
String str = "   Hello, gaurav   ";
String trimmedstr = str.trim(); // Hello, gaurav

```

### String Comparison

Strings can be compared using the `equals()`, `equalsIgnoreCase()`, `compareTo()`, and `compareToIgnoreCase()` methods.

```java
String str1 = "Hello";
String str2 = "hello";
boolean isEqual = str1.equals(str2); // false
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true
int comparison = str1.compareTo(str2); // negative value
int comparisonIgnoreCase = str1.compareToIgnoreCase(str2); // 0
```

### Replace Characters or Substrings

The `replace()` and `replaceAll()` methods are used to replace characters or substrings in a string.

```java
String str = "Hello, World!";
String replacedStr = str.replace('o', 'a'); // "Hella, Warld!"
String replacedAllStr = str.replaceAll("World", "Java"); // "Hello, Java!"
```

### Convert to Uppercase or Lowercase

Strings can be converted to uppercase or lowercase using the `toUpperCase()` and `toLowerCase()` methods.

```java
String str = "Hello, World!";
String upperStr = str.toUpperCase(); // "HELLO, WORLD!"
String lowerStr = str.toLowerCase(); // "hello, world!"
```

### `split()`
The `split()` method divides a string into an array of substrings based on a specified delimiter.

#### Syntax:
```java
public String[] split(String regex)
public String[] split(String regex, int limit)
```

#### Example:
```java
public class Main {
    public static void main(String[] args) {
        String str = "one,two,three";
        String[] parts = str.split(",");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
```
**Output**:
```
one
two
three
```

### `matches()`
The `matches()` method checks if the string matches the given regular expression.

#### Syntax:
```java
public boolean matches(String regex)
```

#### Example:
```java
public class Main {
    public static void main(String[] args) {
        String str = "12345";
        boolean isMatch = str.matches("\\d+");
        System.out.println("Matches: " + isMatch);
    }
}
```
**Output**:
```
Matches: true
```

### `startsWith()`
The `startsWith()` method checks if the string starts with the specified prefix.

#### Syntax:
```java
public boolean startsWith(String prefix)
public boolean startsWith(String prefix, int toffset)
```

#### Example:
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, world!";
        boolean starts = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + starts);
    }
}
```
**Output**:
```
Starts with 'Hello': true
```

### `endsWith()`
The `endsWith()` method checks if the string ends with the specified suffix.

#### Syntax:
```java
public boolean endsWith(String suffix)
```

#### Example:
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, world!";
        boolean ends = str.endsWith("world!");
        System.out.println("Ends with 'world!': " + ends);
    }
}
```
**Output**:
```
Ends with 'world!': true
```



### `isEmpty()`
The `isEmpty()` method checks if the string is empty (i.e., has a length of 0).

#### Syntax:
```java
public boolean isEmpty()
```

#### Example:
```java
public class Main {
    public static void main(String[] args) {
        String str = "";
        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}
```
**Output**:
```
Is empty: true
```

### `join()`
The `join()` method returns a new string that is composed of elements joined together with a specified delimiter.

#### Syntax:
```java
public static String join(CharSequence delimiter, CharSequence... elements)
public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
```

#### Example:
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String joined = String.join(", ", "apple", "banana", "cherry");
        System.out.println(joined);
        
        // Joining from a list
        java.util.List<String> list = Arrays.asList("dog", "cat", "bird");
        String joinedList = String.join(", ", list);
        System.out.println(joinedList);
    }
}
```
**Output**:
```
apple, banana, cherry
dog, cat, bird
```


## Important Points

- **Immutability**: Strings in Java are immutable. Once a string is created, it cannot be changed. Any modification to a string results in a new string being created.

- **String Pool**: Java uses a special memory area called the string pool to store string literals. This helps in saving memory and improving performance by reusing immutable string objects.

- **Performance**: Due to immutability, concatenating strings using the `+` operator in a loop can lead to performance issues. Use `StringBuilder` or `StringBuffer` for mutable strings and efficient concatenation.

## Examples

### Example 1: Basic String Operations

```java
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Concatenated String: " + str3);
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Substring of str3 from index 7: " + str3.substring(7));
        System.out.println("Index of 'o' in str3: " + str3.indexOf('o'));
        System.out.println("Uppercase str3: " + str3.toUpperCase());
    }
}
```

### Example 2: Using StringBuilder for Efficient Concatenation

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        
        String result = sb.toString();
        System.out.println("Concatenated String using StringBuilder: " + result);
    }
}
```

---