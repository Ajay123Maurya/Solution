package com.practise.java.thread;

public class MyThread1 extends Thread{

	Display d;
	String name;
	public MyThread1(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run()
     {
		d.Wish(name);
		//d.displayn();
	 }
}
