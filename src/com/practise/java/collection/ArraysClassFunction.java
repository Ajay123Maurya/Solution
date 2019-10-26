package com.practise.java.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysClassFunction {

	@SuppressWarnings({"rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
        String [] name = {"Ajay","Janga","Anil","Kankan"};
        Arrays.sort(name);
       // Arrays.sort(name,new MyComparator());
        for(String s1:name)
        System.out.println(s1);
       // int index = Arrays.binarySearch(name, "Anil",new MyComparator());
        int index = Arrays.binarySearch(name, "Anil");
        System.out.println(index);
        al = (ArrayList) Arrays.asList(name);
        System.out.println(al);
	}
	
}
