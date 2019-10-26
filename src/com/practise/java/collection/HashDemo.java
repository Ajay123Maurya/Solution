package com.practise.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet hs = new HashSet();
        hs.add("Ajay");
        hs.add("Janga");
        hs.add("Kankan");
        hs.add("Anil");
       System.out.println(hs.add("Ajay"));;
        hs.add("Janga");
        hs.add("Kankan");
        hs.add("Anil");
        hs.add(null);
        Iterator itr = hs.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
