package ProblemSolving;


//Without using this keyword
//compiler will get confused when we have the same variable  name for both instance and local variable
class Employee
{
	String empName;
	int empId;
	
	Employee(String empName,int empId)
	{
		empName= empName;
		empId=empId;
	}
	
	public void display()
	{
		System.out.println("Employee Name is -->"+empName+" and his id is "+empId);
	}
	
}

public class WithoutThisKeywordEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj = new Employee("Arun",200);
		obj.display();
		
		Employee obj1 = new Employee("Guvi",500);
		obj1.display();
	}

}
