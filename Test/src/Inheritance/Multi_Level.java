package Inheritance;

public class Multi_Level extends Class_B {

	public void Salary(int sal) {
		System.out.println(sal);
	}

	public static void main(String[] args) {
		Multi_Level obj = new Multi_Level();
		obj.Company("Wipro");
		obj.Domain("support");
		obj.Project("Flex");
		obj.Salary(20000);
	}
}
