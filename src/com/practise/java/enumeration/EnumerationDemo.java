package com.practise.java.enumeration;

enum Wisky {
	SIGNATURE(10), IB(20), HUNDREPPIPER(30), REDLABEL(40), BLACKLABEL(50), JACKDANIALS;
	int index;

	Wisky(int i) {
		this.index = i;
		System.out.println("Assigning value to object" + i);
	}

	Wisky() {
		System.out.println("Assigning value to default constructor" );

	}
	public int getIndex() {
		return index;
	}
}

public class EnumerationDemo {
	static Wisky m;
	public static void main(String[] args) {
		
		Wisky b = m.JACKDANIALS;
		 Wisky.SIGNATURE.index = 20;
		switch (b) {
		case BLACKLABEL:
			System.out.println("It is awesome brand more than 1000");
			break;
		case REDLABEL:
			System.out.println("It is awesome brand more than 1500");
			break;
		case HUNDREPPIPER:
			System.out.println("It is awesome brand more than 800");
			break;
		default:
			System.out.println("It is awesome brand more than 500");
			
		case IB:
			System.out.println("It is awesome brand more than 600");
			break;
		case SIGNATURE:
			System.out.println("It is awesome brand more than 700");
			break;
		
		}
	}
}
