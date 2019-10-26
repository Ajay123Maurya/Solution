package com.practise.java.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Queue<Student> pq = new PriorityQueue<Student>(new MyComparator());
		Student s1 = new Student(101, "Ajay");
		Student s2 = new Student(102, "Janga");
		Student s3 = new Student(103, "Anil");
		Student s4 = new Student(104, "Kankan");
		Student s5 = new Student(105, "Pritam");
		Student s6 = new Student(106, "Malakar");
		pq.offer(s1);
		pq.offer(s2);
		pq.offer(s3);
		pq.offer(s4);
		pq.offer(s5);
		pq.offer(s6);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
	}

}
