package org.multi_threading;
/*
* Create two threads: one by extending the Thread class and another by implementing the Runnable interface.

Each thread should perform a different task, such as printing numbers or processing a simple calculation.

Use important thread methods like start(), run(), sleep(), and join().
* */
public class ThreadAssignment {

    public static class NumberPrinter extends Thread {
        public void run() {
            System.out.println("Printing numbers from 1 to 10");

            for (int i = 1; i < 5; i++) {
//                System.out.println(i);
                try {
                    Thread.sleep(500);
                    System.out.println(i);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
            System.out.println("NumberPrinter finished");
        }
    }

    public static class SquareCalculator implements Runnable {
        @Override
        public void run() {
            System.out.println("Printing squares of numbers from 1 to 5");
            for (int i = 1; i < 5; i++) {
//                System.out.println(i * i);
                try {
                    Thread.sleep(500);
                    System.out.println(i);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
            System.out.println("SquareCalculator finished");
        }
    }

    public static void main(String[] args) {
        NumberPrinter n = new NumberPrinter();
        n.start();
        Thread sc = new Thread(new SquareCalculator());
        sc.start();
        try {
            n.join();
            sc.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread completed");
    }
}

