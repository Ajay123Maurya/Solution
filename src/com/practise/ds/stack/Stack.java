package com.practise.ds.stack;

import com.practise.ds.queue.DeQueue;
import com.practise.ds.queue.Queue;

public class Stack {

/*	private int arr[];
	private int top;
	
	public Stack(int n){
		arr = new int[n];
		top = -1;
	}
	public void push(int data) {
		if(top<arr.length) {
			arr[++top] = data;
		}else {
			System.out.println("OverFlow error  !!!!!!!!!!!!!!   ");
		}	
	}
	public int pop() {
		return arr[top --];
	}
	public int peek() {
		return arr[top];
	}
	public int search(int data) {
		int index = -1;
		for(int i= 0;i<=top; i++) {
			if(data== arr[i]) {
				index = i;
			}
		}
		return index;
	}
	public boolean isEmpty() {
		
		return (top == -1);
	}
	public String toString() {
	    StringBuffer sb = new StringBuffer();
		for(int i= 0;i<=top; i++) {
	    sb.append(arr[i]);
	    sb.append(" --  ");
		}
       return sb.toString();
	}*/
	public static void main(String[] arg) {
		
		Stack st = new Stack(5);
		st.push(2);
		st.push(5);
		st.push(9);
		st.push(6);
		st.push(9);
		System.out.println("Stack element =========   " + st);
		//System.out.println("Peak element =========   " + st.peek());
		st.pop();
		st.pop();
		st.pop();
		System.out.println("Stack element =========   " + st);
		//System.out.println("Peak element =========   " + st.peek());
		//System.out.println("index of 9 =========   " + st.search(9));
		st.push(15);
		st.push(29);
		System.out.println("Stack element =========   " + st);
		st.pop();
		System.out.println("Stack element =========   " + st);
		
	} 
	
	// :::::::::::::::::::::::::  Queue Implementation :::::::::::::::::::::::::::::::::::::
	/*
	private Queue queue = null;
	private int numElement;
	public Stack(int size) {
		queue = new Queue(size);
	}
	public void push(int data) {
		    queue.enQueue(data);
			for(int i = 0; i<numElement; i++) {
				queue.enQueue(queue.deQueue());
			}
		    numElement++;
		}
	public int pop() {
	   numElement--;
	   return queue.deQueue();
	}
	public String toString() {
		
		return queue.toString();
	}    */
	
	// :::::::::::::::::::::::::::::::    DeQueue Implementation ::::::::::::::::::::::::::::::::::::::
	private DeQueue queue = null;
	public Stack(int size) {
		queue = new DeQueue(size);
	}
	public void push(int data) {
	  queue.insertAfter(data);
	}
    public int pop() {
    	int data = queue.deleteAfter();
    	return data;
    }
public String toString() {
	return queue.toString();
}
	
}
