package org.multi_threading;
import java.lang.Thread;

public class threads_practice_1 {
    

    public static void main(String[] args) throws InterruptedException{
        // System.out.println( Thread.activeCount());// get current no of active threads
        // System.out.println(Thread.currentThread().getName());//print currentThread name
        // Thread.currentThread().setName("--MAIN--");// set thred name
        // System.out.println(Thread.currentThread().getName());//
        // Thread.currentThread().setPriority(10);// set thread priority
        // System.out.println(Thread.currentThread().getPriority()); // get thread priority
        // System.out.println(Thread.currentThread().isAlive());// check if current thread is alive
        // //using sleep() with threads
        // for(int i= 3; i>0; i--){
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }
        // System.out.println("You are done!");
        
        // //Vreating object of MyThread class
        MyThread thread2 = new MyThread();
        thread2.start();
        // System.out.println(thread2.isAlive()); // check if thread is alive
        // System.out.println(thread2.getName());
        // if we create a thread that creates another thread then the later thread will inherit the priority of first thread
        // System.out.println(Thread.activeCount());
        // Below method can tell us if a thread is Daemon thread or not
        // System.out.println(thread2.isDaemon());
        // Below method can set a thread as Daemon thread.
        // thread2.setDaemon(true);
        // System.out.println(thread2.isDaemon());    
        
        // usign runnable
        //first create object of MyRunnable class and then pass this object to Thread class as constructor parameter

        MyRunnable runnable1 = new MyRunnable();
        Thread thread3 = new Thread(runnable1);
        thread3.start();
    }
} 
