package intermediate;

//Encapsulation is nothing but wrapping up of variables and methods together as a single unit. 
//It promotes data hiding. Basically if a class needs to access another class variables, it can access only through the methods of its class

class EmployeeDetails
{
	
	private String employeeName;
	private int employeeAge;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String empName) {
		employeeName = empName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int empAge) {
		employeeAge = empAge;
	}
	
}

 public class EncapsulationEx {
	
	public static void main(String args[])
	{
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmployeeName("Arun");
		emp.setEmployeeAge(30);
		
		System.out.println("The name of the employee is "+emp.getEmployeeName());
		System.out.println("The age of the employee is "+emp.getEmployeeAge());
		
	}

}
