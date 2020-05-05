package com.practise.ds.stack;

import java.util.ArrayList;

import com.practise.ds.linkedlist.LinkList;
import com.practise.ds.queue.DeQueue;
import com.practise.ds.queue.Queue;

public class Stack {
	
	// **********************  Array  *******************************

	/*private int arr[];
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
	
	/*   ===========================   ArrayList representation ======================    */
	
	private ArrayList<Object> al = null;
	private int top;
	
	public Stack(){
		al = new ArrayList<Object>();
		top = -1;
	}
	public void push(Object data) {
	        top++;
			al.add(top, data);
	}
	public Object pop() {
		Object data = al.get(top);
		al.remove(top);
		top--;
		return data;
	}
	public Object peek() {
		return al.get(top);
	}
	public int search(int data) {
		int index = -1;
		for(int i= 0;i<=top; i++) {
			if(data == (int)al.get(i)) {
				index = i;
			}
		}
		return index;
	}
	public boolean isEmpty() {
		
		return (top == -1);
	}
	public String toString() {
	   
       return al.toString();
	}
	public static void main(String[] arg) {
		
		//Stack st = new Stack(5);
		Stack st = new Stack();
		st.push(2);
		st.push(5);
		st.push(9);
		st.push(6);
		st.push(9);
		
		//st.print();
	    System.out.println("Stack element =========   " + st);
		//System.out.println("Peak element =========   " + st.peek());
		st.pop();
		st.pop();
		st.pop();
		
		//st.print();
		System.out.println("Stack element =========   " + st);
		//System.out.println("Peak element =========   " + st.peek());
		//System.out.println("index of 9 =========   " + st.search(9));
		st.push(15);
		st.push(29);
	//	st.print();
		System.out.println("Stack element =========   " + st);
		st.pop();
		//st.print();
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
 	/*private DeQueue queue = null;
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
    }*/
	
/*	private LinkList list = null;
	
	public Stack() {
		list = new LinkList();
	}
	
	public void push(int data) {
		list.push(data);
	}
	public void pop() {
		list.pop();
	}
	public void print() {
		list.printList();
	}   */

/*	public boolean balencedParenthesis(String input) {
		boolean flag = false;
		Stack sk = new Stack();
		char ch[] = input.toCharArray();
		for(int i = 0;i<ch.length; i++) {
			if(isOpeningBraces(ch[i])) {
				sk.push(ch[i]);
			}else if(isClosingBraces(ch[i])) {
				if(!arePair(sk.top(),ch[i])) {
					flag = false;
				}else {
					sk.pop();
				}
			}
		}
		if(sk.isEmpty()) {
			flag = true;
		}
		return flag;
	}                                               */
	
public void infixToPostFix(String input) {
    Stack sk = new Stack();
    String res = "";
	char ch[] = input.toCharArray();
	for(int i = 0;i<ch.length; i++) {
		if(isBraces(ch[i])) {
			if(isOpeningBraces(ch[i])) {
				sk.push(ch[i]);
			}else {
				while(!sk.isEmpty() && !arePair((char)sk.peek(), ch[i])) {
					res = res+(char)sk.pop();
				}
				sk.pop();
			}
		}else if(isOprator(ch[i])) {
			if(sk.isEmpty()) {
				sk.push(ch[i]);
			}else if(isOpeningBraces((char)sk.peek())) {
				sk.push(ch[i]);
			}
			else if(isHigherPrecedence(ch[i],(char)sk.peek())) {
				sk.push(ch[i]);
			 }else{
				while(!sk.isEmpty() && (!isHigherPrecedence(ch[i],(char)sk.peek())||!isOpeningBraces((char)sk.peek()))) {
					res = res+(char)sk.pop();
				}
				sk.push(ch[i]);
			}
			
		}else {
			    res = res+ch[i];
		}
	}
	while(!sk.isEmpty())
		res = res +sk.pop();
	System.out.println("PostFix form :::::::    " + res);
}  

private boolean isOprator(char ch) {
	if(ch == '/'||ch == '*'||ch == '+'|| ch == '-') {
		return true;
	}else {
		return false;
	}
	
}
private boolean isBraces(char ch) {
	if(ch == '['||ch == '{'||ch == '('||ch == ')'|| ch == '}'||ch == ']') {
		return true;
	}else {
		return false;
	}
	
}
private boolean isHigherPrecedence(char input1,char input2) {
    if(input1 == input2)
		return false;
	else if(input1 == '*'&&input1 == '/') {
		return false;
	}else if(input1 == '+'&&(input2 == '/' || input2 == '*')) {
		return false;
	}else if(input1 == '-') {
		return false;
	}else {
		return true;
	}	
}
	private boolean arePair(char opening,char closing) {
		boolean flag = false;
		if(opening == '{' && closing == '}') {
			flag = true;
		}
		else if(opening == '(' && closing == ')') {
			flag = true;
		}
		else if(opening == '[' && closing == ']') {
			flag = true;
		}
		return flag;	
	}
	private boolean isOpeningBraces(char ch) {
		boolean flag = false;
		if(ch == '{'||ch == '('||ch == '[') {
			flag = true;
		}
		return flag;
	}
/*	private boolean isClosingBraces(char ch) {
		boolean flag = false;
		if(ch == '}'||ch == ')'||ch == ']') {
			flag = true;
		}
		return flag;
	}                      */           
	
	public void nextGreaterElement(int arr[]) {
		Stack sk = new Stack(); 
		int n = arr.length;
		sk.push(arr[0]);
		for(int i=1;i<n;i++) {
			
			int current = arr[i];
			int element = (int) sk.pop();
			
				while(element < current) {
					System.out.println(current + "  is element next greater to  " + element);
					if(sk.isEmpty()) {
						break;
					}
					element = (int) sk.pop();
				}
				
				if(element > current) {
					sk.push(element);
				}
				sk.push(arr[i]);
		}
		while(!sk.isEmpty()) {
			
			System.out.println(-1 + "  is element next greater to  "+ sk.pop());
		}
		
	}
}
