package com.practise.ds.heap;

import java.util.ArrayList;

public class MaxHeap {
	
	private ArrayList<Integer> heap = null;
	
	public MaxHeap() {
		heap = new ArrayList<Integer>();
	}
	public void insert(int data) {
		heap.add(data);
		shiftUp();
	}
	private void shiftUp() {
		int j = heap.size()-1;
		while(j>0) {
			int k  = (j - 1)/2;
			if(heap.get(j)>(heap.get(k))) {
				int num = heap.get(j);
				heap.set(j, heap.get(k));
				heap.set(k, num);
			}else {
				break;
			}
			j = k;
		}
	}
	
	public void removeMaxElement() {
		heap.set(0, heap.get(heap.size() -1));
		heap.remove(heap.size()-1);	
		shiftDown();
	}
	private void shiftDown() {
		int k = 0;
		int l = 2*k + 1;
		
		while(l<heap.size()) {
			 int max   = l;
			if(heap.get(l)<(heap.get(l+1))) {
				max++;
			}
			
			if(heap.get(k)<(heap.get(max))) {
				int num = heap.get(k);
				heap.set(k, heap.get(max));
				heap.set(max, num);
			}else {
				break;
			}
			k = max;
			l = 2*k+1;
		}
	}
	public String toString() {
		return heap.toString();
	}
}

