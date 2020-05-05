package com.practise.ds.queue;

import java.util.Arrays;

public class PriorityQueue {

	 ///////// Queue implementation using array //////////////////////////////////////////
	
	/*	public static void main(String [] arg) {
			PriorityQueue qu = new PriorityQueue(5);
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
		}   
		
		private int arr[];
		private int rear;
		
		public PriorityQueue(int size) {
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
			Arrays.sort(arr);
			int data = arr[0];
			for(int i = 1; i<rear-1; i++) {
				arr[i-1] = arr[i];
				arr[i] = arr[i+1];
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
		}                            */
	
	/////////////////////////    Linked list implementation /////////////////////////////
	/*private Node front;
	private Node rear;
	class Node{
		public int priority;
		public String data;
		Node next;
	    public 	Node(int priority,String data){
			    this.priority = priority;
			    this.data = data;
			    next = null;
		}
	}
	
	public PriorityQueue() {
		front = null;
		rear  = null;
	}
	public void offer(int priority, String data) {
		
		Node newNode = new Node(priority,data);
		if(front == null && rear == null) {
			front = newNode;
			rear  = newNode;	
		}else if(priority< front.priority) {
			newNode.next = front;
			front =newNode;	
		}else if(priority> rear.priority) {
			rear.next = newNode;
			rear =newNode;	
		}else {
			Node current = front;
			while(!(priority<current.next.priority)) {
				current = current.next;
			}
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
		}
		
	}
	
	public String poll() {
		String data = front.data;
		Node temp = front.next;
		front.next = null;
		front = temp;
		return data;
	}
	
	public String peek() {
		String data = front.data;
		return data;
	}
	
	public boolean isEmpty() {
		
		if(front == null && rear == null)
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node current = front;
		sb.append("[ ");
		while(current != null) {
			sb.append("{ "+current.priority+" , "+current.data+" }");
			sb.append(",");
			current = current.next;
		}
		sb.append(" ]");
		return sb.toString();
	}                                      */
	
/////////////////////   Doubly Linked List Implementation  ////////////////////////////////
	
	private Node front;
	private Node rear;
	class Node{
		public int priority;
		public String data;
		Node next;
		Node prev;
	    public 	Node(int priority,String data){
			    this.priority = priority;
			    this.data = data;
			    next = null;
			    prev = null;
		}
	}
	
	public PriorityQueue() {
		front = null;
		rear  = null;
	}
	public void offer(int priority, String data) {
		
		Node newNode = new Node(priority,data);
		if(front == null && rear == null) {
			front = newNode;
			rear  = newNode;	
		}else if(priority< front.priority) {
			newNode.next = front;
			front.prev = newNode;
			front =newNode;	
		}else if(priority> rear.priority) {
			rear.next = newNode;
			newNode.prev = rear;
			rear =newNode;	
		}else {
			Node current = front;
			while(!(priority<current.next.priority)) {
				current = current.next;
			}
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
			temp.prev = newNode;
			newNode.prev = current;
		}
		
	}
	
	public String poll() {
		String data = front.data;
		Node temp = front.next;
		temp.prev = null;
		front.next = null;
		front = temp;
		return data;
	}
	
	public String peek() {
		String data = front.data;
		return data;
	}
	
	public boolean isEmpty() {
		
		if(front == null && rear == null)
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node current = front;
		sb.append("[ ");
		while(current != null) {
			sb.append("{ "+current.priority+" , "+current.data+" }");
			sb.append(",");
			current = current.next;
		}
		sb.append(" ]");
		return sb.toString();
	} 
	
	public static void main(String [] arg) {
		PriorityQueue qu = new PriorityQueue();
		qu.offer(3, "Ajay");
		qu.offer(2, "Mohan");
		qu.offer(6, "Raju");
		System.out.println("Queue :::::::::    " + qu);
		qu.offer(1, "Ali");
		qu.offer(4, "Selfie");
		qu.offer(9, "Raju");
		System.out.println("Queue :::::::::    " + qu);
		
			for(int i = 0; i<3; i++) {
		System.out.println("Element deleting :::::::::    " + qu.poll());
			}
		System.out.println("Queue :::::::::    " + qu);
		qu.offer(15, "Vivek");
		qu.offer(12, "Prateek");
		System.out.println("Queue :::::::::    " + qu);
	}
}
