package com.practise.ds.queue;

import com.practise.ds.queue.PriorityQueue.Node;

public class DeQueue {

//////////////////////////////////////  Array Implementation  ///////////////////////////////
	
 /*    private String arr[];
     private int size;
     private int front;
     private int rear;
     
     public DeQueue(int size) {
    	 arr = new String[size];
    	 front = -1;
    	 rear = -1;
    	 this.size = size;
     }
     public boolean isFull() {
    	 
    	 return (front == (rear+1)%size);
     }
     public boolean isEmpty() {
    	 
    	 return (front ==-1 && rear == -1);
     }
     public void insertRear(String data) {
    	 
    	 if(isFull()) {
    		return;
    	 }
    	 else if(isEmpty()) {
    		 front =0;
    		 rear = 0;
    	 }else {
    		 rear = (rear + 1)%size; 
    	 }
    	 arr[rear] = data;
     }
     public String deleteRear() {
    	 String data = null;
    	 if(isEmpty()) {
    		 System.out.println("UnderFlow error");
    		 return data;
    	 }
    	 else if(front == 0 && rear == 0) {
    		 data = arr[rear];
    		 front = -1;
    		 rear = -1;
    	 }else if(rear == 0) {
    		 data = arr[rear];
    		 front = size - 1;
    	 }else {
    		 data = arr[rear];
    		 rear = rear - 1;	 
    	 }
    	 return data;
     }
     public void insertFront(String data) {
    	 
    	 if(isFull()) {
    		 System.out.println("OverFlow error");
    		 return;
    	 }
    	 else if(isEmpty()) {
    		 front =0;
    		 rear = 0;
    	 }
    	 else if(front ==  0) {
    		 front = size -1;
    	 }else {
    		 front = front - 1;
    	 }
    	 arr[front] = data;
     }
     public String deleteFront() {
    	 String data = null;
    	 if(isEmpty()) {
    		 System.out.println("UnderFlow error");
    	 }
    	 else if(front ==0 && rear == 0) {
    		 front = -1;
    		 rear = 0;
    	 }else {
    	 front = (front + 1)%size;
    	 }
    	 return data;
     }
     
     public String getFront() {
    	 return arr[front];
     }
     public String getRear() {
    	 return arr[rear];
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
   public static void main(String[] args) 
     { 
           
          DeQueue dq = new DeQueue(5); 
            
          System.out.println("Insert element at rear end  : 5 "); 
          dq.insertRear("5"); 
            
          System.out.println("insert element at rear end : 10 "); 
          dq.insertRear("10");
            
          System.out.println("get rear element : "+ dq.getRear()); 
            
          dq.deleteRear(); 
          System.out.println("After delete rear element new rear become : " +  dq.getRear()); 
            
          System.out.println("inserting element at front end"); 
          dq.insertRear("15"); 
            
          System.out.println("get front element: " +dq.getFront()); 
            
          dq.deleteFront(); 
            
          System.out.println("After delete front element new front become : "  +  dq.getFront()); 
           
     }                         */
	
	//////////////////////  Implementation Using Dequeue ////////////////////////////////////////////////
	
	private Node front;
	private Node rear;
	class Node{
		public String data;
		Node next;
		Node prev;
	    public 	Node(String data){
			    this.data = data;
			    next = null;
			    prev = null;
		}
	}
	
	public DeQueue() {
		front = null;
		rear  = null;
	}
	public void insertFront(String data) {
		
		Node newNode = new Node(data);
		if(front == null && rear == null) {
			front = newNode;
			rear  = newNode;	
		}else{
			newNode.next = front;
			front.prev = newNode;
			front =newNode;	
		}
		
	}
	public String deleteFront() {
		String data = front.data;
		Node temp = front.next;
		temp.prev = null;
		front.next = null;
		front = temp;
		return data;
	}
	public String getFront() {
		String data = front.data;
		return data;
	}
	public void insertRear(String data) {
		Node newNode = new Node(data);
		if(front == null && rear == null) {
			front = newNode;
			rear  = newNode;	
		}else{
			rear.next = newNode;
			newNode.prev = rear;
			rear = newNode;
		}
	}
	public String deleteRear() {
		String data = rear.data;
		Node temp = rear.prev;
		rear.prev = null;
		temp.next = null;
		rear = temp;
		return data;
	}
	public String getRear() {
		String data = rear.data;
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
			sb.append(current.data);
			sb.append(",");
			current = current.next;
		}
		sb.append(" ]");
		return sb.toString();
	} 
	   public static void main(String[] args) 
	     {  
	          DeQueue dq = new DeQueue(); 
	          dq.insertRear("5"); 
	          dq.insertRear("10");
	          System.out.println(dq); 
	          System.out.println("get rear element : "+ dq.getRear()); 
	          dq.deleteRear(); 
	          System.out.println("After delete rear element new rear become : " +  dq.getRear());     
	          System.out.println("inserting element at front end"); 
	          dq.insertRear("15");   
	          System.out.println("get front element: " +dq.getFront());  
	          dq.deleteFront();  
	          System.out.println("After delete front element new front become : "  +  dq.getFront());    
	     } 
}
