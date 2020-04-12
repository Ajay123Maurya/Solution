package com.practise.ds.stack;

public class Stack {

	int arr[];
	int top;
	
	Stack(int n){
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
	}
	public static void main(String[] arg) {
		
		Stack st = new Stack(5);
		st.push(2);
		st.push(5);
		st.push(9);
		st.push(6);
		st.push(9);
		System.out.println("Stack element =========   " + st);
		System.out.println("Peak element =========   " + st.peek());
		st.pop();
		st.pop();
		st.pop();
		System.out.println("Stack element =========   " + st);
		System.out.println("Peak element =========   " + st.peek());
		System.out.println("index of 9 =========   " + st.search(9));
		
	}
}
