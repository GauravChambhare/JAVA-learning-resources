package org.searching_algorithms;
import java.util.Arrays;

public class BinarySearch {

    // binary search = Search algorithm that finds the position
    //				   of a target value within a sorted array.
    //				   Half of the array is eliminated during each "step"

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        // our goal is to find the index of any data
        // Arrays of in built Binary Search method available that we can make you of.
        // int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);
        if(index != -1) System.out.println("Target found at "+ index);
        else System.out.println("Target does not exist in array!");

    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while( low < high){
            int middle = low + (high - low) / 2;
            int value = array[middle];

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; //target found
        }
        return -1;
    }
}
