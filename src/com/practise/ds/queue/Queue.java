package com.practise.ds.queue;

import com.practise.ds.stack.Stack;

public class Queue {
    ///////// Queue implementation using stack //////////////////////////////////////////
  /*  private Stack st1;
	private Stack st2;
	
	public Queue(int size) {
		
		st1 = new Stack(size);
		st2 = new Stack(size);
	}
	public void enQueue(int data) {
		
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		st1.push(data);
		
		while(!st2.isEmpty()) {
			st1.push(st2.pop());	
		}
	}
	
	public int deQueue() {
		int data = -1;
		if(!st1.isEmpty()) {
		  	data = st1.pop();
		}
		return data;
	}
	
	public String toString() {
		return st1.toString();
	}*/
	
	
	 ///////// Queue implementation using array //////////////////////////////////////////
	
	public static void main(String [] arg) {
		Queue qu = new Queue(5);
		qu.enQueue(2);
		qu.enQueue(4);
		qu.enQueue(11);
		System.out.println("Queue :::::::::    " + qu);
		qu.enQueue(7);
		qu.enQueue(23);
		System.out.println("Queue :::::::::    " + qu);
		
		for(int i = 0; i<3; i++) {
		System.out.println("Element deleting :::::::::    " + qu.deQueue());
		}
		System.out.println("Queue :::::::::    " + qu);
		qu.enQueue(78);
		qu.enQueue(34);
		System.out.println("Queue :::::::::    " + qu);
		System.out.println("Element deleting :::::::::    " + qu.deQueue());
	}   
	
/*	private int arr[];
	private int rear;
	
	public Queue(int size) {
		arr = new int[size];
	}
	public void enQueue(int data) {
		if(rear> arr.length-1) {
			System.out.println("Over flow error   !!!!!!!!!!!!!!!     ");
		}else {
		arr[rear] = data;
		rear ++;
		}
	}
	public int deQueue() {
		int data = arr[0];
		for(int i = 0; i<rear-1; i++) {
			int n = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = n;
		}
		rear --;
		return data;
	}
	public String toString() {
	    StringBuffer sb = new StringBuffer();
		for(int i=0;i<rear; i++) {
	    sb.append(arr[i]);
	    sb.append(" --  ");
		}
       return sb.toString();
	}   */
	
///////// Queue implementation using array //////////////////////////////////////////
	private DeQueue que = null;
	public Queue(int size) {
		que = new DeQueue(size);
	}
	public void enQueue(int data) {
		que.insertAfter(data);
	}
	public int deQueue() {
		return que.deleteFront();
	}
	
	public String toString() {
		return que.toString();
	}
}
