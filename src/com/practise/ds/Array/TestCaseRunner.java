package com.practise.ds.Array;

public class TestCaseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]  = {3,5,6,8,9,12,1,2};
		BinarySearch bs  = new BinarySearch();
		/*int index = bs.searchInCirculerSortedArray(a, 8);
		System.out.println( "Index :::::::::::::::::::::    " + index);
	    index = bs.searchInCirculerSortedArray(a, 1);
		System.out.println( "Index :::::::::::::::::::::    " + index);  */
		
		
		//int index1  = bs.pivoteIndexOfCircularlySortedArray(a);
		//System.out.println("Pivote num  is :::::    " + a[index1]);
		
	//    int b[]  = {3,5,6,12,13,13,13,24};
	//	int index2 = bs.binarySearchUsingRecursion(b, 0, 7, 5);
	//	System.out.println(" index  is :::::    " + index2);
		
	//	int index3 = bs.binarySearchUsingRecursionForFirstOccurence(b, 0, 7, 13);
	//	System.out.println(" index of first occurance  is :::::    " + index3);
		
	//	int index4 = bs.binarySearchUsingRecursionForLastOccurence(b, 0, 7, 13);
	//	System.out.println(" index of last occurance  is :::::    " + index4);
		
	//	bs.checkSumOfPairExistInCircularlySortedArray(a, 15);
		
		ArrayPractise ap = new ArrayPractise();
		ap.MaxSumOfindexAndValueOfArray(a);
	}

}
