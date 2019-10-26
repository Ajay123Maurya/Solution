package com.practise.java.thread;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread t = new MyThread();
        System.out.println(Thread.currentThread().getPriority());
        t.setPriority(10);
        System.out.println(t.getPriority());
        t.start();
        for(int i= 0; i<5; i++) {
        	System.out.println("Main thread is running");
        }
	}

}
