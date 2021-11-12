package HomeWork15;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee Asghar=new Employee();
		Asghar.empId=123456;
		Asghar.salary=120000;
		
		System.out.println("Asghar's employee id is "+Asghar.empId);
		System.out.println("Asghar's salary is "+Asghar.salary);
		System.out.println("the CEO of Asghar's company is "+ Asghar.CEO);
		System.out.println();
		
		Employee Diego=new Employee();
		Diego.empId=7891011;
		Diego.salary=120000;
		System.out.println("Diego's employee id is "+Diego.empId);
		System.out.println("Diego's salary is "+Diego.salary);
		System.out.println("the CEO of Diego's company is "+ Diego.CEO);
		
		
	}

}
