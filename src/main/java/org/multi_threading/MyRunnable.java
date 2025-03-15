package org.multi_threading;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		// Implementation of the run method
         System.out.println("This is implemented using Runnable interface");
         for(int i=0; i<10; i++){
            System.out.println("Thread3 : "+ i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
         System.out.println("Thread 3 execution is finished");
	}
}
