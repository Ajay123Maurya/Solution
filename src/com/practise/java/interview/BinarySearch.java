package com.practise.java.interview;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,5,9,17,45,99,101,105,107,109};
		//int index = binaryWithWhileloop(a,105);
		int index = binaryWithRecursion(a,0,9,105);
		System.out.println(index);
	}
  
	public static int binaryWithWhileloop(int[] input, int num) {
		
		int end = input.length -1, start = 0;
		while(start <= end) {
			int mid = start + end;
			if(input[mid] == num) {
				return mid;
			}else if(input[mid] >= num) {
				end = mid -1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}

public static int binaryWithRecursion(int[] input,int start, int end, int num) {
		
		if(start >= end) {
			return -1;
		}
		int mid = start + end;
		if(input[mid] == num) {
			return mid;
		}else if(input[mid] >= num) {
			return binaryWithRecursion(input,start,mid -1, num);
		}else {
			return binaryWithRecursion(input,start,end, num);
		}
		
	}

public static int binarySearchForFirstAndLastOccurance(int[] input, int num) {
	int result = -1;
	int end = input.length -1, start = 0;
	while(start <= end) {
		int mid = start + end;
		if(input[mid] == num) {
			result = mid;
			//for first occurance
			end = mid -1;
			//for last occurance
			start = mid +1;
			return mid;
		}else if(input[mid] >= num) {
			end = mid -1;
		}else {
			start = mid+1;
		}
	}
	return result;
}
}

