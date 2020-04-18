package com.practise.ds.tree;

public class TestCaseRunner {
	
	public static void main(String [] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(8);
		bst.insert(5);
	    bst.insert(10);
		bst.displayTree();
		bst.insert(4);
		bst.insert(16);
		bst.insert(23);
		bst.insert(3);
		bst.displayTree();
		//System.out.println("Verify that " +20+" exist " + bst.search(20));
		bst.delete(16);
		bst.displayTree();
		bst.delete(5);
		bst.displayTree();
	}

}
