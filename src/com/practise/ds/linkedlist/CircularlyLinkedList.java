package com.practise.ds.linkedlist;

public class CircularlyLinkedList {

  //  Node head; // head of list 
    
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
   public  Node push(Node node, int data) 
   { 
       // Create a new node with given data 
       Node new_node = new Node(data);
       
       if(node == null) {
    	   node = new_node;
    	   node.next = node;
       }else {
       Node temp = node;
       new_node.next = node;
       while(temp.next != node) {
    	   temp = temp.next;
       }
       temp.next = new_node;
       node = new_node;
       }
       return node;
       } 
   public void insert(Node head,int data) 
   { 
       // Create a new node with given data 
	   Node temp = head;
       Node new_node = new Node(data);
       while(temp.next != head) {
    	   
    	   if(temp.data>data && temp.next.data < data) {
    	   break;
    	   }
    	   temp = temp.next;
       }
       new_node.next = temp.next;
       temp.next= new_node;
       } 
   static void printList(Node head) 
   { 
       Node temp = head; 
       if (head != null) 
       { 
           do
           { 
               System.out.print(temp.data + " "); 
               temp = temp.next; 
           } 
           while (temp != head); 
       } 
   } 
     
   // Driver Code 
   public static void main(String args[]) 
   { 
       /* Initialize lists as empty */
       Node head = null; 
     
       /* Created linked list will 
          be 11.2.56.12 */
       CircularlyLinkedList ls = new CircularlyLinkedList();
       head = ls.push(head, 1); 
       head = ls.push(head, 2); 
       head = ls.push(head, 5); 
       head = ls.push(head, 8); 
     
       System.out.println("Contents of Circular " +  
                                   "Linked List:"); 
       printList(head);
       ls.insert(head, 6);
       System.out.println("\nContents of Circular " +  
               "Linked List:"); 
       printList(head);
       
   } 
}
