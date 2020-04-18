package com.practise.ds.heap;

public class HeapApp {

	public static void main(String [] arg) {
		
	/*	MaxHeap mh = new MaxHeap();
		mh.insert(3);
		mh.insert(6);
		mh.insert(39);
		mh.insert(23);
		System.out.println("Heap value :::::::::::::::   " + mh);
		mh.insert(13);
		mh.insert(17);
		System.out.println("Heap value :::::::::::::::   " + mh);
		mh.removeMaxElement();
		System.out.println("Heap value :::::::::::::::   " + mh); */
		
		//MinHeap 
		MinHeap mnh = new MinHeap();
		mnh.insert(3);
		mnh.insert(6);
		mnh.insert(39);
		mnh.insert(23);
		System.out.println("Heap value :::::::::::::::   " + mnh);
		mnh.insert(13);
		mnh.insert(17);
		System.out.println("Heap value :::::::::::::::   " + mnh);
		mnh.removeMinElement();
		System.out.println("Heap value :::::::::::::::   " + mnh);
		
		
	}
}
