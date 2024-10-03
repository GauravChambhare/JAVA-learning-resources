**Title:** Hashing in Java  
**Tags:** #Hashing #Java #DataStructures #Collisions #Chaining #HashCode

## Description
Hashing in Java is a technique used to map data of arbitrary size (keys) to fixed-size values (hashes). It is implemented using various data structures, including `HashMap`, `HashSet`, and `Hashtable`. Hashing plays a critical role in optimizing data retrieval, searching, and insertion operations, making it essential in solving problems that require efficient lookups. Below is an exploration of key concepts related to hashing in Java.

## Hashing Concepts

### 1. **Hash Function**
A hash function takes an input (or key) and returns an integer called a hash code. This integer represents an index where the corresponding value will be stored in a hash table. A good hash function minimizes collisions (multiple keys mapped to the same index).

### 2. **Collisions**
Collisions occur when two different keys generate the same hash code and map to the same index in the hash table. Handling collisions is crucial to maintaining the performance of the hashing data structures.

### 3. **Collision Handling Mechanisms**
- **Chaining:** In this approach, each position in the hash table points to a linked list (or another secondary structure) of elements that map to the same index. When a collision occurs, the new element is appended to the list.
    - Example:
        ```
        Hash Table:
        Index 0 -> (Key1 -> Value1) -> (Key5 -> Value5)
        Index 1 -> (Key2 -> Value2)
        Index 2 -> (Key3 -> Value3)
        Index 3 -> (Key4 -> Value4) -> (Key6 -> Value6)
        ```

- **Open Addressing:** Here, instead of using linked lists, the algorithm searches for the next available position in the hash table to store the colliding element. Various strategies exist:
    - **Linear Probing:** Simply move to the next index until an empty slot is found.
    - **Quadratic Probing:** A non-linear search (e.g., check i² positions away).
    - **Double Hashing:** Use a secondary hash function to determine the step size for probing.

### 4. **Hash Nodes**
Hash nodes are the individual storage units in a hash table. Each hash node typically contains:
- A **key**: Unique identifier of the element.
- A **value**: The data associated with the key.
- A **next pointer** (in the case of chaining): Points to the next element in the linked list.

### 5. **HashCode Calculation**
In Java, the `hashCode()` method is used to calculate a hash code for objects. Each class in Java inherits this method from `Object`, but classes like `String`, `Integer`, and `HashMap` provide their own hash code implementations. Overriding this method allows objects to be stored correctly in hash-based structures like `HashMap` and `HashSet`.

### Example of `hashCode()` Override:
```java
@Override
public int hashCode() {
    int result = 17;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + age;
    return result;
}
```

## Data Structures in Java for Hashing

### 1. **HashMap**
A `HashMap` stores key-value pairs and provides constant time complexity (O(1)) for basic operations like insert, delete, and lookup, assuming a good hash function. It uses the chaining method to handle collisions.

#### Key Characteristics:
- Allows `null` keys and values.
- Not synchronized (not thread-safe).
- Iteration order is not guaranteed.
- Utilizes `hashCode()` and `equals()` to determine key placement and equality.

#### Example:
```java
Map<String, Integer> map = new HashMap<>();
map.put("apple", 1);
map.put("banana", 2);
int value = map.get("apple");  // Outputs: 1
```

### 2. **HashSet**
`HashSet` is a collection that uses a `HashMap` internally to store unique elements. Like `HashMap`, it provides O(1) time complexity for operations.

#### Key Characteristics:
- Stores only unique elements.
- Allows `null` values.
- Unordered collection.

#### Example:
```java
Set<String> set = new HashSet<>();
set.add("apple");
set.add("banana");
boolean exists = set.contains("apple");  // Outputs: true
```

### 3. **Hashtable**
`Hashtable` is similar to `HashMap` but is synchronized, making it thread-safe. However, due to synchronization, it is slower than `HashMap`. It does not allow `null` keys or values.

#### Key Characteristics:
- Thread-safe.
- Synchronized methods.
- No null keys or values.
- Similar time complexity as `HashMap`.

