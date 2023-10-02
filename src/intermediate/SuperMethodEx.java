package intermediate;


class Employee10
{
	void empDetails()
	{
		System.out.println("Employee Details in parent class");
		
	}
}

class Employee3 extends Employee10
{
	void empDetails()
	{
		System.out.println("Employee Details in Child");
	}
	
	void printAllEmpDetails()
	{
		empDetails();
		super.empDetails();
	}

}

public class SuperMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 obj = new Employee3();
		obj.printAllEmpDetails();
	}

}
