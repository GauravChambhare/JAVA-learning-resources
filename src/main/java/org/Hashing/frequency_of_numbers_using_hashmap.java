package org.Hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequency_of_numbers_using_hashmap {

    public static void main(String[] args) throws FileNotFoundException {
        // Setup input and output file handling
        File inputFile = new File("C:\\Users\\gchamb02\\Desktop\\Gaurav Learnings\\Java\\Java_learning\\src\\main\\java\\org\\Hashing\\input.txt");
        File outputFile = new File("C:\\Users\\gchamb02\\Desktop\\Gaurav Learnings\\Java\\Java_learning\\src\\main\\java\\org\\Hashing\\output.txt");
        Scanner sc = new Scanner(inputFile); // Reading from input file
        PrintWriter pw = new PrintWriter(outputFile); // Writing to output file

        // Reading the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Reading the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Creating a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Optional: print the frequency map to the output file
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            pw.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Processing the queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            pw.println(frequencyMap.getOrDefault(number, 0));
        }

        // Close the file handlers
        sc.close();
        pw.close();
    }
}
