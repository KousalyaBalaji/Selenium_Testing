package com.interface1;

public class Class_C implements Class_A, Class_B {

	@Override
	public void loc() {
		System.out.println("Chennai");

	}

	@Override
	public void ifsc() {
		System.out.println("sdjhsoidjoif");
	}

	@Override
	public void accno() {
		System.out.println("171836283");
	}

	@Override
	public void pin() {
		System.out.println("21873nbjks");

	}

	public static void main(String[] args) {

		Class_C c = new Class_C();
		c.accno();
		c.ifsc();
		c.loc();
		c.pin();

	}

}
