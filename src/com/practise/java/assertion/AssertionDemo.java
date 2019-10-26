package com.practise.java.assertion;

public class AssertionDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1 - we can use method having return type in  assertion argument  but not void type.
        // 2 - we can use assertion for private function, test location of unreachable code but not for public function
		int x =10,y=5;
		assert(y>5);
		assert(x>10):"Assertion is good for debugging purpose";
		System.out.println("Assertion  always used for debugging using this is a good programming practise. ");
	}

}
