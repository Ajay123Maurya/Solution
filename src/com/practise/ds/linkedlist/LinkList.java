package com.practise.ds.linkedlist;

import com.practise.ds.tree.BinarySearchTree;

// Java program to implement 
// a Singly Linked List 
public class LinkList { 
  
    Node head; // head of list 
    
     class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public  void add(int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (this.head == null) { 
            this.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = this.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
    } 
    // Method to insert a new node 
    public  void insertAfter(int prev ,int data) 
    { 

            Node last = this.head; 
            while (last.next != null) {
            	if(last.data == prev)
            		break;
                last = last.next; 
            }
            Node new_node = new Node(data); 
            new_node.next =last.next;
            last.next = new_node;
    } 
  
    // Method to insert a new node 
    public  void delete(int data) 
    { 

            Node last = this.head; 
            while (last.next != null) {
            	if(last.next.data == data) 
                    break;
            	last = last.next;
            }
            last.next = last.next.next;
    }
    
    
    // Method to insert a new node 
    public  void append(int data) 
    { 

            Node last = this.head; 
            while (last.next != null) {
            	last = last.next;
            }
            Node new_node = new Node(data); 
            last.next = new_node;
    }
    // Method to print the LinkedList. 
    public void printList() 
    { 
        Node currNode = this.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
        System.out.print("\n");
    } 
    
    
    
	public void  reverse() {
		
		Node prev = null,current = null,next;
		
		current = this.head;
		
		while(current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		this.head = prev;
	}
   
	public int  length() {
		
		int count = 0;
		
		Node current = this.head;
		
		while(current != null) {
			
			count++;
			current = current.next;
		}
		return count;
	}
   
	public int getElementFromStart(int index) {
		int data = 0,count = 0;
        Node current = this.head;
		
		while(current != null) {
			
			if(++count == index) {
				data = current.data;
				break;
			}
			current = current.next;
		}
		
		return data;
	}
	public int getElementFromEnd(int index) {
		int data = 0,count = 0;
        Node current = this.head;
        int len = this.length();
		index = len - index + 1;
		while(current != null) {
			
			if(++count == index) {
				data = current.data;
				break;
			}
			current = current.next;
		}
		
		return data;
	}
	public int search(int data) {
		int index = 0;
        Node current = this.head;
		while(current != null) {
			
			if(current.data == data) {
				index++;
				break;
			}
			index++;
			current = current.next;
		}
		return index;
	}
	
	public void  convertBinaryTreeToDoublyLinkList(BinarySearchTree bst) {
		
		while(true) {
			
			
		}
	}
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
    	LinkList list = new LinkList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
          list.add(1); 
          list.add(21); 
          list.add(3); 
          list.add(11); 
          list.add(5); 
          list.add(25); 
          list.add(7); 
          list.printList();
          
          System.out.println("Index of "+11+" in  list : -  "+list.search(11));
          
         // System.out.println("Element at index "+4+" in  list : -  "+list.getElementFromStart(4));
         // System.out.println("Element at index "+2+" in  list : -  "+list.getElementFromStart(2));
          
         // System.out.println("Element at index from end "+3+" in  list : -  "+list.getElementFromEnd(3));
         // System.out.println("Element at index from end "+6+" in  list : -  "+list.getElementFromEnd(6));
           
         // System.out.println("Length of list : -  "+list.length());
         // list.insertAfter(4,11);
          //list.printList();
          
         // System.out.println("Length of list : -  "+list.length());
          
         // list.delete(11);
        //  printList(list);
          
          
       // list.append(8);
       // printList(list);
          
       //   list.reverse();
       //   list.printList();
    } 
}