package org.multi_threading;

//Runnable is an interface, so we implement it if we want to create threads.
class Runnables implements Runnable {
    public void run(){
        System.out.println("Runnable thread running.");
    }


    public static void main(String[] args) {
        Thread t = new Thread(new Runnables());
        t.start();
    }
}
