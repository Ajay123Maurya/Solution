package com.practise.ds.queue;

import java.util.Arrays;

public class PriorityQueue {

	 ///////// Queue implementation using array //////////////////////////////////////////
	
		public static void main(String [] arg) {
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
		} 
}
