package j2se.basics.inheritance;

public class App {
public static void main(String[] args) {
	Employee e = new Employee();
	e.nationalId = 234;
	e.name = "Ram";
	e.address = "Kathmandu";
	e.empId = 12;
	e.position = "CEO";
	e.salary = 100000f;

	e.display();
	
//	Person p =new Person();
//	p.name = "Aayush Pandey";
//	p.nationalId = 32423;
//	p.address = "Gongabu";
}
}
