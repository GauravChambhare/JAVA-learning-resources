package org.multi_threading;

public class MyThread extends Thread {

    @Override
	public void run() {
		// Implementation of the run method
         System.out.println("This is implemented using Thread class");
         for(int i=10; i>0; i--){
            System.out.println("Thread2 : "+ i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
         System.out.println("Thread 2 execution is finished :)");
	}

    
}
