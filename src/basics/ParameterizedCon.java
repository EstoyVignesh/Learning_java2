package basics;

public class ParameterizedCon {
	int employeeSalary;
	int employeeId;

	public ParameterizedCon(int emp_salary, int emp_id) 
	
	
	{
		employeeSalary=emp_salary;
		employeeId = emp_id;
		
		System.out.println("The employee Salary is "+emp_salary+" and his ID is "+emp_id);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedCon obb = new ParameterizedCon(50000,245);
		ParameterizedCon Obk = new ParameterizedCon(20500,201);



	}

}
