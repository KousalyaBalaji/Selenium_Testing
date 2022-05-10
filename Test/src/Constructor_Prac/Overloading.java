package Constructor_Prac;

public class Overloading {

	public void Student(String name) {
		System.out.println(name);
	}

	public void Student(int rollno) {
		this.Student("Kousalya");
		System.out.println(rollno);
	}

	public void Student(float weight) {
		this.Student(12);
		System.out.println(weight);
	}

	public static void main(String[] args) {
		Overloading a = new Overloading();
		a.Student(99F);

	}

}
