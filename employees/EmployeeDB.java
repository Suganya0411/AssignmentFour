package employees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {

	List<Employee> employeeDB = new ArrayList<>();
	
	
	public String showPaySlip(int eCode) {
		String payslip = "employeeCode not found";
		for (Employee e: employeeDB) {
			if (e.geteCode()==eCode) {
				payslip =  "The payslip of the employee id " +eCode + " is  " + e.geteSalary();  ;
			}
			
		}
		return payslip;
		
	}
	public boolean	addEmployee(Employee e) {
			return employeeDB.add(e);
	}
		
	public boolean deletedEmployee(int eCode) {
			boolean deleted=false;
		
			Iterator<Employee> it = employeeDB.iterator();
			
			while(it.hasNext()) {
				Employee emp = it.next();
				if (emp.geteCode()==eCode){
					deleted=true;
					it.remove();
					
				}
			
			}
			return deleted;
	}
	
	
	public Employee[] listAll() {
		
		Employee[] eArray = new Employee[employeeDB.size()];
		for (int i = 0; i < employeeDB.size(); i++) 
			eArray[i] =employeeDB.get(i);
			return eArray;
				
	}
}
