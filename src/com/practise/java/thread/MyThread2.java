package com.practise.java.thread;

public class MyThread2 extends Thread{

	Display d;
	String name;
	public MyThread2(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run()
     {
		d.displayc();
		}
}
