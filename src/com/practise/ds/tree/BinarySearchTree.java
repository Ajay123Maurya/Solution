package com.practise.ds.tree;

public class BinarySearchTree {
	 Node root;
	 
	 public BinarySearchTree() {
		 root = null; 
	 }
	 public void insert(int data) {
		 //insertNodeByLoop(data);
		Node node =  insertNodeByRecursion(root, data);
		root = node;
	 }
	public void insertNodeByLoop(int data) {
	  
		if(root == null) {
			root = new Node(data);
		}else {
			
			Node current = null;
			current = root;
			while(true) {
				Node parent = current;
				if(data<current.data) {
					current = current.left;
					if(current ==null) {
						parent.left = new Node(data);
						break;
					}
				}else {
					current = current.right;
					if(current ==null) {
						parent.right = new Node(data);
						break;
					}
				}
				
			}
		}
	}
	
	public Node insertNodeByRecursion(Node node, int data) {
		
		if(node == null) {
			node = new Node(data);
		}else if(data < node.data) {
			node.left = insertNodeByRecursion(node.left,data);
		}else if(data > node.data) {
			node.right = insertNodeByRecursion(node.right,data);
		}else {
			System.out.println("Data given alredy exist");
		}
		return node;
	}
	public boolean search(int data) {
		//return searchByRecursion(root,data);
		return serachByLoop(data);
	}
	
	public boolean serachByLoop(int data) {
		boolean flag =false;
		if(root == null) {
		}else {
			Node current = null;
			current = root;
			while(true) {
				if(data > current.data) {
					current = current.right;
					if(current == null) {
						break;
					}
				}else if(data<current.data) {
					current = current.left;
					if(current == null) {
					    break;
					}
				}else {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
	public boolean searchByRecursion(Node node,int data) {

		boolean flag = false;
		if(root == null) {
		   flag = false;
		}else if(node.data == data) {
			return true;
		}else if(data > node.data){
			flag = searchByRecursion(node.right, data);
		}else {
			flag = searchByRecursion(node.left, data);
		}
		return flag;
	}
	public Node findMin(Node root) {
        Node min = null;
	    if(root.left ==null){
			min = root;
		}else {
			findMin(root.left);
		}
		return min;
	}
	public void delete(int data) {
		//deleteNodeByRecursion(root, data);
		deleteNodeByLoop(data);
	}
	
	public void deleteNodeByLoop(int data) {
		if(root == null) {
			System.out.println("Binary tree is empty ::::::::   ");
		}else {
			
			Node current = root;
			
			while(true) {
				Node parent = current;
				if(data < current.data) {
					current = current.left;
					if(current == null) {
						break;
					}
				}else if(data > current.data) {
					current = current.right;
					if(current == null) {
						break;
					}
				}else {
					
					if(current.left == null && current.right == null) {
						current = null;
						break;
					}else if(current.left != null && current.right == null) {
						parent.left = current.left;
						break;
					}else if(current.left == null && current.right != null) {
						parent.right = current.right;
						break;
					}else {
						Node temp = findMin(current);
						current.data = temp.data;
						deleteNodeByRecursion(current,temp.data);
						break;
					}
				}
			}
			
		}
	}
	public Node deleteNodeByRecursion(Node node,int data) {
		if(root == null) {
			System.out.println("Tree is empty:::::::::  ");
		}else if(data > node.data){
			node.right = deleteNodeByRecursion(node.right, data);
		}else if(data<node.data){
			node.left = deleteNodeByRecursion(node.left, data);
		}else {
			if(node.left == null && node.right ==null) {
				node = null;
			}else if(node.left == null && node.right != null) {
				node = node.right;
			}else if(node.left != null && node.right == null) {
				node = node.left;
			}else {
				Node temp = findMin(node.right);
				node.data = temp.data;
				node.right = deleteNodeByRecursion(node.right,temp.data);
			}
		}
		return node;
	}
  
	public void displayTree() {
		displayTree(root);
		System.out.println("\n");
	}
	public void displayTree(Node node) {
	
	if(node.left != null)
	  displayTree(node.left);
	
	  System.out.print(node.data + " ");
	
	if(node.right != null) {
		displayTree(node.right);
	}
}
	
}
