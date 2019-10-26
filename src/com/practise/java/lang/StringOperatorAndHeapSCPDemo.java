package com.practise.java.lang;

public class StringOperatorAndHeapSCPDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 =new String("Ajay");
		String S2 = new String("Maurya G Great");
		String S3 = S1;
		System.out.println(S1==S3);
		String S4 = "Ajay";
		String S5 =S1.intern();
		System.out.println(S4==S5);
		String S6 =S2.intern();
		String S7 = "Maurya"+" G Great";
		System.out.println(S7==S6);
	    String S8 = "Maurya"; //if S8 will be final then S9 will be calculated at compile time else it will be calculated at run time
		String S9 = S8+" G Great";
		String S10 = S9.intern();
		System.out.println(S9==S7);
		System.out.println(S10==S7);
		//For run time operation a new object created in heap memory only.
		String S11 = S8.concat(" G Great");
		System.out.println(S11 ==S2);
		

	}

}
