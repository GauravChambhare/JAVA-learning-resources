package org.I_O;

public class Ouput_in_JAVA {
    public static void main(String[] args) {
        int val1 = 1;
        float val2 = 2.01f;
        double val3 = 4.091d;
//        char val4 = '₹';
        char val4 = '\u20B9'; // Unicode escape sequence for ₹ // there seems to be some editor settings related issue
        // rupee symbol is not getting recognised by terminal/ console.
        System.out.println("Using println() function - " + Integer.toString(val1));
        System.out.print("Using print() function - " + Float.toString(val2)+ "|||  ");
        System.out.printf("Using printf() function - Value of val2 is %f and value of val3 is %3.3f%n",val2, val3);
        System.out.format("Using format() function - Value of val4 - %c%n", val4);
    }
}
