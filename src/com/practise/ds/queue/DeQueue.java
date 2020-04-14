package com.practise.ds.queue;

public class DeQueue {

     private int arr[];
     private int size;
     private int front;
     private int rear;
     
     public DeQueue(int size) {
    	 arr = new int[size];
    	 front = -1;
    	 rear = 0;
    	 this.size = size;
     }
     public boolean isFull() {
    	 
    	 return (front ==0 && rear == size -1)||(front == rear +1);
     }
     public boolean isEmpty() {
    	 
    	 return (front ==-1 && rear == 0);
     }
     public void insertAfter(int data) {
    	 
    	 if(isFull()) {
    		 System.out.println("OverFlow error");
    	 }
    	 else if(isEmpty()) {
    		 front =0;
    		 rear = 0;
    	 }
    	 else if(rear ==  size -1) {
    		 rear = 0;
    	 }else {
    		 rear = rear + 1; 
    	 }
    	 arr[rear] = data;
     }
     public int deleteAfter() {
    	 int data = arr[rear];
    	 if(isEmpty()) {
    		 System.out.println("UnderFlow error");
    	 }
    	 else if(front ==0 && rear == 0) {
    		 front = -1;
    		 rear = 0;
    	 }else if(rear == 0) {
    		 front = size - 1;
    	 }else {
    		 rear = rear - 1;	 
    	 }
    	 return data;
     }
     public void insertFront(int data) {
    	 
    	 if(isFull()) {
    		 System.out.println("OverFlow error");
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
     public int deleteFront() {
    	 int data = arr[front];
    	 if(isEmpty()) {
    		 System.out.println("UnderFlow error");
    	 }
    	 else if(front ==0 && rear == 0) {
    		 front = -1;
    		 rear = 0;
    	 }else if(front == size -1) {
    		 front = 0;
    	 }else {
    	 front = front + 1;
    	 }
    	 return data;
     }
     
     public int getFront() {
    	 return arr[front];
     }
     public int getRear() {
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
          dq.insertAfter(5); 
            
          System.out.println("insert element at rear end : 10 "); 
          dq.insertAfter(10);
            
          System.out.println("get rear element : "+ dq.getRear()); 
            
          dq.deleteAfter(); 
          System.out.println("After delete rear element new rear become : " +  
                                 dq.getRear()); 
            
          System.out.println("inserting element at front end"); 
          dq.insertAfter(15); 
            
          System.out.println("get front element: " +dq.getFront()); 
            
          dq.deleteFront(); 
            
          System.out.println("After delete front element new front become : " + 
                                     +  dq.getFront()); 
           
     } 
}
