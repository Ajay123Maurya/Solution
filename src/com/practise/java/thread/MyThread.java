package com.practise.java.thread;

public class MyThread  extends Thread{

	public void run() {
		//Thread.yield();
		NewThread w = new NewThread();
        w.start();
        try {
        	w.interrupt();
			w.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i< 5; i++) {
		System.out.println("My Thread is running ");
		
		}
	}
}
