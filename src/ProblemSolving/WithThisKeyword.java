package ProblemSolving;



//With using this keyword 
//this keyword is used the refer the current class instance  variable
class Employee1
{
	String empName;
	int empId;
	
	Employee1(String empName,int empId)
	{
		this.empName= empName;
		this.empId=empId;
	}
	
	public void display()
	{
		System.out.println("Employee Name is -->"+empName+" and his id is "+empId);
	}
	
}

public class WithThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 obj = new Employee1("Arun",200);
		obj.display();
		
		Employee1 obj1 = new Employee1("Guvi",500);
		obj1.display();
		
	}

}
