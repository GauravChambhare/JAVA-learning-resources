package org.multi_threading;

class EvenOddPrinter {
    private int number = 1;
    private int limit;

    public EvenOddPrinter(int limit) {
        this.limit = limit;
    }

    public synchronized void printEven() {
        while (number <= limit) {
            while (number % 2 != 0) { // Wait for odd number to complete
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even: " + number);
            number++;
            notify();
        }
    }

    public synchronized void printOdd() {
        while (number <= limit) {
            while (number % 2 == 0) { // Wait for even number to complete
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd: " + number);
            number++;
            notify();
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        int limit = 10;
        EvenOddPrinter printer = new EvenOddPrinter(limit);

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    }
}
