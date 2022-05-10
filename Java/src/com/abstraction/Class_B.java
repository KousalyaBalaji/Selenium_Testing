package com.abstraction;

public class Class_B extends Class_A{

	@Override
	void ifsc() {
		System.out.println("dajdijdofkfoss");
		
	}

	@Override
	void acntno() {
		System.out.println("a6372382833");
		
	}

	
	public static void main(String[] args) {
		Class_B b = new Class_B();
		b.acntno();
		b.ifsc();
		b.loc();
		b.bank();
	}
}
