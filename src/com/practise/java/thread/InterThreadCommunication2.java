package com.practise.java.thread;

public class InterThreadCommunication2 extends Thread {

	int total =0;
	public void run() {
		;;;;;;;;;;;;;;;;;;;;;;;;;
		System.out.println("Not in sync block ");
		synchronized (this) {
			System.out.println("Calculating the total ");	
			for(int i=0; i<=1000; i++) {
				total =total +i;
			}
			this.notify();
		}

	}

	;;;;;;;;;;;;;;;;;;;;;;;;;;;
}
