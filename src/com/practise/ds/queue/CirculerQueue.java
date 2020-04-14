package com.practise.ds.queue;

public class CirculerQueue {

	private int arr[];
	private int front;
	private int rear;
	private int size;
	
	public CirculerQueue(int size) {
		this.size  = size;
		front = -1;
		rear = -1;
		arr = new int[size];
	}
    public String toString() {
    	StringBuffer sb = new StringBuffer();
    	if (front == -1) 
        { 
            System.out.println("\nQueue is Empty"); 
            return null; 
        } 
        if (rear >= front) 
        { 
            for (int i = front; i <= rear; i++) {
            	sb.append(arr[i]);
    	        sb.append(" --  ");
            }
        } 
        else
        { 
        	   for (int i = 0; i <= rear; i++) {
               	sb.append(arr[i]);
       	        sb.append(" --  ");
               }
            for (int i = front; i < size; i++) {
            	sb.append(arr[i]);
    	        sb.append(" --  ");
            }
         
        } 
        return sb.toString();
    }
    public boolean isFull() {
   	 
   	 return (front ==0 && rear == size -1)||(front == rear +1);
    }
    public boolean isEmpty() {
   	 
   	 return (front ==-1 && rear == -1);
    }
	public void enQueue(int data) {
		
		if(isFull()) {
			System.out.println("       :::::::::::::::::::::::::::::::   OverFlow       ::::::::::::::     ");
		}else if(isEmpty()) {
			front = 0;
			rear =  0;
		}else if(front != 0 && rear == size -1) {
			rear = 0;
		}else {
			rear ++;
		}
		arr[rear] = data;
	}
	public int deQueue() {
		
		int data = arr[front];
	    if(isEmpty()) {
			System.out.println("       :::::::::::::::::::::::::::::::   UnderFlow       ::::::::::::::     ");
		}else if(front == 0 && rear == 0) {
			front = -1;
			rear = -1;
		}else if(front == size -1) {
			front = 0;
		}else {
			front ++;
		}
		return data;
	}
	public static void main(String [] arg) {
		CirculerQueue qu = new CirculerQueue(5);
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
}