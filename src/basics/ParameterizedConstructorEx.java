package basics;

public class ParameterizedConstructorEx {
	
	
	//If we pass arguments to a constructor, then its called as a parameterized constructor
	int employeeAge;
	String employeeName;
	
	public ParameterizedConstructorEx(int age, String name)
	{
		employeeAge=age;
		employeeName=name;
		
		System.out.println("The employee name is "+employeeName+" and his age is "+employeeAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructorEx obj= new ParameterizedConstructorEx(23,"Arun");
		ParameterizedConstructorEx obj1= new ParameterizedConstructorEx(34,"Testing");

		

	}

}
