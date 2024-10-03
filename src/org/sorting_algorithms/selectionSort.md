### Insertion Sort Algorithm - DSA Notes (Using Java)

#### Tags:
#DSA #InsertionSort #Java #SortingAlgorithm

---

## What is Insertion Sort?

Insertion Sort is a simple and intuitive sorting algorithm. It builds the sorted array one element at a time by picking an unsorted element and placing it in its correct position relative to the elements before it. It works similarly to how you would sort playing cards in your hand.

---

## Characteristics of Insertion Sort:
- **Time Complexity**:
    - **Best Case**: O(n) (when the array is already sorted)
    - **Average and Worst Case**: O(n²) (when the array is sorted in reverse or completely unsorted)
- **Space Complexity**: O(1) (in-place sorting, requires constant extra space)
- **Sorting Type**: In-place, comparison-based sorting algorithm.
- **Stable**: Yes, because it preserves the relative order of equal elements.

---

## How Insertion Sort Works:

1. Start from the second element (`i = 1`), treat the first element as a sorted portion of the array.
2. For each element in the unsorted portion, compare it with the elements in the sorted portion (starting from right to left).
3. Shift the elements in the sorted portion to the right, if they are greater than the current element.
4. Insert the current element into its correct position in the sorted portion.
5. Repeat the process until all elements are sorted.

---

### Example of Insertion Sort in Java (Basic Implementation)

```java
public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = array[i];  // The element to be inserted
            int j = i - 1;

            // Move elements of the sorted segment that are greater than the key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert the key into its correct position
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Perform insertion sort
        insertionSort(arr);

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
12 11 13 5 6 

Sorted array:
5 6 11 12 13
```

### Key Points:
1. The outer loop traverses through the unsorted portion of the array.
2. The inner loop compares and shifts elements in the sorted portion to create space for the current element.
3. The current element (`key`) is inserted into its correct position within the sorted portion.

---

## Use Cases:

1. **Small Datasets**: Insertion Sort works well for small arrays, as it is simple and has a low overhead.
2. **Nearly Sorted Arrays**: Insertion Sort performs efficiently on nearly sorted arrays, as the number of comparisons and shifts is reduced.
3. **Online Sorting**: This algorithm is suitable when sorting data as it is received because it sorts one element at a time.

---

## Time Complexity Analysis:

- **Best Case**: O(n) – When the array is already sorted, each element is compared once.
- **Average and Worst Case**: O(n²) – When the array is completely unsorted, the algorithm performs n comparisons and shifts for each element, resulting in O(n²) complexity.

### Space Complexity:
- **Space Complexity**: O(1) – Insertion Sort uses constant space, as sorting is done in-place without requiring extra memory.

---

### Insertion Sort Variants:

1. **Standard Insertion Sort**: The basic version compares each element with the sorted portion and inserts it into the correct position.
2. **Binary Insertion Sort**: An optimization where Binary Search is used to find the correct position to insert the element, reducing comparisons. However, it still takes O(n²) time due to the need for shifting elements.

---

### Advantages of Insertion Sort:
1. **Efficient for Small Arrays**: It is more efficient than algorithms like Bubble Sort or Selection Sort for small datasets.
2. **Adaptive**: It works faster on nearly sorted arrays, reducing the time complexity to O(n) in the best case.
3. **Online Sorting**: Insertion Sort is ideal for sorting a stream of data or when data arrives incrementally.
4. **Stable**: Since it maintains the relative order of equal elements, Insertion Sort is a stable sorting algorithm.

---

## Limitations of Insertion Sort:
1. **Inefficient for Large Arrays**: Due to its O(n²) time complexity, Insertion Sort is inefficient for large datasets, where more advanced algorithms like Merge Sort or Quick Sort are preferred.
2. **Shifting Elements**: Insertion Sort requires shifting elements, which can be inefficient for larger arrays, particularly if the smallest element is at the end of the array.

---

### Example of Optimized Insertion Sort (Binary Insertion Sort)

In Binary Insertion Sort, instead of performing linear searches to find the insertion point, a Binary Search is used. This reduces the number of comparisons from O(n) to O(log n), but the overall time complexity remains O(n²) due to the shifting of elements.

```java
import java.util.Arrays;

public class BinaryInsertionSort {

    // Function to perform Binary Insertion Sort
    public static void binaryInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int position = binarySearch(array, 0, i - 1, key);

            // Shift elements to the right to make space for the key
            for (int j = i - 1; j >= position; j--) {
                array[j + 1] = array[j];
            }

            // Insert the key at the correct position
            array[position] = key;
        }
    }

    // Function to perform Binary Search to find the correct position
    private static int binarySearch(int[] array, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == array[mid]) {
                return mid + 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; // Correct position for the key
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        binaryInsertionSort(arr);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
```

### Output:
```
Original array:
[29, 10, 14, 37, 13]

Sorted array:
[10, 13, 14, 29, 37]
```

---

### Advantages of Binary Insertion Sort:
- **Fewer Comparisons**: It reduces the number of comparisons needed to find the correct position for insertion using Binary Search.

---

### Time Complexity Summary:
1. **Best Case (Sorted Array)**: O(n)
2. **Worst and Average Case**: O(n²)

### Space Complexity:
- O(1) – In-place sorting algorithm.

Insertion Sort is great for small and nearly sorted datasets but is less efficient for large datasets due to its quadratic time complexity.