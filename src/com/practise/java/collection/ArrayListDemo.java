package com.practise.java.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al = new ArrayList();
        al.add("Ajay");
        al.add("Janga");
        al.add("Anil");
        al.add("Kankan");
        System.out.println(al);
        ArrayList all = new ArrayList();
        all.add("Ajay");
        all.add("Janga");
        all.add("Anil");
        all.add("Kankan");
        al.addAll(all);
        System.out.println(al);
        al.set(3, "landura");
        System.out.println(al);
        System.out.println(al.size());
        al.remove(4);
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.get(5));
	}

}
