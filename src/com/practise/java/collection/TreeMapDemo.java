package com.practise.java.collection;

import java.util.TreeMap;

public class TreeMapDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		TreeMap<Student, String> tm = new TreeMap<Student, String>();
        Student s1 = new Student(101, "Ajay");
        Student s2 = new Student(102, "Janga");
        Student s3 = new Student(103, "Anil");
        Student s4 = new Student(104, "Kankan");
        Student s5 = new Student(105, "Pritam");
        Student s6 = new Student(106, "Malakar");
        tm.put(s1,"ICE");
        tm.put(s2,"ECE");
        tm.put(s3,"CSE");
        tm.put(s4,"ME");
        tm.put(s5,"EE");
        tm.put(s6,"CE");
        
        System.out.println(tm);
        
        TreeMap<Student, String> tm1 = new TreeMap<Student, String>(new MyComparator());
        tm1.put(s1,"ICE");
        tm1.put(s2,"ECE");
        tm1.put(s3,"CSE");
        tm1.put(s4,"ME");
        tm1.put(s5,"EE");
        tm1.put(s6,"CE");
        
        System.out.println(tm1);
        
        //Sorted set 
        System.out.println(tm1.firstKey());
        System.out.println(tm1.lastKey());
        System.out.println(tm1.headMap(s4));
        System.out.println(tm1.tailMap(s4));
        System.out.println(tm1.subMap(s4, s2));
        
        //navigation set
        System.out.println(tm1.ceilingKey(s4));
        System.out.println(tm1.higherKey(s4));
        System.out.println(tm1.floorKey(s4));
        System.out.println(tm1.lowerKey(s4));
        System.out.println(tm1.pollFirstEntry());
        System.out.println(tm1.pollLastEntry());
       
	}

}
