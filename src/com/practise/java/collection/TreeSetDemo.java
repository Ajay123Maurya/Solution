package com.practise.java.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student(101, "Ajay");
        Student s2 = new Student(102, "Janga");
        Student s3 = new Student(103, "Anil");
        Student s4 = new Student(104, "Kankan");
        Student s5 = new Student(105, "Pritam");
        Student s6 = new Student(106, "Malakar");
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        System.out.println(ts);
        TreeSet<Student> ts1 = new TreeSet<Student>(new MyComparator());
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        ts1.add(s5);
        ts1.add(s6);
        System.out.println(ts1);
        
        //Sorted set function
        
        System.out.println(ts1.headSet(s5));
        System.out.println(ts1.tailSet(s5));
        System.out.println(ts1.subSet(s5, s3));
        System.out.println(ts1.first());
        System.out.println(ts1.last());
        
        //Navigation set function
        System.out.println(ts1.floor(s5));
        System.out.println(ts1.lower(s5));
        System.out.println(ts1.ceiling(s4));
        System.out.println(ts1.higher(s4));
        System.out.println(ts1.pollFirst());
        System.out.println(ts1.pollLast());
        
        System.out.println(ts1);
	}

}
