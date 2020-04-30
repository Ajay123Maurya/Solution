package com.practise.ds.stack;

public class TestCaseRunner {

	public static void main(String[]arg) {
		Stack st = new Stack();
		// String input = "a*b+c-d-3";
		String input = "[{a+(c*d/e+f)+g}-h]";
		st.infixToPostFix(input);
	}
}
