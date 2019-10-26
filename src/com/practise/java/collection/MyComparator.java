package com.practise.java.collection;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student) obj1;
		Student s2 = (Student) obj2;
		//String s1 = (String) obj1;
		//String s2 = (String) obj2;
		return s2.compareTo(s1);
	}
}
