package employees;

public class Employee {

	private int eCode;
	private String eName;
	private String eMail;
	private String ePosition;
	private double eSalary;
	
	
	public Employee(int ecode, String ename, String email, String eposition, double esalary) {
		super();
		eCode = ecode;
		eName = ename;
		eMail =email;
		ePosition = eposition;
		eSalary = esalary;
	}
	
	
	public String getEmployeeDetails() {
		 //return "eCode" + eCode+ "  "+ eCode+ " " + eName + "  "+ eMail+ " " + ePosition+ " " + eSalary);
	return " eCode-- " + eCode + " eName-- " + eName  + " eMail-- " + 
	eMail + " ePosition-- " +ePosition + "eSalary--"+eSalary; 
	}
	
	public int geteCode() {
		return eCode;
	}
	public void seteCode(int eCode) {
		this.eCode = eCode;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getePosition() {
		return ePosition;
	}
	public void setePosition(String ePosition) {
		this.ePosition = ePosition;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

		
}