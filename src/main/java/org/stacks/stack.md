## Stack in Java

### **What is a Stack?**
A **Stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle. It means that the last element added to the stack will be the first one to be removed.

### Key Operations on Stack
1. **push(x)**: Adds an element `x` to the top of the stack.
2. **pop()**: Removes and returns the element at the top of the stack. If the stack is empty, it throws an exception.
3. **peek()**: Returns the element at the top of the stack without removing it.
4. **empty()**: Checks if the stack is empty.
5. **size()**: Returns the number of elements in the stack.


### **Applications of Stack**
- **Expression evaluation and conversion:** Used in evaluating postfix expressions and converting infix to postfix expressions.
- **Backtracking algorithms:** Such as finding a path in a maze.
- **Function call management:** In recursion, the system stack stores function calls.

### **Implementation of Stack in Java**

#### **1. Using the `Stack` class (Built-in)**
Java provides a `Stack` class as part of the `java.util` package.

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop());

        // Display the stack after popping
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Get the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
```

#### **2. Custom Stack Implementation Using Array**

```java
class CustomStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor
    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot peek");
            return -1;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean empty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Stack overflow example

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Peek again
        System.out.println("Top element after popping: " + stack.peek());
    }
}
```

### **Key Points to Remember**
- Stacks can be implemented using arrays, linked lists, or the built-in `Stack` class.
- The `Stack` class in Java is synchronized, which can be less performant compared to non-synchronized data structures.
- For better performance in a multithreaded environment, consider using `Deque` for stack operations.

---
