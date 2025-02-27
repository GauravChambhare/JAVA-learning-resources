# Java Loops and Conditionals

## Conditional Statements

### if-else Statement

```java
if (condition) {
    // code block executed if condition is true
} else {
    // code block executed if condition is false
}
```

**Important Notes:**

- Conditions must evaluate to a boolean.
- Variables declared inside an `if` or `else` block are **not accessible** outside of it.

### switch Statement

```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // default code block
}
```

**Important Notes:**

- `switch` only supports specific data types (`int`, `char`, `String`, etc.).
- Always include `break` statements to prevent fall-through.

## Looping Statements

### for Loop

```java
for (initialization; condition; update) {
    // loop body
}
```

**Important Notes:**

- The loop runs as long as the condition is true.
- The variable declared in the initialization block is **not accessible** outside the loop.

### while Loop

```java
while (condition) {
    // loop body
}
```

**Important Notes:**

- Checks condition before execution.
- If condition is false initially, loop body won’t execute.

### do-while Loop

```java
do {
    // loop body
} while (condition);
```

**Important Notes:**

- Executes at least once, even if condition is false.

## Control Statements

### break Statement

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // exits the loop when i is 5
    }
    System.out.println(i);
}
```

**Important Notes:**
- `break` is used to exit a loop or a `switch` statement immediately.

### continue Statement

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue; // skips the rest of the loop for i = 5
    }
    System.out.println(i);
}
```

**Important Notes:**
- `continue` skips the current iteration and moves to the next.

## Common Mistakes & Best Practices

- **Scope Issue:** Variables declared inside blocks (`if`, `for`, `while`) **cannot be accessed outside**.
- **Infinite Loops:** Ensure loop conditions eventually become false.
- **Switch Case Fall-through:** Use `break` to avoid unintended execution.
- **Break vs Continue:** `break` exits the loop, while `continue` skips to the next iteration.

## Summary Table

| Structure  | Usage                                 |
| ---------- | ------------------------------------- |
| `if-else`  | Conditional execution                 |
| `switch`   | Multi-way branching                   |
| `for`      | Fixed iterations                      |
| `while`    | Repeated execution based on condition |
| `do-while` | Executes at least once                |
| `break`    | Exits loop or switch early            |
| `continue` | Skips current loop iteration         |
