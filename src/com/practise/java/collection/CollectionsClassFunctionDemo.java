package com.practise.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassFunctionDemo {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "Ajay");
		Student s2 = new Student(102, "Janga");
		Student s3 = new Student(103, "Anil");
		Student s4 = new Student(104, "Kankan");
		Student s5 = new Student(105, "Pritam");
		Student s6 = new Student(106, "Malakar");
		al.add(s1);
		al.add(s5);
		al.add(s6);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");
		arrlist.add("D");
		// Search the list for key 'D'
		int index2 = Collections.binarySearch(arrlist, "D");
		System.out.println(index2);
		
		Collections.sort(al, new MyComparator());
		System.out.println(al);

		int index = Collections.binarySearch(al, s4, new MyComparator());
		System.out.println(index);
		Collections.reverse(arrlist);
		System.out.println(arrlist);
		
	}

}
