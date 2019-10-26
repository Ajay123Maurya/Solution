package com.practise.java.interview;

public class ChildDemo  extends MethodOveridingDemo{
 
	public void m1() {
		System.out.println("Parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOveridingDemo c = new ChildDemo();
		c.m1();
		
	}
}
