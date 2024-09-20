
---

## Arithmatic_Logical_Bitwise_Operations.md

### 1. **Arithmetic Operations**
Arithmetic operations are fundamental mathematical operations used in programming. They include:

- **Addition (`+`)**: Adds two values together.
  ```java
  int a = 5 + 3;  // a = 8
  ```

- **Subtraction (`-`)**: Subtracts one value from another.
  ```java
  int b = 10 - 4;  // b = 6
  ```

- **Multiplication (`*`)**: Multiplies two values.
  ```java
  int c = 6 * 2;  // c = 12
  ```

- **Division (`/`)**: Divides one value by another and returns the quotient (without the remainder for integers).
  ```java
  int d = 10 / 2;  // d = 5
  ```

- **Modulus (`%`)**: Returns the remainder after division.
  ```java
  int e = 10 % 3;  // e = 1
  ```

- **Unary negation (`-`)**: Negates a number (changes positive to negative and vice versa).
  ```java
  int f = -5;  // f = -5
  ```

#### Division and Assignment Example:
Let's focus on **division** and **assignment** in more detail:

```java
int value = 25;
value /= 10;  // value = value / 10
```

Here’s what happens step by step:
1. The variable `value` contains `25`.
2. The `value /= 10` operation divides `25` by `10`, which gives `2.5` in regular math. However, since `value` is an `int` (integer), the fractional part `.5` is discarded.
3. So, `value` becomes `2` after this operation.

**Real-world Use Case**: This operation is particularly useful when you're dealing with digits of a number. For example, to extract each digit from a number, you can repeatedly divide the number by `10` to "remove" the last digit. Here's a simple use case:

```java
int num = 12345;
while (num > 0) {
    int lastDigit = num % 10;  // Extract the last digit
    num /= 10;  // Remove the last digit
    System.out.println(lastDigit);
}
```
Output:
```
5
4
3
2
1
```
Here, `num /= 10` removes the last digit in each iteration.

---

### 2. **Logical Operations**
Logical operations work with Boolean values (`true` or `false`), determining conditions under which certain operations will be executed.

- **Logical AND (`&&`)**: Returns `true` if both operands are `true`.
  ```java
  boolean result = (5 > 3) && (6 > 2);  // result = true
  ```

- **Logical OR (`||`)**: Returns `true` if at least one operand is `true`.
  ```java
  boolean result = (5 > 6) || (6 > 2);  // result = true
  ```

- **Logical NOT (`!`)**: Inverts a Boolean value.
  ```java
  boolean result = !(5 > 3);  // result = false
  ```

#### Short-circuiting:
- **AND (`&&`)**: If the first condition is `false`, the second condition is not evaluated, making the operation efficient.
- **OR (`||`)**: If the first condition is `true`, the second condition is skipped as the entire expression becomes `true`.

**Use Case**: Short-circuiting can optimize performance in scenarios where checking both conditions is unnecessary. For example, in checking if a list is non-empty before accessing its first element:
```java
if (list != null && !list.isEmpty()) {
    System.out.println(list.get(0));
}
```
Here, if `list` is `null`, the second condition (`!list.isEmpty()`) won’t be evaluated, preventing potential errors.

---

### 3. **Bitwise Operations**
Bitwise operations manipulate individual bits of data.

#### 3.1 **Bitwise AND (`&`)**
Compares corresponding bits of two integers and returns `1` if both bits are `1`, otherwise `0`.
```java
int result = 5 & 3;  // result = 1 (0101 & 0011 = 0001)
```

#### 3.2 **Bitwise OR (`|`)**
Compares corresponding bits and returns `1` if at least one bit is `1`.
```java
int result = 5 | 3;  // result = 7 (0101 | 0011 = 0111)
```

#### 3.3 **Bitwise XOR (`^`)**
Returns `1` if the bits are different, `0` if they are the same.
```java
int result = 5 ^ 3;  // result = 6 (0101 ^ 0011 = 0110)
```

#### 3.4 **Bitwise NOT (`~`)**
Inverts all the bits in the number.
```java
int result = ~5;  // result = -6 (in 2's complement form)
```

