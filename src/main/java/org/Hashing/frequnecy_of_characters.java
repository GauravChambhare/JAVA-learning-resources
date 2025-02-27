package org.Hashing;

import java.util.Scanner;

public class frequnecy_of_characters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        // precompute
        int[] hash = new int[256];// because there are only 256 ASCII characters
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)] += 1;
        }
        System.out.println("Enter number of characters whose frequency you want to find");
        int e = sc.nextInt();
        System.out.println("Enter the characters whose frequency you want to find in the string");
        while(e>0){
            String character = sc.next();
            System.out.println("Frequency of character "+ character + " is " + hash[character.charAt(0)]);
            e--;
        }
    }
}
