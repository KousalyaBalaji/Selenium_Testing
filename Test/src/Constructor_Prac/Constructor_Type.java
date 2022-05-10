package Constructor_Prac;

public class Constructor_Type {

	//Default constructor or non parameterized
	public Constructor_Type() {
		System.out.println("Default constructor");
	}
	
	//parameterized constructor
	public Constructor_Type(String name) {
		this();
		System.out.println(name);
		
	}
	
	//supports overloading(method name same and different parameters)
	public Constructor_Type(float salary) {
		this("Kousi");
		System.out.println(salary);
	}
	
	public Constructor_Type(int eid) {
		this(23990.3F);
		System.out.println(eid);
	}
	
	public Constructor_Type(double profit) {
		this(43);
		System.out.println(profit);
	}
	
	public static void main(String[] args) throws Throwable {
		Constructor_Type cs = new Constructor_Type(34d);
		cs.finalize();
		
	}

}
