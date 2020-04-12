package com.practise.ds.linkedlist; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedlistOperation { 
  
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
    public static void printList(LinkedlistOperation list) 
    { 
        Node currNode = list.head; 
   
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
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
    	LinkedlistOperation list = new LinkedlistOperation(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
          list.add(1); 
          list.add(2); 
          list.add(3); 
          list.add(4); 
          list.add(5); 
          list.add(6); 
          list.add(7); 
          printList(list); 
          list.insertAfter(4,11);
          printList(list); 
          list.delete(11);
        // Print the LinkedList 
        printList(list);
        list.append(8);
        printList(list);
    } 
}