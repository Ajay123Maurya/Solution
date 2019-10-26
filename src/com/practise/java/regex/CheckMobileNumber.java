package com.practise.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          String line = scan.nextLine();
		  Pattern p = Pattern.compile("[789][0-9]{9}");
	      Matcher m = p.matcher(line);
	      if(m.find()) {
	      System.out.println("valid");
	      }else {
	    	  System.out.println("invalid");
	      }
	}

}
