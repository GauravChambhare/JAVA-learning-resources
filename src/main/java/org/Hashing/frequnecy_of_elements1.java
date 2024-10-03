package org.Hashing;

import java.util.Scanner;
import java.util.Arrays;

public class frequnecy_of_elements1 {
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
        int[] hash = new int[p+1];
        Arrays.fill(hash, 0);

        for(int k=0; k<n; k++){
            hash[arr[k]] +=1;
        }
        System.out.println("Enter number of elements whose frequency you want to find");
        int e = sc.nextInt();
        System.out.println("Now enter those elements");
        while(e>0){
            int num = sc.nextInt();
            System.out.println("Frequency is "+ hash[num]);
            e--;
        }
    }
}
