package org.multi_threading;
import java.lang.Thread;

public class threads_practice_1 {
    

    public static void main(String[] args) throws InterruptedException{
        System.out.println( Thread.activeCount());// get current no of active threads
        System.out.println(Thread.currentThread().getName());//print currentThread name
        Thread.currentThread().setName("--MAIN--");// set thred name
        System.out.println(Thread.currentThread().getName());//
        Thread.currentThread().setPriority(10);// set thread priority
        System.out.println(Thread.currentThread().getPriority()); // get thread priority
        System.out.println(Thread.currentThread().isAlive());// check if current thread is alive
        //using sleep() with threads
        for(int i= 3; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!");
    }
} 
