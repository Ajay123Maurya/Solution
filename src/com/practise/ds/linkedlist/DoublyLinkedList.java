package com.practise.ds.linkedlist;

import com.practise.ds.linkedlist.LinkedlistOperation.Node;

public class DoublyLinkedList {

    Node head; // head of list 
    
    class Node { 
 
       int data; 
       Node next; 
       Node prev;
       // Constructor 
       Node(int d) 
       { 
           data = d; 
           next = null;
           prev = null;
       } 
   } 
 
   // Method to insert a new node 
   public  void push(int data) 
   { 
       // Create a new node with given data 
       Node new_node = new Node(data); 
       // If the Linked List is empty, 
       // then make the new node as head 
       if (this.head == null) { 
           this.head = new_node; 
       } 
       else { 
    	   new_node.next = head; 
    	   head.prev = new_node;
      
    	   head = new_node;
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
           last.next.prev = new_node;
           new_node.prev = last;
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
           last.next.next.prev = last;
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
           new_node.prev = last;
   }
   // Method to print the LinkedList. 
   public static void printList(DoublyLinkedList list) 
   { 
       Node currNode = list.head; 
  
       System.out.print("DoublyLinkedList: "); 
  
       // Traverse through the LinkedList 
       while (currNode != null) { 
           // Print the data at current node 
           System.out.print(currNode.data + " "); 
  
           // Go to next node 
           currNode = currNode.next; 
       } 
       System.out.print("\n");
   } 
   /* Function to reverse a Doubly Linked List */
   void reverse() { 
       Node temp = null; 
       Node current = head; 
 
       /* swap next and prev for all nodes of  
        doubly linked list */
       while (current != null) { 
           temp = current.prev; 
           current.prev = current.next; 
           current.next = temp; 
           current = current.prev; 
       } 
 
       /* Before changing head, check for the cases like empty  
        list and list with only one node */
       if (temp != null) { 
           head = temp.prev; 
       } 
   }
   // Driver code 
   public static void main(String[] args) 
   { 
   	DoublyLinkedList list = new DoublyLinkedList(); 
         list.push(1); 
         list.push(2); 
         list.push(3); 
         list.push(4); 
         list.push(5); 
         list.push(6); 
         list.push(7); 
         printList(list); 
         list.insertAfter(4,11);
         printList(list); 
         list.delete(11);
         printList(list);
         list.append(8);
         printList(list);
         list.reverse();
         printList(list);
   } 

}
