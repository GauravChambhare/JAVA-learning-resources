package org.practice_qustions;
import java.util.Scanner;
class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int percentage = (mark1+mark2+mark3)/3;
//        System.out.println("Entered marks were " + mark1 + mark2 + mark3);   Instead of this line
//        below LOC is better in terms of readability
        System.out.printf("Entered marks were %d, %d, and %d%n", mark1, mark2, mark3);
        System.out.println("Percentage for given marks is - " + percentage);
    }
}