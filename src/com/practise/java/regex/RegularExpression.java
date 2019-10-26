package com.practise.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
       
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
	 // Pattern p = Pattern.compile("[a-zA-Z0-9]");
     // Pattern p = Pattern.compile("[a-zA-Z0-9]*");
	//	Pattern p = Pattern.compile("[a-zA-Z0-9]+");
		// Pattern p = Pattern.compile("[a-zA-Z0-9]?");
		// Pattern p = Pattern.compile("\\s");
		// Pattern p = Pattern.compile("\\S");
		// Pattern p = Pattern.compile("\\s+");
		// Pattern p = Pattern.compile("\\S+");
		// Pattern p = Pattern.compile("\\d");
		//Pattern p = Pattern.compile("\\D");
		// Pattern p = Pattern.compile("\\d+");
		 Pattern p = Pattern.compile("\\D+");
      Matcher m = p.matcher("asdaAFGGGafgaads* &%12345@#$98765%d aasdd^&*(faaaLJaaa");
      while(m.find()) {
      System.out.println(m.start()+"..................."+m.end()+"......................."+m.group());
      }
	}

}
