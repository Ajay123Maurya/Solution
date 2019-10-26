package com.practise.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, Student> hm = new HashMap<String, Student>();
        Student s1 = new Student(101, "Ajay");
        Student s2 = new Student(102, "Janga");
        Student s3 = new Student(103, "Anil");
        Student s4 = new Student(104, "Kankan");
        Student s5 = new Student(105, "Pritam");
        Student s6 = new Student(106, "Malakar");
        hm.put("CSE", s1);
        hm.put("ICE", s2);
        hm.put("ECE", s3);
        hm.put("CE", s4);
        hm.put("ME", s5);
        hm.put("EE", s6);
        
        System.out.println(hm.get("ECE"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        
        for(Map.Entry m : hm.entrySet()) {
        	
        	System.out.println(m.getKey()+"  ============  "+m.getValue());
        }
	}

}
