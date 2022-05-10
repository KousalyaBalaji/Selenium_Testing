package Method_Overriding;

public class Class_B extends Overriding {
	
	public void student() {
		System.out.println("Priya");
		super.student();
	}

	public void marks() {
		System.out.println("Mark scored is eighty");
		super.marks();
	}
	
	public static void main(String[] args) {
		Class_B obj=new Class_B();
		obj.student();
		obj.marks();	
	}
}
