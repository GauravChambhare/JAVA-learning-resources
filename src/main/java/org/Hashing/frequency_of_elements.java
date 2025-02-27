package org.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class frequency_of_elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the max value the element inside the array can take?");
        int p = sc.nextInt();
        System.out.println("What is the length of the array?");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("----------Frequencies are----------");
        // Calling the frequencyHashArray function and storing the hash array
        int[] hash = frequencyHashArray(arr, n, p);

        // Printing the frequency of each number from 1 to p
        for (int k = 1; k <= p; k++) {
            System.out.println("Frequency of " + k + ": " + hash[k]);
        }
    }
    public static int[] frequencyHashArray(int[] arr, int n, int p){
        // using hash array
        int[] hash = new int[p+1]; // Create an array of size n+1
        Arrays.fill(hash, 0); // Set all elements to 0

        for(int j=0; j<n; j++){
            hash[arr[j]]++;
        }
        return hash;
    }
}
