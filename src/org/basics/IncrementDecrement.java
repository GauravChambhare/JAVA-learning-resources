package org.basics;

class IncrementDecrement{

    public static void main(String[] args) {
//        this example will help us in understanding how increment and decrement operators work in java
        int val1 = 9;
        int val2 = 9;
        char val3 = 'a';
        System.out.println("Checking !");
        System.out.println("val1 - " + val1);
        System.out.println("val1++ - " + val1++); // here first the variable value got initialized after
//        that it got incremented.
        System.out.println("++val1 - " + ++val1); // here first variable value got incremented after
//         that it got initialized.
         System.out.println("val2 - " + val2);

        System.out.println("val2-- - " + val2--); // here first the variable value got initialized after
//        that it got incremented.
        System.out.println("--val2 - " + --val2); // here first variable value got incremented after
//         that it got initialized.
         System.out.println("\nval3 - " + val3);

        System.out.println("val3-- - " + val3--); // here first the variable value got initialized after
//        that it got incremented.
        System.out.println("--val3 - " + --val3); // here first variable value got incremented after
//         that it got initialized.
        System.out.println("++val3 - " + ++val3 );
        System.out.println("++val3 - " + ++val3 );

    }
}