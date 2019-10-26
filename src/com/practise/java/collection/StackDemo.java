package com.practise.java.collection;

import java.util.Stack;

public class StackDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       boolean flag = true;
		String input="(({()})))[[";
        //Complete the code
        Stack st =new Stack();
        char ch[] = input.toCharArray();
        for(int i=0;i<ch.length;i++){
            try{
         if(ch[i] == '{' || ch[i] == '(' || ch[i] == '['){
         st.push(ch[i]);
        }else if(ch[i] == '}' || ch[i] == ')' || ch[i] == ']'){
         st.pop();
        }
       }catch(Exception e){
          // System.out.println("false");
       }
	}
    if(st.isEmpty()){
        System.out.println("true");
    }else{
         System.out.println("false");
    }

	}

}
