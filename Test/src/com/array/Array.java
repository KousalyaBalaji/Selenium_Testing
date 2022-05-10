package com.array;

public class Array {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 67;
		a[1] = 32;
		a[2] = 45;
		a[3] = 57;
		a[4] = 78;

		for (int i = 0; i < 5; i++) {
			System.out.println("Value of " + i + "=" + a[i]);

		}

		System.out.println("___________________________________");

		int s[][] = { { 10, 20 }, { 34, 12 } };

		for (int i = 0; i < 2; i++) {
			System.out.println("Value of" + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("Value of" + j);

				System.out.println(s[i][j]);
			}
		}
	}

}
