# Threads and Multithreading in Java

## What is a Thread?
A **thread** is the smallest unit of execution in a program. In Java, threads allow concurrent execution of tasks, improving performance and responsiveness.

## Multithreading in Java
**Multithreading** is a feature that enables a program to run multiple threads concurrently. It helps in better resource utilization and improved performance.

## Creating Threads in Java
Java provides two ways to create a thread:

### 1. Extending `Thread` Class
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```
### 2. Implementing `Runnable` Interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
```

## Important Thread Methods
| Method | Description |
|--------|-------------|
| `start()` | Starts a new thread execution. Calls the `run()` method. |
| `run()` | Defines the code that the thread executes. |
| `sleep(ms)` | Makes the thread sleep for a given time (in milliseconds). |
| `join()` | Waits for a thread to die before continuing execution. |
| `setName(String name)` | Sets a thread name. |
| `getName()` | Retrieves the thread name. |
| `setPriority(int priority)` | Sets thread priority (MIN_PRIORITY = 1, NORM_PRIORITY = 5, MAX_PRIORITY = 10). |
| `getPriority()` | Returns the priority of a thread. |
| `isAlive()` | Checks if a thread is alive (still running). |
| `yield()` | Pauses the current thread and allows other threads of equal priority to execute. |
| `interrupt()` | Interrupts a thread that is sleeping or waiting. |

## Thread Lifecycle
1. **New** – Thread is created but not started.
2. **Runnable** – Thread is ready to run but waiting for CPU time.
3. **Running** – Thread is executing its `run()` method.
4. **Blocked/Waiting** – Thread is waiting due to sleep, join, or lock conditions.
5. **Terminated** – Thread has completed execution or was stopped.

## Synchronization in Multithreading
Synchronization ensures that multiple threads do not interfere with each other when accessing shared resources.

### Using `synchronized` Method
```java
class SharedResource {
    synchronized void display(String msg) {
        System.out.print("[" + msg);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("]");
    }
}
class MyThread extends Thread {
    SharedResource sr;
    String msg;
    MyThread(SharedResource sr, String msg) {
        this.sr = sr;
        this.msg = msg;
    }
    public void run() {
        sr.display(msg);
    }
}
public class SyncExample {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        MyThread t1 = new MyThread(obj, "Hello");
        MyThread t2 = new MyThread(obj, "World");
        t1.start();
        t2.start();
    }
}
```

### Using `synchronized` Block
```java
synchronized (object) {
    // synchronized code block
}
```

## Inter-Thread Communication
Java provides methods like `wait()`, `notify()`, and `notifyAll()` to allow synchronized threads to communicate.

### Example
```java
class Shared {
    synchronized void waitMethod() {
        try {
            System.out.println("Waiting...");
            wait();
            System.out.println("Resumed");
        } catch (InterruptedException e) {}
    }
    synchronized void notifyMethod() {
        notify();
        System.out.println("Notified");
    }
}
```

## Deadlocks and How to Avoid Them
A **deadlock** occurs when two or more threads wait for each other's resources indefinitely.

### Ways to Avoid Deadlocks
1. Avoid nested locks.
2. Use a timeout for locks.
3. Maintain a consistent lock order.

## Thread Pools
Instead of creating a new thread for each task, Java provides `ExecutorService` for managing thread pools efficiently.

### Example Using `ExecutorService`
```java
import java.util.concurrent.*;
class Task implements Runnable {
    public void run() {
        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}
public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executor.execute(new Task());
        }
        executor.shutdown();
    }
}
```

## Conclusion
Multithreading in Java allows better CPU utilization and faster execution of independent tasks. Understanding thread lifecycle, synchronization, and thread pools is essential for writing efficient and safe multithreaded applications.
