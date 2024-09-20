### Linear Search Algorithm - DSA Notes (Using Java)

#### Tags:
#DSA #LinearSearch #Java #SearchAlgorithm

---

## What is Linear Search?

Linear Search is one of the simplest searching algorithms used to find the position of a target value (also called "key" or "element") in a given list. It sequentially checks each element in the list until a match is found or the list is exhausted.

## Characteristics of Linear Search:
- **Time Complexity**: O(n), where n is the number of elements in the array.
- **Space Complexity**: O(1), as it doesn't use extra space proportional to the input size.
- **Best Case**: O(1), when the target value is found at the first position.
- **Worst Case**: O(n), when the target value is at the last position or not present at all.
- **Application**: Useful for small datasets or when the list is unsorted.

---

## How Linear Search Works:

1. Start from the first element of the list/array.
2. Compare the target value with the current element.
3. If the target matches the current element, return its index.
4. If the target doesn't match, move to the next element and repeat the process.
5. If the target value is not found by the end of the list, return an indicator (e.g., `-1` for "not found").

---

### Example of Linear Search in Java

```text
+---+---+---+---+---+---+---+
| 5 | 1 | 4 | 2 | 8 | 3 | 7 |
+---+---+---+---+---+---+---+
  ^
  |
Target = 2

+---+---+---+---+---+---+---+
| 5 | 1 | 4 | 2 | 8 | 3 | 7 |
+---+---+---+---+---+---+---+
    ^
    |
  Target = 2

+---+---+---+---+---+---+---+
| 5 | 1 | 4 | 2 | 8 | 3 | 7 |
+---+---+---+---+---+---+---+
      ^
      |
    Target = 2

+---+---+---+---+---+---+---+
| 5 | 1 | 4 | 2 | 8 | 3 | 7 |
+---+---+---+---+---+---+---+
        ^
        |
      Target = 2

+---+---+---+---+---+---+---+
| 5 | 1 | 4 | 2 | 8 | 3 | 7 |
+---+---+---+---+---+---+---+
          ^
          |
        Target = 2

+---+---+---+---+---+---+---+
| 5 | 1 | 4 | 2 | 8 | 3 | 7 |
+---+---+---+---+---+---+---+
            ^
            |
          Target = 2

+---+---+---+---+---+---+---+
| 5 | 1 | 4 | 2 | 8 | 3 | 7 |
+---+---+---+---+---+---+---+
              ^
              |
            Target = 2

Target found at index 3
```

### Output:
```
Element found at index: 3
```

---

### Key Points:
1. The `linearSearch` method scans the array one by one from the start.
2. If the element matches the key, it returns the index.
3. If it doesn't find the key in the entire array, it returns `-1`.

---

## Use Cases:

1. **Unsorted Arrays**: Linear Search is applicable when the array is not sorted, as it doesn't rely on any specific ordering of elements.
2. **Small-sized Arrays**: For smaller datasets, Linear Search is simple and efficient enough.

---

## Time Complexity Analysis:

- **Best Case**: O(1) - The target is found at the first index.
- **Worst Case**: O(n) - The target is at the last index or is absent in the array.

_Linear search is generally not preferred for large datasets, where algorithms like binary search, which operates in O(log n) time, are more efficient. However, binary search requires a sorted array.*_
