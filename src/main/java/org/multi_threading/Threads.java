package org.multi_threading;

// Extending threading using Thread class.
public class Threads extends Thread{
    public void run(){
        System.out.println("Thread is now running");
    }

    public static void main(String[] args) {
        Threads t = new Threads();
        t.start();
    }
}
