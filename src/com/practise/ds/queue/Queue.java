package com.practise.ds.queue;

import java.util.NoSuchElementException;

import com.practise.ds.stack.Stack;

/**
 * @author ajay.maurya
 *
 */
/**
 * @author ajay.maurya
 *
 */
public class Queue {
	
    ///////// Queue implementation using stack //////////////////////////////////////////
  /*  private Stack st1;
	private Stack st2;
	
	public Queue(int size) {
		
		st1 = new Stack();
		st2 = new Stack();
	}
	public void offer(String data) {
		
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		st1.push(data);
		
		while(!st2.isEmpty()) {
			st1.push(st2.pop());	
		}
	}
	
	public String poll() {
		String data = null;
		if(!st1.isEmpty()) {
		  	data = (String) st1.pop();
		}
		return data;
	}
	
	public String remove() throws NoSuchElementException{
		if(st1.isEmpty()) {
			throw new NoSuchElementException();
		}else {
			return (String) st1.pop();
		}
	}
	
	public String peek() {
		
		if(st1.isEmpty()) {
			return null;
		}else {
			return (String) st1.peek();
		}
	}
	public String element() throws NoSuchElementException{
		
		if(st1.isEmpty()) {
			throw new NoSuchElementException();
		}else {
			return (String) st1.peek();
		}
	}
	
	public String toString() {
		return st1.toString();
	}                                       */
	
	
	 //////////////////           Linked List implementation   /////////////////////////////
	
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			next = null;
		}
	}
	Node front;
	Node rear;
	public void offer(String data) {
		Node newNode = new Node(data);
		if(front == null && rear == null) {
			front = newNode;
			rear =  newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public String poll() {
        String data = null;
		if(front == null && rear == null) {
			return null;
		}else {
			data  = front.data;
			Node next  = front.next;
			front.next = null;
			front = next;
			return data;
		}	
	}
	public String remove() throws NoSuchElementException{
        String data = null;
		if(front == null && rear == null) {
			throw  new NoSuchElementException();
		}else {
			data  = front.data;
			Node next  = front.next;
			front.next = null;
			front = next;
			return data;
		}	
	}
	public String peek() {
        String data = null;
		if(front == null && rear == null) {
			return null;
		}else {
			data  = front.data;
			return data;
		}	
	}
	public String element() throws NoSuchElementException{
        String data = null;
		if(front == null && rear == null) {
			throw  new NoSuchElementException();
		}else {
			data  = front.data;
			return data;
		}	
	}
	
	public boolean isEmpty() {
		if(front == null && rear == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		   StringBuffer sb = new StringBuffer();
		   Node current = front;
		    while(current != rear) {
		    sb.append(current.data);
		    sb.append(" --  ");
		    current = current.next;
			}
		    sb.append(rear.data);
	       return sb.toString();
	}
	public static void main(String [] arg) {
		//Queue qu = new Queue(5);
		Queue qu = new Queue();
		qu.offer("2");
		qu.offer("4");
		qu.offer("11");
		System.out.println("Queue :::::::::    " + qu);
		qu.offer("7");
		qu.offer("23");
		System.out.println("Queue :::::::::    " + qu);
		
		for(int i = 0; i<3; i++) {
		System.out.println("Element deleting :::::::::    " + qu.poll());
		}
		System.out.println("Queue :::::::::    " + qu);
		qu.offer("78");
		qu.offer("34");
		System.out.println("Queue :::::::::    " + qu);
		System.out.println("Element deleting :::::::::    " + qu.poll());
	}   
	
///////// Queue implementation using array //////////////////////////////////////////
	
	/*private String arr[];
	private int rear;
	private int front;
	
	public Queue(int size) {
		this.arr = new String[size];
		this.front = -1;
		this.rear = -1;
	}                       */
	/**
	 * @param data
	 * Method to add element in queue
	 * 
	 */
/*	public void offer(String data) {
		int len  = arr.length;
		if(front == (rear+1)%len) {
			System.out.println("Over flow error   !!!!!!!!!!!!!!!     ");
			return;
		}else if(isEmpty()) {
			front = 0;
			rear =  0;
		}else {
			rear = (rear+1)%len;	
		}
		arr[rear] = data;
	}                             */  
/*	public boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}else {
			return false;
		}
	}                   */  
	/**
	 * @return
	 * 
	 * method to remove front element
	 * 
	 * return null if Queue is empty
	 * 
	 */
	/*	public String poll() {
		String data  = null;
		int len = arr.length;
        if(isEmpty()) {
        	System.out.println("UnderFlow Error   !!!!!!!!!!!!!!!!!!!!! " );
        }else if(front ==0 && rear == 0) {
            data = arr[front];
        	front = -1;
        	rear = -1;
        }else {
           data = arr[front];
           front = (front+1)%len;
        }
		return data;
	}                            */  
	/**
	 * @return
	 * @throws NoSuchElementException
	 * 
	 * this remove the front element 
	 * 
	 * throw NoSuchElementException if Queue is empty.
	 */
	/*	public String remove() throws NoSuchElementException{
		String data  = null;
		int len = arr.length;
        if(isEmpty()) {
        	throw new NoSuchElementException();
        }else if(front ==0 && rear == 0) {
            data = arr[front];
        	front = -1;
        	rear = -1;
        }else {
           data = arr[front];
           front = (front+1)%len;
        }
		return data;
	}                          */  
	/**
	 * @return
	 * 
	 * it return front element without removal
	 * 
	 * return null if queue is empty
	 */
/*    public String peek() {
		String data  = null;
        if(isEmpty()) {
        	System.out.println("UnderFlow Error   !!!!!!!!!!!!!!!!!!!!! " );
        }else {
            data = arr[front];
        }
		return data;
	}                        */  
	/**
	 * @return
	 * @throws NoSuchElementException
	 * 
	 * it return front element without removal
	 * 
	 * throw NoSuchElementException if Queue is empty
	 */
	
	/*	public String element() throws NoSuchElementException{
		String data  = null;
        if(isEmpty()) {
        	throw new NoSuchElementException();
        }else {
            data = arr[front];
        }
		return data;
	}      */  
/*	public String toString() {
	    StringBuffer sb = new StringBuffer();
	    if(front <= rear) {
		for(int i=front;i <= rear; i++) {
	    sb.append(arr[i]);
	    sb.append(" --  ");
		}
	   }else {
		   for(int i=front;i <arr.length; i++) {
			    sb.append(arr[i]);
			    sb.append(" --  ");
				}
		   for(int i= 0;i <= rear; i++) {
			    sb.append(arr[i]);
			    sb.append(" --  ");
				}
	   }
       return sb.toString();
	}   */                                                          
	
///////// Queue implementation using deQueue //////////////////////////////////////////
/*	private DeQueue que = null;
	public Queue(int size) {
		que = new DeQueue(size);
	}
	public void offer(int data) {
		que.insertAfter(data);
	}
	public int poll() {
		return que.deleteFront();
	}
	
	public String toString() {
		return que.toString();
	}    */
}
