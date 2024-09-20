# Title: LinkedLists in Java

Tags: #Java #LinkedList #DataStructures #Programming

## Summary
The `LinkedList` class in Java, part of the `java.util` package, implements the List and Deque interfaces, allowing for the storage of ordered collections of elements. Unlike arrays, linked lists do not require a contiguous block of memory, enabling efficient insertions and deletions at any point within the list. `LinkedList` in Java is a doubly linked list, providing methods to manipulate data at both ends and access elements in both directions.

## Detailed Description
- **LinkedList Class**: A part of Java's Collection framework, the `LinkedList` class provides an implementation of a doubly linked list, supporting the List, Deque, and Queue interfaces.
- **Constructors**: Common constructors include:
    - `LinkedList()`: Initializes an empty linked list.
    - `LinkedList(Collection<? extends E> c)`: Initializes a linked list containing the elements of the specified collection.
- **Common Methods**: Methods for adding, accessing, and removing elements:
    - **add(E e)**: Adds the specified element to the end of the list.
    - **addFirst(E e)**: Inserts the specified element at the beginning of the list.
    - **addLast(E e)**: Appends the specified element to the end of the list.
    - **get(int index)**: Returns the element at the specified position in the list.
    - **remove(int index)**: Removes the element at the specified position in the list.

## Key Examples

### Example 1: Basic Operations on LinkedList
```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.addFirst("Orange");
        list.addLast("Grape");

        System.out.println("LinkedList: " + list); // Output: [Orange, Apple, Banana, Grape]

        // Accessing elements
        System.out.println("First Element: " + list.getFirst()); // Output: Orange
        System.out.println("Last Element: " + list.getLast()); // Output: Grape

        // Removing elements
        list.remove("Apple");
        System.out.println("After Removal: " + list); // Output: [Orange, Banana, Grape]
    }
}
```
**Output**:
```
LinkedList: [Orange, Apple, Banana, Grape]
First Element: Orange
Last Element: Grape
After Removal: [Orange, Banana, Grape]
```

### Example 2: Using LinkedList as a Queue
```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue); // Output: [10, 20, 30]

        // Removing an element from the queue
        int removed = queue.poll();
        System.out.println("Removed Element: " + removed); // Output: 10
        System.out.println("Queue after Removal: " + queue); // Output: [20, 30]
    }
}
```
**Output**:
```
Queue: [10, 20, 30]
Removed Element: 10
Queue after Removal: [20, 30]
```

## Common Methods in LinkedList

| Method               | Description                                                | Example Usage                         |
|----------------------|------------------------------------------------------------|---------------------------------------|
| `add(E e)`           | Adds the specified element to the end of the list.          | `list.add("Element");`                |
| `addFirst(E e)`      | Inserts the specified element at the beginning of the list. | `list.addFirst("Element");`           |
| `addLast(E e)`       | Appends the specified element to the end of the list.       | `list.addLast("Element");`            |
| `get(int index)`     | Returns the element at the specified position in the list.  | `E element = list.get(0);`            |
| `remove(int index)`  | Removes the element at the specified position in the list.  | `list.remove(1);`                     |
| `contains(Object o)` | Returns true if the list contains the specified element.    | `boolean hasElement = list.contains("Element");` |
| `size()`             | Returns the number of elements in the list.                 | `int size = list.size();`             |

## Important Points
1. **Doubly Linked List**: Each element (node) in a LinkedList holds references to both the next and previous elements, allowing bidirectional traversal.
2. **Performance**: `LinkedList` offers better performance than `ArrayList` for frequent insertions and deletions, especially in the middle of the list, due to the absence of element shifting.
3. **Memory Usage**: `LinkedList` consumes more memory than `ArrayList` due to the storage of references for the next and previous nodes.
4. **Deque Interface**: `LinkedList` implements the `Deque` interface, providing methods like `addFirst()`, `addLast()`, `removeFirst()`, `removeLast()`, etc.
5. **Usage**: Ideal for scenarios where there are frequent add/remove operations, and access time isn't critical.

## Example: Using LinkedList as a Deque
```java
import java.util.LinkedList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Adding elements at both ends
        deque.addFirst("First");
        deque.addLast("Last");

        System.out.println("Deque: " + deque); // Output: [First, Last]

        // Removing elements from both ends
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after Removals: " + deque); // Output: []
    }
}
```
**Output**:
```
Deque: [First, Last]
Deque after Removals: []
```

## Compress Connections
1. **Data Storage**: `LinkedList` is suitable for data storage where frequent insertions and deletions are needed.
2. **Queue Implementation**: Acts as a queue, providing FIFO operations.
3. **Bidirectional Data Access**: `LinkedList` supports efficient insertion and removal at both ends, facilitating various use cases like deque operations.