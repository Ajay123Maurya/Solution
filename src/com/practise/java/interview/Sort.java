package com.practise.java.interview;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 2, 7, 3, 12, 6, 1, 13, 5 };
		//int A[] = {7,11,5,13,16,9,4};
		 selection(A);
		// int B[] = bubble(A);
		//insertion(A);
		//mergeSort(A,0,7);
		//quickSort(A,0,6);
		printArray(A);

	}

	public static void selection(int A[]) {

		for (int i = 0; i < A.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[minIndex]) {
					minIndex = j;
				}
			}
			int min = A[i];
			A[i] = A[minIndex];
			A[minIndex] = min;
		}
	}

	public static int[] bubble(int A[]) {

		for (int i = 0; i < A.length; i++) {
			boolean flag = false;
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j + 1] < A[j]) {
					int min = A[j + 1];
					A[j + 1] = A[j];
					A[j] = min;
					flag = true;
				}
			}
			if (!flag)
				break;
		}
		return A;

	}

	public static void insertion(int A[]) {
		
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int hole =i;
			while(hole >0 && A[hole - 1] >value) {
				int temp = A[hole];
				A[hole] = A[hole -1];
				A[hole - 1] = temp;
				hole --;	
			}
		}
	}

	public static void printArray(int B[]) {
		for (int j = 0; j < B.length; j++) {
			System.out.print("    " + B[j]);
		}
	}

	public static void mergeSort(int[] a,int start,int end) {
		
		if(start < end) {
		int mid = (start + end)/2;
		
		mergeSort(a,start,mid);
		mergeSort(a,mid+1,end);
	    merge(a,start,mid,end);
	  }	
	}
	
	public static void merge(int a[],int start,int mid,int end) {
		
		int left[] = new int[mid-start+1];
		int right[] = new int[end-mid];
		for (int i= 0; i<left.length; ++i) 
            left[i] = a[start+i]; 
        for (int j=0; j<right.length; ++j) 
            right[j] = a[mid +1+ j];
		int nL =left.length;
		int nR = right.length;
		int i = 0,j = 0,k = start;
		while(i< nL && j < nR) {
		   if(left[i]<=right[j]) {
			   a[k] = left[i];
			   k++;
			   i++;
		   }else {
			 a[k] = right[j];
			 k++;
			 j++;
		   }
			
		}
		
		    while(i<nL) {
			
				   a[k] = left[i];
				   k++;
				   i++;
			 
		}
		    while(j<nR) {
				
				   a[k] = right[j];
				   k++;
				   j++;
			 
		}
	}
	
	public static void quickSort(int A[],int start,int end) {
		
		if(start<end) {
			int pIndex = partition(A,start,end);
			quickSort(A,start,pIndex - 1);
			quickSort(A,pIndex+1,end);
		}
	}
	
	public static int partition(int A[],int start,int end) {
		int pIndex =start,pivot = end;
		while(start<end) {
			
			if(A[start]<A[pivot]) {
				int temp = A[start];
				A[start] = A[pIndex];
				A[pIndex] = temp;
				pIndex ++;
			}
			start++;
		}
		int temp = A[pIndex];
		A[pIndex] = A[pivot];
		A[pivot] = temp;
		return pIndex;
	}
}
