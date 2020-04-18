package com.practise.ds.Array;

public class BinarySearch {

	public int searchInCirculerSortedArray(int a[],int num) {
		int index = -1;
		int low = 0;
		int high = a.length - 1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid] == num) {
				index = mid;
				break;
			}else if(a[mid]<= a[high]) {
				if(num>a[mid] && num <=  a[high]) {
					low = mid+1;
				}else {
					high = mid - 1;
				}
				
			}else {
				
				if(num>= a[low] && num < a[mid]) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}
			
		}
		
		return index;	
	}
	public int pivoteIndexOfCircularlySortedArray(int a[]) {
		int index  = -1;
		int low  = 0;
		int high  = a.length - 1;
		while(low <= high) {
			int mid = (low + high)/2 ;
			if(a[mid]< a[mid -1] && a[mid]< a[mid + 1]) {
				index  = mid;
				break;
			}else if(a[mid] >= a[high]) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
			
		}
		return index;
	}
	
	public int binarySearchUsingRecursion(int a[],int low, int high, int num) {
		int index  = 0;
		int mid  = (low + high)/2;
		if(low>high) {
			index = -1;
		}
		if(a[mid] == num) {
			index =  mid;
		}else if(a[mid]< num) {
			low = mid+1;
			 index= binarySearchUsingRecursion(a,low,high,num);
		}else  {
			high = mid-1;
			index= binarySearchUsingRecursion(a,low,high,num);
		}
		return index;
	}
	
	public int binarySearchUsingRecursionForFirstOccurence(int a[],int low, int high, int num) {
		int index  = 0;
		int mid  = (low + high)/2;
		if(a[mid] == num) {
			index = mid;
			high = mid - 1;
			if(low<=high) {
			index = binarySearchUsingRecursionForFirstOccurence(a,low,high,num);
			}
		} if(a[mid]< num) {
			 low = mid+1;
			 index = binarySearchUsingRecursionForFirstOccurence(a,low,high,num);
			}if(a[mid]> num)  {
				high = mid-1;
				index= binarySearchUsingRecursionForFirstOccurence(a,low,high,num);
			}
		return index;
	}
	public int binarySearchUsingRecursionForLastOccurence(int a[],int low, int high, int num) {
		int index  = 0;
		int mid  = (low + high)/2;
		if(a[mid] == num) {
			index = mid;
			low = mid + 1;
			if(low<=high) {
			index = binarySearchUsingRecursionForLastOccurence(a,low,high,num);
			}
		}else if(a[mid]< num) {
			 low = mid+1;
			 index = binarySearchUsingRecursionForLastOccurence(a,low,high,num);
		}else {
				high = mid-1;
				index= binarySearchUsingRecursionForLastOccurence(a,low,high,num);
			}
		return index;
	}
	
	public boolean checkSumOfPairExistInCircularlySortedArray(int a[],int sum) {
		boolean flag = false;
		int minNumIndex = pivoteIndexOfCircularlySortedArray(a);
		int maxNumIndex = minNumIndex - 1;
		while(maxNumIndex != minNumIndex) {
			if(a[maxNumIndex]+a[minNumIndex]>sum) {
				if(maxNumIndex == 0) {
					maxNumIndex = a.length - 1;
				}else {
					maxNumIndex --;
				}
			}else if(a[maxNumIndex]+a[minNumIndex]<sum) {
				if(minNumIndex == (a.length - 1)) {
					minNumIndex = 0;
				}else {
					minNumIndex ++;
				}
			}else {
				System.out.println("Pair ::::::::    [" + a[minNumIndex] +":"+a[maxNumIndex] + "]");
				flag = true;
				break;
			}
			
		}
		
		return flag;
	}
}
