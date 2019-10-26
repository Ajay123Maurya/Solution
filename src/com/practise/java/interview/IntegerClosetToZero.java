package com.practise.java.interview;

import java.util.TreeSet;

public class IntegerClosetToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -5, -1, 2, 3, 6, 7, 9, -4 };
		TreeSet<Integer> max = new TreeSet<Integer>();
		TreeSet<Integer> min = new TreeSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				max.add(a[i]);
			} else if (a[i] > 0) {
				min.add(a[i]);
			} else {
				System.out.println("Numebr is 0");
			}

		}
		
		if((Math.abs(max.last())<min.first())) {
			System.out.println(max.last());
		}else if((Math.abs(max.last())>min.first())) {
			System.out.println(min.first());
		}else {
			System.out.println(min.first());
		}
	}
	
  
}
