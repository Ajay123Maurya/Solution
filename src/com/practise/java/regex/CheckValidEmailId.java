package com.practise.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidEmailId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
          String line = scan.nextLine();
		  Pattern p = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+");
	      Matcher m = p.matcher(line);
	      if(m.find()) {
	      System.out.println("valid");
	      }else {
	    	  System.out.println("invalid");
	      }
	}

}
