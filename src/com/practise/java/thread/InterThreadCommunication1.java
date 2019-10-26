package com.practise.java.thread;

public class InterThreadCommunication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterThreadCommunication2  t1 = new InterThreadCommunication2();
		t1.start();

		synchronized (t1) {
			System.out.println("Main thread going to wait for total");
			try {
				t1.wait();
				System.out.println("Main thread got notification for total");
				System.out.println(" total is  "+ t1.total);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
