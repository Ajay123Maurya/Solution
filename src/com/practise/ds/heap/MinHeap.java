package com.practise.ds.heap;

import java.util.ArrayList;

public class MinHeap {

	private ArrayList<Integer> heap  = null;
	
	public  MinHeap() {
		heap = new ArrayList<Integer>();
	}
	public void insert(int data) {
		heap.add(data);
		shiftUp();
	}
	public void removeMinElement() {
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		shiftDown();
	}
	private void shiftUp() {
		int k = heap.size() -1;
		while(k>0) {
			int nodeIndex = (k-1)/2;
			if(heap.get(k)<heap.get(nodeIndex)) {
				int num = heap.get(k);
				heap.set(k, heap.get(nodeIndex));
				heap.set(nodeIndex, num);
			}else {
				break;
			}
			k = nodeIndex;
		}
		
	}
	private void shiftDown() {
		int k  = 0;
		int l = 2*k + 1;
		while(l<heap.size()) {
			int min = l;
			if(heap.get(l)>heap.get(l+1)) {
				min++;
			}
			
			if(heap.get(k)>heap.get(min)) {
				int num = heap.get(k);
				heap.set(k, heap.get(min));
				heap.set(min, num);
			}else {
				break;
			}
			
		}
	}
	public String toString() {
		return heap.toString();
	}
}
