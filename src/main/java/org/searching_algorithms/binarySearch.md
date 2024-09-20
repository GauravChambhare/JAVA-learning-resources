### Binary Search Algorithm - DSA Notes (Using Java)

#### Tags:
#DSA #BinarySearch #Java #SearchAlgorithm

---

## What is Binary Search?

Binary Search is a highly efficient algorithm for finding an element's position in a **sorted array**. It works by repeatedly dividing the search interval in half. If the target value is less than the middle element, the search continues in the left half, otherwise, it continues in the right half. This method significantly reduces the number of comparisons and is much faster than linear search for large datasets.

---

## Characteristics of Binary Search:
- **Time Complexity**: O(log n), where n is the number of elements in the array.
- **Space Complexity**: O(1) (iterative version) or O(log n) (recursive version).
- **Best Case**: O(1), when the target value is found at the middle.
- **Worst Case**: O(log n), when the array must be divided until only one element remains.
- **Condition**: Works only on a **sorted array** (either in ascending or descending order).

---

## How Binary Search Works:

1. Start with two pointers, one at the start (`low = 0`) and the other at the end (`high = n - 1`) of the array.
2. Compute the middle index: `mid = (low + high) / 2`.
3. If the element at the middle index matches the target, return the index.
4. If the target is less than the middle element, narrow the search to the left half by setting `high = mid - 1`.
5. If the target is greater than the middle element, narrow the search to the right half by setting `low = mid + 1`.
6. Repeat steps 2-5 until the target is found or the search space is exhausted.

---
```textmate
+---+---+---+---+---+---+---+
| 2 | 4 | 6 | 8 | 10| 12| 14|
+---+---+---+---+---+---+---+
  ^                         ^
  |                         |
low                       high
                 +---+---+---+---+---+---+---+
                 | 2 | 4 | 6 | 8 | 10| 12| 14|
                 +---+---+---+---+---+---+---+
                   ^           ^           ^
                   |           |           |
                 low         mid         high
                         +---+---+---+---+---+---+---+
                         | 2 | 4 | 6 | 8 | 10| 12| 14|
                         +---+---+---+---+---+---+---+
                           ^       ^       ^       ^
                           |       |       |       |
                         low     mid     high     high
                                 +---+---+---+---+---+---+---+
                                 | 2 | 4 | 6 | 8 | 10| 12| 14|
                                 +---+---+---+---+---+---+---+
                                   ^           ^           ^
                                   |           |           |
                                 low         mid         high
                                         +---+---+---+---+---+---+---+
                                         | 2 | 4 | 6 | 8 | 10| 12| 14|
                                         +---+---+---+---+---+---+---+
                                           ^       ^       ^       ^
                                           |       |       |       |
                                         low     mid     high     high
Target = 10 found at index 4
```
---
### Example of Binary Search in Java (Iterative Approach)

```java
import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if target is at mid
            if (array[mid] == target) {
                return mid;  // Target found
            }

            // If target is smaller than mid, search in the left half
            if (array[mid] > target) {
                high = mid - 1;
            } 
            // If target is larger than mid, search in the right half
            else {
                low = mid + 1;
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9, 10};
        int target = 5;

        // Perform binary search
        int result = binarySearch(arr, target);

        // Output the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
```

### Output:
```
Target found at index: 3
```

### Key Points:
1. The array must be sorted for binary search to work.
2. The `binarySearch` function returns the index of the target if found, and `-1` if not found.

---

### Example of Binary Search in Java (Recursive Approach)

```java
public class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] array, int low, int high, int target) {
        if (low > high) {
            return -1;  // Target not found
        }

        int mid = (low + high) / 2;

        // Check if target is at mid
        if (array[mid] == target) {
            return mid;
        }

        // If target is smaller than mid, search in the left half
        if (array[mid] > target) {
            return binarySearchRecursive(array, low, mid - 1, target);
        }

        // If target is larger than mid, search in the right half
        return binarySearchRecursive(array, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9, 10};
        int target = 9;

        // Perform binary search
        int result = binarySearchRecursive(arr, 0, arr.length - 1, target);

        // Output the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
```


---

## Advantages of Binary Search:
1. **Efficiency**: Binary search is much faster than linear search, especially for large arrays.
2. **Logarithmic Time Complexity**: It reduces the search space by half with each iteration.

---

## Limitations of Binary Search:
1. **Sorting Requirement**: The array must be sorted, which can add overhead if the array is unsorted.
2. **Not Suitable for Small Arrays**: For small datasets, linear search might be more practical due to its simplicity and no need for sorting.

---

### Time Complexity Analysis:

- **Best Case**: O(1) – The target is found at the middle on the first attempt.
- **Average and Worst Case**: O(log n) – The array is repeatedly divided until the element is found or the search space is exhausted.

### Space Complexity:
- **Iterative Version**: O(1) – Constant space, as no additional memory is required.
- **Recursive Version**: O(log n) – Due to recursive function calls.

---

### Educational Points for Binary Search:
1. **Always sorted**: Binary search only works on sorted arrays.
2. **Logarithmic time complexity**: It offers excellent performance for large datasets, reducing time complexity to O(log n).
3. **Recursive and Iterative**: Binary search can be implemented both iteratively and recursively, with iterative being more space-efficient.
4. **Halving Principle**: The key idea is that after each comparison, the search space is halved.

