package com.practise.java.thread;

public class Display {

	public void Wish(String name) {
		
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;//1 lakh code
		synchronized (Display.class) {
		for (int i =0; i<10;i++) {
			System.out.print("Good Morning  ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(name);
			System.out.println("\n");
		}
		}
		;;;;;;;;;;;;;;;;;;; // 1 lakh code
	}
	
	public void displayn() {
		for(int i=0;i<=9;i++) {
			System.out.println(i);
		}
	}
	public void displayc() {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
		}
	}
}
