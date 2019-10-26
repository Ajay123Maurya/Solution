package com.practise.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	// function demonstrated - add addll, add(int,object), contails,contailsAll, remove, removeAll. size, get,indexOf,lastIndexOf
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList ll = new LinkedList();
        ll.add("Ajay");
        ll.add("Janga");
        ll.add("Anil");
        ll.add("Kankan");
        System.out.println(ll);
        ArrayList lll = new ArrayList();
        lll.add("Ajay");
        lll.add("Janga");
        lll.add("Anil");
        lll.add("Kankan");
        ll.addAll(lll);
        System.out.println(ll);
        ll.set(3, "landura");
        System.out.println(ll);
        System.out.println(ll.size());
        ll.remove(4);
       // ll.removeAll(lll);
        System.out.println(ll.size());
        System.out.println(ll);
        ll.add(1, "fgh");
        System.out.println(ll.get(5));
        System.out.println(ll);
        System.out.println(ll.contains("Janga"));
        System.out.println(ll.containsAll(lll));
        System.out.println(ll.indexOf("Janga"));
        System.out.println(ll.lastIndexOf("Janga"));
        Iterator itr = ll.iterator();
        while(itr.hasNext()) {
        	if(((String)itr.next() == "fgh")){
        		itr.remove();
        		}
        	System.out.println(itr.next());
        }
	}
}