#### 3.5 **Left Shift (`<<`)**
Shifts the bits of a number to the left, padding with `0`. Each shift left multiplies the number by 2.
```java
int result = 3 << 2;  // result = 12 (0011 << 2 = 1100)
```

#### 3.6 **Right Shift (`>>`)**
Shifts the bits of a number to the right. Each shift right divides the number by 2.
```java
int result = 12 >> 2;  // result = 3 (1100 >> 2 = 0011)
```

#### 3.7 **Unsigned Right Shift (`>>>`)**
Similar to `>>` but fills with zero from the left side, used primarily for unsigned numbers.
```java
int result = -12 >>> 2;  // result = 1073741821
```

**Use Case for Bitwise Operations**: Bitwise operations are often used in low-level programming for tasks like:
- **Setting flags** in systems (e.g., checking specific conditions in one integer).
- **Optimized multiplication/division** for powers of 2 (`<<` and `>>`).
- **Working with binary representations of numbers**.

---

### 4. **Compound Assignment Operators**
These are shorthand notations that combine an operation with assignment. They simplify the code while maintaining clarity.

- **`+=`**: Adds and assigns the result.
  ```java
  a += 5;  // a = a + 5
  ```

- **`-=`**: Subtracts and assigns the result.
  ```java
  b -= 3;  // b = b - 3
  ```

- **`*=`**: Multiplies and assigns the result.
  ```java
  c *= 2;  // c = c * 2
  ```

- **`/=`**: Divides and assigns the result.
  ```java
  d /= 4;  // d = d / 4
  ```
  **Explanation**: This operation divides `d` by `4` and assigns the quotient back to `d`. If `d` was `9`, after `d /= 4`, it would become `2` (since `9 / 4 = 2` with integer truncation).

  **Use Case**: In situations where you need to progressively reduce a number or break it down by factors, compound assignment helps make the code concise:
  ```java
  int num = 100;
  while (num > 1) {
      num /= 2;  // Keep halving num
      System.out.println(num);
  }
  ```

- **`%=`**: Takes modulus and assigns the result.
  ```java
  e %= 3;  // e = e % 3
  ```

- **`&=`**, **`|=`**, **`^=`**: Perform bitwise operations and assign the result.
  ```java
  f &= 7;  // f = f & 7
  g |= 5;  // g = g | 5
  h ^= 2;  // h = h ^ 2
  ```

---

### 5. **Comparison Operations**
Comparison operators are used to compare two values, returning `true` or `false`:

- **Equal to (`==`)**: Checks if two values are equal.
  ```java
  boolean result = (5 == 5);  // result = true
  ```

- **Not equal to (`!=`)**: Checks if two values are not equal.
  ```java
  boolean result = (5 != 4);  // result = true
  ```

- **Greater than (`>`)**: Checks if the left value is greater.
  ```java
  boolean result = (6 > 3);  // result = true
  ```

- **Less than (`<`)**: Checks if the left value is smaller.
  ```java
  boolean result = (3 < 6);

  // result = true
  ```

- **Greater than or equal to (`>=`)**: Checks if the left value is greater than or equal to the right value.
  ```java
  boolean result = (5 >= 5);  // result = true
  ```

- **Less than or equal to (`<=`)**: Checks if the left value is less than or equal to the right value.
  ```java
  boolean result = (3 <= 5);  // result = true
  ```

---

### 6. **Operator Precedence**
Operator precedence determines the order of operations when multiple operators are used in the same expression:

1. **Parentheses `()`**: First priority, forces evaluation inside.
2. **Unary operators `+`, `-`, `!`, `~`**: Next highest.
3. **Multiplicative `*`, `/`, `%`**: Then multiplicative operations.
4. **Additive `+`, `-`**.
5. **Bitwise shifts `<<`, `>>`, `>>>`**.
6. **Relational `<`, `<=`, `>`, `>=`, `==`, `!=`**.
7. **Bitwise AND `&`**.
8. **Bitwise XOR `^`**.
9. **Bitwise OR `|`**.
10. **Logical AND `&&`**.
11. **Logical OR `||`**.
12. **Ternary `? :`**.
13. **Assignment `=`, `+=`, `-=`, etc.**.

---

