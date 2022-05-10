package Hirar_Inher;

public class Class_C extends Class_A{
	
		public void div() {
			int a = 5;
			int c = 25;
			System.out.println("div is" + (a % c));
}
		public static void main(String[] args) {
			Class_B obj = new Class_B();
			Class_C obj1 = new Class_C();
			obj.mul();
			obj.sum();
			obj1.div();
		}
}