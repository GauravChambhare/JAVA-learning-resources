## Queue in Java

### **What is a Queue?**
A **Queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle, meaning the element added first is the one to be removed first.

### **Key Operations on Queue**
1. **add(element)**: Inserts the specified element into the queue. Throws an exception if the queue is full.
2. **offer(element)**: Inserts the specified element into the queue. Returns `false` if the queue is full, making it safer than `add()`.
3. **remove()**: Removes and returns the head of the queue. Throws an exception if the queue is empty.
4. **poll()**: Removes and returns the head of the queue, or returns `null` if the queue is empty.
5. **element()**: Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
6. **peek()**: Retrieves, but does not remove, the head of the queue, or returns `null` if the queue is empty.
7. **isEmpty()**: Checks if the queue is empty.

### **Applications of Queue**
- **Task scheduling:** Used in printers, CPU task scheduling, and other scheduling problems.
- **Breadth-first search (BFS):** Used in graph traversal.
- **Data buffering:** Handling real-time data, such as keyboard buffers or IO operations.

### **Implementation of Queue in Java**

#### **Using `LinkedList` (Commonly used)**
The `Queue` interface is often implemented using `LinkedList`.

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.offer(20);
        queue.offer(30);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Remove an element from the queue
        System.out.println("Removed element: " + queue.poll());

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
```

### **Key Points to Remember**
- `LinkedList` is a common implementation of the `Queue` interface.
- Operations like `offer()` and `poll()` are safer as they return special values instead of throwing exceptions when operations fail.

---

## PriorityQueue in Java

### **What is a PriorityQueue?**
A **PriorityQueue** is a special type of queue where each element has a priority. The element with the highest priority is served before elements with lower priorities. By default, elements are ordered according to their natural ordering or by a custom comparator.

### **Key Operations on PriorityQueue**
1. **add(element)**: Inserts the specified element into the priority queue. Throws an exception if the queue is full.
2. **offer(element)**: Inserts the specified element into the priority queue. Returns `false` if the queue is full.
3. **remove()**: Removes a specific element from the priority queue. Throws an exception if the queue is empty.
4. **poll()**: Removes and returns the head of the queue (element with the highest priority), or returns `null` if the queue is empty.
5. **peek()**: Retrieves, but does not remove, the head of the queue, or returns `null` if the queue is empty.
6. **isEmpty()**: Checks if the priority queue is empty.

### **Applications of PriorityQueue**
- **Scheduling:** Task scheduling where tasks with higher priority need to be executed first.
- **Dijkstra’s Algorithm:** Used in shortest path algorithms in graphs.
- **Event-driven simulations:** Handling events based on their priority.

### **Implementation of PriorityQueue in Java**

```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // PriorityQueue of integers with natural ordering (min-heap)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

        // Display the priority queue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Peek at the top priority element
        System.out.println("Top priority element: " + priorityQueue.peek());

        // Remove the top priority element
        System.out.println("Removed element: " + priorityQueue.poll());

        // Display the priority queue after removal
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Check if the priority queue is empty
        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());
    }
}
```

### **Key Points to Remember**
- **Ordering:** By default, `PriorityQueue` is a min-heap, meaning the smallest element (according to natural ordering) is at the head.
- **Comparator:** A custom comparator can be provided to change the ordering (e.g., max-heap).
- **Non-thread-safe:** `PriorityQueue` is not synchronized; use `PriorityBlockingQueue` for thread-safe operations.

---