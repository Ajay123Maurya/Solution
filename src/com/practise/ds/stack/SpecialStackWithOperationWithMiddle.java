package com.practise.ds.stack;

public class SpecialStackWithOperationWithMiddle {
	
	Node head;
	int count;
	Node mid;
	
	class Node{
		
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void push(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head = new_node;
			count++;
		}else {
			new_node.next = head;
			head.prev = new_node;
			head = new_node;
			count++;
		}
		if(count == 1) {
			mid = head;
		}else {
			
			if(count % 2 != 0) {
				mid = mid.prev;
			}
		}
	}
	
	public void pop() {
		
		if(head == null) {
			System.out.println("UnderFlow");
		}else {
			head = head.next;
			head.prev = null;
			count--;
			if(count % 2 == 0) {
				mid = mid.next;
			}
		}
	}
	public int findMiddle() {
		int val = 0;
		val = mid.data;
		return val;
	}
	public void deleteMiddle() {
		if(count % 2 == 0) {
			mid.prev.next = mid.next;
			mid.next.prev = mid.prev;
			mid = mid.prev;
		}else {
			mid.prev.next = mid.next;
			mid.next.prev = mid.prev;
			mid = mid.next;
		}
	}
	 /**
     * Method to print elements of list
     */
    public void printList() 
    { 
        Node currNode = this.head; 
   
        System.out.print("LinkedList: "); 
   
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
        System.out.print("\n");
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SpecialStackWithOperationWithMiddle sk = new SpecialStackWithOperationWithMiddle();
             sk.push(1); 
             sk.push(2); 
	         sk.push(3); 
	         sk.push(4); 
	         sk.push(5); 
	         sk.push(6); 
	         sk.push(7); 
	         
	         sk.printList();
	         System.out.println("Middle element ::   " + sk.findMiddle());
	         
	         sk.pop();
	        // sk.pop();
	         
	         sk.printList();
	         System.out.println("Middle element ::   " + sk.findMiddle());
	         
	         sk.deleteMiddle();
	         
	         sk.printList();
	         System.out.println("Middle element ::   " + sk.findMiddle());
	         
             sk.deleteMiddle();
	         
	         sk.printList();
	         System.out.println("Middle element ::   " + sk.findMiddle());
	         

	}

}
