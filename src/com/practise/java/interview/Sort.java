package com.practise.java.interview;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 2, 7, 3, 12, 6, 1, 13, 5 };
		// int B[] = selection(A);
		// int B[] = bubble(A);
		int B[] = insertion(A);
		printArray(B);

	}

	public static int[] selection(int A[]) {

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
			// printArray(A);
			// System.out.println("\n");
		}
		return A;

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
			// printArray(A);
			// System.out.println("\n");
		}
		return A;

	}

	public static int[] insertion(int A[]) {
		for (int i = 1; i < A.length; i++) {
			int j = i - 1, insertIndex = 0;
			boolean flag = false;
			while (j >= 0) {
				if (A[i] < A[j]) {
					insertIndex = j;
					flag = true;
				}
				j--;
			}
			if (flag) {
				for (int x = i; x > insertIndex; x--) {
					int min = A[x - 1];
					A[x - 1] = A[x];
					A[x] = min;
				}
			}
			//printArray(A);
			//System.out.println("\n");
		}
		return A;

	}

	public static void printArray(int B[]) {
		for (int j = 0; j < B.length; j++) {
			System.out.print("    " + B[j]);
		}
	}

}
