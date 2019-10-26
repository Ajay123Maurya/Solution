package com.practise.java.thread;

public class NewThread extends Thread{

	public void run() {
		//Thread.yield();
		for(int i =0;i<5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("I am lazy but i am interrupted");
			}
		System.out.println(" New Thread is running ");
		}
	}
}
