package com.practise.java.interview;

import java.util.ArrayList;
import java.util.List;

public class ListNullDemo {
public static void main(String[] args) {
	
	List<String> al = new ArrayList<>();
	al.add("Ajay");
	al.add("Jang");
	al.add("null");
	al.add(null);
	al.add(null);
	al.add("Anil");
	
	
	System.out.println(al);
	System.out.println(al.size());
}
}
