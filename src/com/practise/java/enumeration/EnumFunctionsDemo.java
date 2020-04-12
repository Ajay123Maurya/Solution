package com.practise.java.enumeration;

public class EnumFunctionsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Wisky w[] = Wisky.values();
      for(Wisky w1:w) {
    	  System.out.println(w1 + "........................." + w1.getIndex());
    	  System.out.println(w1 + "........................." + w1.getIndex());
      }
	}
}
