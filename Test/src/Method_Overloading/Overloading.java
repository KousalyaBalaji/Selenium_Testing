package Method_Overloading;

public class Overloading {

	private void Company(String name) {
		System.out.println(name);
	}

	private void Company(int salary) {
		System.out.println(salary);
	}
private void Company(float time) {
	System.out.println(time);
}

public static void main(String[] args) {
	Overloading obj=new Overloading();
	obj.Company("wipro");
obj.Company(2);
obj.Company(9.50F);
}
}














