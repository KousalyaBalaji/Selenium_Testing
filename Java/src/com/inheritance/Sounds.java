package com.inheritance;

public class Sounds extends Single_Animals {
	public void bark() {
		System.out.println("****");
	}

	public static void main(String[] args) {

		Sounds b = new Sounds();

		b.dogs();
		System.out.println("No of dogs : " + count);
		b.bark();
		System.out.println("Dogs Bark");

	}

}
