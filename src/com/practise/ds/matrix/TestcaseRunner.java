package com.practise.ds.matrix;

public class TestcaseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {1, 2, 3, 4}, 
                      {5, 6, 7, 8}, 
                      {9, 10, 11, 12}, 
                      {13, 14, 15, 16} }; 
		
		MatrixPractise mp = new MatrixPractise();
		//int b[][] = mp.matrixRotation(a, 4, 4);
		//mp.printArray(b, 4, 4);
		
		//int c[][] = mp.matrixRotationBy90Degree(a, 4);
	//mp.printArray(c, 4, 4);
		
		//int d[][] = mp.matrixRotationBy180Degree(a, 4);
		//mp.printArray(d, 4, 4);
		int[][] star = {{'*', '*', '^', '^', '*', '*'},
				        {'*', '*', '^', '^', '*', '*'},
				        {'*', '*', '^', '^', '*', '*'},
				        {'*', '*', '|', '|', '*', '*'},
				        {'*', '*', '|', '|', '*', '*'},
				        {'*', '*', '|', '|', '*', '*'}
				       };
		mp.printArray(star, 6, 6);
		int e[][] = mp.matrixTranspose(star, 6, 6);
		System.out.println("\n\n");
		mp.printArray(e, 6, 6);
		System.out.println("\n\n");
		int f[][] = mp.ReverseColumn(star, 6, 6);
		mp.printArray(f, 6, 6);
	}

}
