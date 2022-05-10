package control_stat;

public class Control_St {

	public static void main(String[] args) {

		int a = 4;

		if (a > 3) {
			System.out.println("condition true");

			if (a < 3) {
				System.out.println("condition2 true");
				if (a < 6) {
					System.out.println("condition3 true");
				} else {
					System.out.println("Condition3 not true");
				}
			} else {
				System.out.println("Condition2 not true");
			}

		} else {
			System.out.println("Condition not true");
		}

		System.out.println("**************************");

		if (a > 8) {
			System.out.println("true");
		} else if (a < 3) {
			System.out.println("False");
		} else {
			System.out.println("AllFalse");
		}

		System.out.println("*******************************************************");

		switch (a) {
		case 7:
			System.out.println("Value low");
			break;

		case 5:
			System.out.println("Value low2");
			// break;

		default:
			System.out.println("AllFalseswitch");
			break;
		}

		System.out.println("**************************************************************");

		while (a < 6) {
			System.out.println("While1");
			a++;

			System.out.println("*********************************************************");
			
			do {
				System.out.println(++a);

			} while (a <=10);

		}

	}

}
