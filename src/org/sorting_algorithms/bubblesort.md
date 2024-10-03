### Bubble Sort Algorithm - DSA Notes (Using Java)

#### Tags:
#DSA #BubbleSort #Java #SortingAlgorithm

---

## What is Bubble Sort?

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process repeats until the list is sorted. The algorithm is named "Bubble Sort" because smaller elements "bubble" to the top of the list.

---

## Characteristics of Bubble Sort:
- **Time Complexity**:
    - **Best Case**: O(n) (when the array is already sorted)
    - **Average and Worst Case**: O(n²) (when the array is sorted in reverse order or unsorted)
- **Space Complexity**: O(1), as it only requires a constant amount of extra space.
- **Sorting Type**: In-place, comparison-based sorting algorithm.
- **Stable**: Yes, because it preserves the relative order of equal elements.

---

## How Bubble Sort Works:

1. **Outer Loop**: Traverse through all elements of the array.
2. **Inner Loop**: For each element, compare it with the adjacent element.
3. **Swap if Necessary**: If the current element is larger than the adjacent element, swap them.
4. **Repeat**: Continue this process until no more swaps are needed, indicating that the array is sorted.
5. **Optimization**: Stop early if in one pass no elements are swapped (indicating the array is already sorted).

---

### Example of Bubble Sort in Java (Basic Implementation)

```java
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop for traversing the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next one, swap them
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }

            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Perform bubble sort
        bubbleSort(arr);

        System.out.println("\n\nSorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
```

### Output:
```
Original array:
64 34 25 12 22 11 90 

Sorted array:
11 12 22 25 34 64 90
```

### Key Points:
1. **Outer loop**: Controls the number of passes.
2. **Inner loop**: Compares adjacent elements and performs the necessary swaps.
3. **Swapping**: Each pass "bubbles" the largest unsorted element to its correct position.
4. **Optimized version**: The process stops early if no swaps occur in a pass, meaning the array is already sorted.

---

## Use Cases:

1. **Small-sized Arrays**: Bubble Sort can be useful when dealing with small datasets.
2. **Partially Sorted Arrays**: In cases where the array is nearly sorted, Bubble Sort performs well as it can terminate early.
3. **Teaching Purposes**: It’s often used in educational contexts to introduce the concept of sorting algorithms.

---

## Time Complexity Analysis:

- **Best Case**: O(n) – When the array is already sorted, only one pass through the array is needed (no swaps).
- **Average and Worst Case**: O(n²) – In the worst case (reverse order), Bubble Sort must perform n-1 comparisons for each pass, and there will be n-1 passes in total.

### Space Complexity:
- **Space Complexity**: O(1) – No additional memory is required, except for a few extra variables for swapping.

---

### Bubble Sort Variants:

1. **Standard Bubble Sort**: Involves comparing adjacent elements and swapping if needed.
2. **Optimized Bubble Sort**: Uses a flag (`swapped`) to detect if the array is already sorted, thereby avoiding unnecessary passes.

---

### Example of Optimized Bubble Sort in Java

```java
public class OptimizedBubbleSort {

    public static void optimizedBubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Traverse the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare and swap adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, break out (array is already sorted)
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1, 8, 7};

        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        optimizedBubbleSort(arr);

        System.out.println("\n\nSorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
```

### Output:
```
Original array:
3 5 2 9 1 8 7 

Sorted array:
1 2 3 5 7 8 9
```
---
```textmate
+-----------------------------------------------------------+
|                      Bubble Sort Algorithm                |
+-----------------------------------------------------------+
|                                                           |
|  Example Array: [64, 34, 25, 12, 22]                      |
|                                                           |
+-----------------------------------------------------------+
|                                                           |
|  Pass 1:                                                  |
|  Compare adjacent elements and swap if out of order:      |
|                                                           |
|  [64, 34, 25, 12, 22]  -> Compare 64 and 34 -> Swap       |
|  [34, 64, 25, 12, 22]  -> Compare 64 and 25 -> Swap       |
|  [34, 25, 64, 12, 22]  -> Compare 64 and 12 -> Swap       |
|  [34, 25, 12, 64, 22]  -> Compare 64 and 22 -> Swap       |
|  [34, 25, 12, 22, 64]  -> Largest element (64) bubbled    |
|                                                           |
+-----------------------------------------------------------+
|                                                           |
|  Pass 2:                                                  |
|  [34, 25, 12, 22, 64]  -> Compare 34 and 25 -> Swap       |
|  [25, 34, 12, 22, 64]  -> Compare 34 and 12 -> Swap       |
|  [25, 12, 34, 22, 64]  -> Compare 34 and 22 -> Swap       |
|  [25, 12, 22, 34, 64]  -> 34 is now in correct position   |
|                                                           |
+-----------------------------------------------------------+
|                                                           |
|  Pass 3:                                                  |
|  [25, 12, 22, 34, 64]  -> Compare 25 and 12 -> Swap       |
|  [12, 25, 22, 34, 64]  -> Compare 25 and 22 -> Swap       |
|  [12, 22, 25, 34, 64]  -> 25 is now in correct position   |
|                                                           |
+-----------------------------------------------------------+
|                                                           |
|  Pass 4:                                                  |
|  [12, 22, 25, 34, 64]  -> Compare 12 and 22 -> No Swap    |
|  [12, 22, 25, 34, 64]  -> Compare 22 and 25 -> No Swap    |
|  [12, 22, 25, 34, 64]  -> Already sorted!                 |
|                                                           |
+-----------------------------------------------------------+
|                                                           |
|  Final Sorted Array: [12, 22, 25, 34, 64]                 |
|                                                           |
+-----------------------------------------------------------+
```
---

## Advantages of Bubble Sort:
1. **Simple to Understand**: Bubble sort is easy to understand and implement.
2. **In-Place Sorting**: It doesn’t require any extra memory other than a few temporary variables.
3. **Early Termination**: With optimization, the algorithm can terminate early if the array becomes sorted before all passes are completed.

---

## Limitations of Bubble Sort:
1. **Inefficient for Large Arrays**: Due to its O(n²) time complexity, Bubble Sort is not suitable for large datasets.
2. **Numerous Comparisons**: Even for moderately sized arrays, Bubble Sort requires many comparisons and swaps, making it slower compared to more advanced algorithms like Quick Sort, Merge Sort, or Heap Sort.

---

### Time Complexity Summary:
1. **Best Case (Sorted Array)**: O(n)
2. **Worst Case (Reverse Sorted Array)**: O(n²)
3. **Average Case**: O(n²)

### Space Complexity:
- O(1) – Requires constant space.

Bubble Sort is mostly used for educational purposes or for small arrays, but for larger datasets, other more efficient algorithms are preferred.