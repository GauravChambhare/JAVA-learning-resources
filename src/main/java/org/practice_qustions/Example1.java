package org.practice_qustions;
import java.util.Scanner;
class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mark1 = sc.nextFloat();
        float mark2 = sc.nextFloat();
        float mark3 = sc.nextFloat();
        float percentage = (mark1+mark2+mark3)/3;
//        System.out.println("Entered marks were " + mark1 + mark2 + mark3);   Instead of this line
//        below LOC is better in terms of readability
        System.out.printf("Entered marks were %f, %f, and %f%n", mark1, mark2, mark3);
        System.out.println("Percentage for given marks is - " + percentage);
    }
}