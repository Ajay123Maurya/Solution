package com.practise.java.lang;

import java.lang.reflect.Method;

public class Student {

	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
  public int hashCode() {
	  return this.rollno;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(101, "Ajay");
		Student s2 = new Student(102, "Janga");
		System.out.println(s1.hashCode());
		System.out.println(s2.toString());
		System.out.println(s2.equals(s1));
		Object o =  new Student(101, "Ajay");
		Class c = o.getClass();
		System.out.println(c.getName());
		Method [] m = c.getDeclaredMethods();
		for(Method m1:m) {
			System.out.println(m1.getName());
		}
	}

}
