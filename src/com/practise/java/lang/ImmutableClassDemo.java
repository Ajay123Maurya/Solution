package com.practise.java.lang;

public class ImmutableClassDemo {

	public int i;
	public ImmutableClassDemo(int i) {
		this.i = i;
	}
	public ImmutableClassDemo createObject(int i) {
		if(this.i==i) {
			return this;
		}else {
			return new ImmutableClassDemo(i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClassDemo ob = new ImmutableClassDemo(10);
		              ob.createObject(20);   
		              System.out.println(ob.i);
	}

}
