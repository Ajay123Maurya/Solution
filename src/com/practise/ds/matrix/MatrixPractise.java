package com.practise.ds.matrix;

public class MatrixPractise {

	public int[][] matrixRotation(int a[][], int m, int n) {
		
		int row = 0,col = 0,prev = 0;
		
		prev = a[row+1][col];
		
		for(int i = col; i<n ; i++) {
			
			int curr = a[row][i];
			a[row][i]  = prev;
			prev = curr;
		}
		
		row++;
		
		for(int i = row; i<m; i++) {
			int curr = a[i][n-1];
			a[i][n-1]  = prev;
			prev = curr;
		}
		
		n--;
		
			for(int i = n-1; i>= col; i--) {
			int curr = a[m-1][i];
			a[m-1][i]  = prev;
			prev = curr;
		}
		
		m--;
	
		
			for(int i = m-1; i>= row; i--) {
			int curr = a[i][col];
			a[i][col]  = prev;
			prev = curr;
		}
			System.out.println("Prev value :::::::::    " + prev);
		col++;   
		
		
		return a;
	}
	
	public int[][] matrixRotationBy90Degree(int a[][], int n) {
		
		for(int x = 0; x<(n/2); x++) {
			
			for(int y = x; y<n-x-1; y++) {
				int temp  = a[x][y];
				a[x][y] = a[y][n-1-x];
				a[y][n-1-x] = a[n-1-x][n-1-y];
				a[n-1-x][n-1-y] = a[n-1-y][x];
				a[n-1-y][x]  = temp;
				
			}
		}
		return a;
		
	}
	
	public int[][] matrixRotationBy180Degree(int a[][], int n) {
		
		for(int x = 0; x<(n/2); x++) {
			
			for(int y = 0; y<n; y++) {
				int temp  = a[x][y];
				a[x][y] = a[n-1 -x][n-1-y];
				a[n-1 -x][n-1-y] = temp;	
			}
		}
		return a;
		
	}
	
	public int[][] matrixTranspose(int a[][], int m, int n){
         for(int x = 0; x<m; x++) {
			
			for(int y = x; y<n; y++) {
				int temp  = a[x][y];
				a[x][y] = a[y][x];
				a[y][x] = temp;	
			}
		}
		return a;
		
	}
	
	public int[][] ReverseColumn(int a[][], int m, int n){
        for(int x = 0; x<m; x++) {
			
			for(int y = 0,z = n-1; y<=z; y++,z--) {
				int temp  = a[y][x];
				a[y][x] = a[z][x];
				a[z][x] = temp;	
			}
		}
		return a;
		
	}
	 
	public void printArray(int c[][],int m,int n) {
		
		for(int i = 0; i< m; i++) {
			
			for(int j =0;j<n; j++) {
				
				char ch = (char) c[i][j];
				System.out.print(ch + " ");
				//System.out.print(c[i][j] + " ");
			}
			System.out.print("\n");
		}
		
	}
}