#### Example:
```java
Hashtable<String, Integer> table = new Hashtable<>();
table.put("apple", 1);
table.put("banana", 2);
int value = table.get("banana");  // Outputs: 2
```
### *Note:* *To iterate through a HashMap or Hashtable you can refer to below article*
https://www.geeksforgeeks.org/how-to-iterate-through-hashtable-in-java/

## Inbuilt Methods and Complexities

## **`HashMap` Methods**:
- **`put(K key, V value)`**: Inserts a key-value pair. (O(1) average)
- **`get(Object key)`**: Returns the value associated with the key. (O(1) average)
- **`remove(Object key)`**: Removes the key-value pair. (O(1) average)
- **`containsKey(Object key)`**: Checks if the map contains the specified key. (O(1) average)
- **`containsValue(Object value)`**: Checks if the map contains the specified value. (O(n) average)
- **`isEmpty()`**: Checks if the map is empty. (O(1))
- **`size()`**: Returns the number of key-value pairs. (O(1))
- **`keySet()`**: Returns a set view of the keys in the map. (O(n))
- **`values()`**: Returns a collection view of the values in the map. (O(n))
- **`entrySet()`**: Returns a set view of the key-value pairs in the map. (O(n))
- **`clear()`**: Removes all key-value pairs from the map. (O(n))

## **`HashSet` Methods**:
- **`add(E element)`**: Adds an element to the set. (O(1) average)
- **`remove(Object element)`**: Removes the specified element. (O(1) average)
- **`contains(Object element)`**: Checks if the element is in the set. (O(1) average)
- **`isEmpty()`**: Checks if the set is empty. (O(1))
- **`size()`**: Returns the size of the set. (O(1))
- **`iterator()`**: Returns an iterator over the elements in the set. (O(1) per call)
- **`clear()`**: Removes all elements from the set. (O(n))

## **`Hashtable` Methods**:
- **`put(K key, V value)`**: Inserts a key-value pair. (O(1) average)
- **`get(Object key)`**: Returns the value associated with the key. (O(1) average)
- **`remove(Object key)`**: Removes the key-value pair. (O(1) average)
- **`containsKey(Object key)`**: Checks if the map contains the specified key. (O(1) average)
- **`containsValue(Object value)`**: Checks if the map contains the specified value. (O(n))
- **`isEmpty()`**: Checks if the map is empty. (O(1))
- **`size()`**: Returns the number of key-value pairs. (O(1))
- **`keySet()`**: Returns a set view of the keys in the map. (O(n))
- **`values()`**: Returns a collection view of the values in the map. (O(n))
- **`entrySet()`**: Returns a set view of the key-value pairs in the map. (O(n))
- **`clear()`**: Removes all key-value pairs from the map. (O(n))

## Use Cases in DSA Problems

1. **Efficient Lookup & Caching**:
   Hash tables are used in problems that require constant-time lookups, such as checking for duplicates in an array, implementing LRU caches, or storing memoization data in dynamic programming.

2. **Counting Occurrences**:
   `HashMap` is frequently used to count occurrences of elements (e.g., counting character frequencies, word frequencies, etc.).

3. **Set Operations**:
   `HashSet` is ideal for performing set operations such as union, intersection, and difference, as well as checking for membership.

4. **Graph Problems**:
   In graph problems where adjacency lists are used, `HashMap` or `HashSet` can be used to store nodes and edges efficiently.

5. **Anagram Checking**:
   Using a `HashMap` to count character frequencies of strings is a common approach to solving anagram detection problems.

### Sample Problem: Two Sum
Given an array of integers, return the indices of two numbers such that they add up to a specific target.
```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
```
In this problem, `HashMap` is used to store the complements of the target and check if the complement already exists in the map. This reduces the time complexity to O(n).

## Compress Connections
1. **Collisions in hashing** can be connected to load balancing problems in distributed systems, where multiple requests map to the same server, leading to overload.
2. **Chaining** in hash tables is similar to handling multiple users hitting the same endpoint in a web application through queuing mechanisms.
3. **HashMap use cases** in problems like two-sum can be related to real-world scenarios where quick lookups are needed, such as in inventory management systems.

---
