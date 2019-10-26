package com.practise.java.thread;

public class SyncronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread1 t1 = new MyThread1(d1, "Ajay");
		MyThread1 t2 = new MyThread1(d2, "Janga");
		//MyThread2 t2 = new MyThread2(d1, "Janga");
		t1.start();
	    t2.start();
		//System.out.println("End of main thread");
	}
   
}
