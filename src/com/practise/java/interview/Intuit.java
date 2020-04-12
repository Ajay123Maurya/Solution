package com.practise.java.interview;

import java.util.Scanner;

public class Intuit {
	
	public static void pivotGeneratorForUnsortedArray() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n>0){
		    int m = scan.nextInt();
		    int[] input = new int[m];
		    for(int i = 0;i<m; i++){
		        input[i] = scan.nextInt();
		    }
		    boolean[] aux = new boolean[m];
		    int max = input[0];
		    aux[0] = false;
		    for(int i=1;i<m-1;i++)
		    {
		        if(max>input[i])
		        {
		            aux[i] = false;
		        }
		        else
		        {
		            max = input[i];
		            aux[i] = true;
		        }
		    }
		    System.out.print( "\n");
		    int min = input[m-1];
		    aux[m-1] = false;
		    int ans = -1;
		    for(int i=m-2;i>=1;i--)
		    {
		        if(aux[i]==true)
		        {
		            if(min<input[i])
	    	            aux[i]=false;
	    	        else
	    	            ans = input[i];
		        }
		        if(min>input[i]) min = input[i];
		    }
		    System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pivotGeneratorForUnsortedArray();
	}

}
