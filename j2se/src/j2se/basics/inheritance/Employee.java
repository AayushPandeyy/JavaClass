package j2se.basics.inheritance;

public class Employee extends Person{
	int empId;
	String position;
	float salary;
	public void display() {
		super.display();
		System.out.println("\nEmployee Id: "+empId+"\tPosition: "+position+"\tSalary: "+salary);
	}
//	public void parentDisplay() {
//		super.display();
//	}
}
