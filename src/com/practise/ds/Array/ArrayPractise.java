package com.practise.ds.Array;

public class ArrayPractise {
	
	public int MaxSumOfindexAndValueOfArray(int a[]) {
		int sumofMul = 0,sumOfElement = 0;
		int len = a.length;
		for(int i = 0; i< len; i++) {
			sumofMul += i*a[i];
			sumOfElement += a[i];
			}
		int sumArray[] = new int[len];
		sumArray[0] = sumofMul;
		for(int i = 1; i< len; i++) {
			int diff  = sumOfElement - (len*a[len -i]);
			sumArray[i] = sumArray[i-1]+diff;
		}
		int max =sumArray[0];
		int index = -1;
		for(int i = 1; i< len; i++) {
			if(max < sumArray[i]) {
				max  = sumArray[i];
				index =i;
			}
		}
		System.out.println("Rotation of max sum array   " + index + "  Sum is   " + max);
		return max;
	}

}
