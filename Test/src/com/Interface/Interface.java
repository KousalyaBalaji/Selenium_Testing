package com.Interface;

interface MyInterface {
	// Declaring abstract methods inside it
	void displayString(String s);

	void showNumber(int i);
}

// Implementing the interface using the implements keyword
public class Interface implements MyInterface {
	// Implementing all the methods declared in the interface
	public void displayString(String s) {
		System.out.println("The string value is: " + s);
	}

	public void showNumber(int i) {
		System.out.println("The integer value is: " + i);
	}

	public static void main(String args[]) {
		Interface obj = new Interface();
		obj.displayString("TechVidvan");
		obj.showNumber(20);
	}
}
