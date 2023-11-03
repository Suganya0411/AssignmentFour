package employees;

import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		
		EmployeeDB employeeDB = new EmployeeDB();

		Employee emp1 = new Employee(11,"Arjun", "Arjun@abc.com", "Consultant", 100000.00);
		Employee emp2 = new Employee(12,"Aditya", "Aditya@abc.com", "Executive", 100000.00);
		Employee emp3 = new Employee(13,"Sanjay", "Sanjay@abc.com", "HR", 100000.00);
//		
//		
//		Employee emp1 = new Employee(11,"Arjun", "Arjun@abc.com", "Consultant", 100000.00f);
//		Employee emp2 = new Employee(12,"Aditya", "Aditya@abc.com", "Executive", 100000.00f);
//		Employee emp3 = new Employee(13,"Sanjay", "Sanjay@abc.com", "HR", 100000.00f);
//		
		
		employeeDB.addEmployee(emp1);
		employeeDB.addEmployee(emp2);
		employeeDB.addEmployee(emp3);
		
		for(Employee e: employeeDB.listAll())
			System.out.println(e.getEmployeeDetails());
			System.lineSeparator();
		employeeDB.deletedEmployee(1);
		
		
		for(Employee e: employeeDB.listAll())
			System.out.println(e.getEmployeeDetails());
		
		System.lineSeparator();
		System.out.println(employeeDB.showPaySlip(3));
		
	}
	
	
	

}
