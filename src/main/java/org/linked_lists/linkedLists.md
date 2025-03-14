## LinkedList in Java

### **What is a LinkedList?**
A **LinkedList** is a linear data structure in which elements (nodes) are stored in non-contiguous memory locations. Each node consists of two parts:
1. **Data**: Stores the actual value.
2. **Pointer**: Stores the reference to the next (and sometimes previous) node.

### **Types of LinkedList in Java**
Java provides the `LinkedList` class as part of the `java.util` package, which implements both the `List` and `Deque` interfaces. It supports:
- **Singly Linked List** (One-directional, but Java’s `LinkedList` is doubly linked internally)
- **Doubly Linked List** (Each node points to both the next and previous node)
- **Circular Linked List** (Last node points to the first node)

### **Key Operations on LinkedList**
1. **add(element)**: Adds an element to the end of the list.
2. **add(index, element)**: Inserts an element at the specified index.
3. **remove()**: Removes the first element.
4. **remove(index)**: Removes an element at the specified index.
5. **get(index)**: Retrieves an element at the specified index.
6. **set(index, element)**: Replaces the element at the specified index.
7. **size()**: Returns the number of elements in the list.
8. **isEmpty()**: Checks if the list is empty.
9. **contains(element)**: Checks if the list contains a specified element.
10. **clear()**: Removes all elements from the list.

### **Advantages of LinkedList**
- **Efficient insertions and deletions**: Unlike arrays, inserting or deleting elements in a `LinkedList` does not require shifting elements.
- **Dynamic size**: The size of a `LinkedList` is dynamic and not fixed like an array.
- **Implements both List and Deque**: Allows usage as a queue, stack, or list.

### **Disadvantages of LinkedList**
- **Higher memory usage**: Each node requires extra memory for storing references.
- **Slower access time**: Random access is slower (`O(n)`) compared to arrays (`O(1)`).

### **Implementation of LinkedList in Java**
#### **Basic Usage of LinkedList**
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Insert at a specific index
        list.add(1, 15);

        // Display the list
        System.out.println("LinkedList: " + list);

        // Get and remove elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Removed element: " + list.removeFirst());
        System.out.println("LinkedList after removal: " + list);

        // Check if empty
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
```

### **Using LinkedList as a Queue**
Since `LinkedList` implements `Deque`, it can be used as a queue:
```java
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}
```

### **Using LinkedList as a Stack**
Since `LinkedList` implements `Deque`, it can be used as a stack:
```java
import java.util.LinkedList;
import java.util.Deque;

public class LinkedListStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
```

Here's a concise note that you can add to your existing notes:  

---

### **When to Use Java's `LinkedList` vs. Custom `ListNode`?**  

### **1️⃣ Use Java’s Inbuilt `LinkedList` (`java.util.LinkedList`)**  
✅ Best for high-level list operations without manual node management.  
✅ Supports built-in methods like `add()`, `remove()`, `get()`, etc.  
✅ Suitable for queue, stack, or general linked list usage.  

**Example:**  
```java
LinkedList<Integer> list = new LinkedList<>();
list.add(1);
list.add(2);
list.removeFirst();
```

---

### **2️⃣ Use Custom `ListNode` Class**  
✅ Required for **DSA problems**, especially on platforms like LeetCode.  
✅ Needed when the problem explicitly provides `ListNode` in function signatures.  
✅ Allows **manual pointer manipulation** (`next` for singly linked lists, `prev` for doubly linked lists).  
✅ Useful for **recursive problems** (e.g., reversing a linked list).  

**Example:**  
```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
```
---
### **🚀 Quick Decision Guide**
| Scenario | Use Java's `LinkedList` | Use Custom `ListNode` |
|----------|------------------------|-----------------------|
| General-purpose list operations | ✅ | ❌ |
| Queue, Stack, or simple list manipulation | ✅ | ❌ |
| Directly modifying `next` pointers | ❌ | ✅ |
| Recursive problems (e.g., reversing, merging lists) | ❌ | ✅ |
| Interview/DSA problems (LeetCode, Codeforces, etc.) | ❌ | ✅ |

If solving **DSA problems**, **always use `ListNode` unless specified otherwise.**

### **Key Points to Remember**
- **Implements `List`, `Deque`, and `Queue`**: Can be used as a list, queue, or stack.
- **Faster insertions/deletions than ArrayList**: `O(1)` for adding/removing at head/tail.
- **Slower random access than ArrayList**: `O(n)` for retrieving an element.
- **More memory overhead than ArrayList**: Requires extra space for node pointers.

---

