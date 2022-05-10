package com.constructor;

public class construct {

	int salary;
	String company;

	construct(int salary, String company) {

		this.salary = salary;
		this.company = company;

	}

	public static void main(String[] args) {
		construct c1 = new construct(20000, "deloitte");
		System.out.println("This is parameterized constructor" + "   " + c1.salary + " " + c1.company);

	}

}
