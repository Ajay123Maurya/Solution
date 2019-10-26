package com.practise.java.thread;

public class ThreadYiledJoinSleepFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   MyThread t = new MyThread();
	        t.start();
	      // NewThread w = new NewThread();
	       // w.start();
	       // Thread.currentThread().interrupt();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("I got interuppted");
			}
	        for(int i= 0; i<5; i++) {
	        	System.out.println("Main thread is running");
	        }

	}

}
