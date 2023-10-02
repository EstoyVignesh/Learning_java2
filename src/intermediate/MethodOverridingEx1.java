package intermediate;

/*
 * Method overriding or Runtime Polymorphism.
 * 
 * If both the parent class and child class has the same method signature, then that method is called as a Overridden method
 * 
 * method overriding is used to give a different implementation in the child class
 * It comes with parent child relationship. method overriding will happen in the child class
 * 
 * Same method signature--> no difference in the no. of arguments and no difference in the dataType of the arguments
 * 
 * 
 */


class Bike
{
	void run()
	{
		System.out.println("Bike is running");
		
	}
	
	void run1()
	{
		System.out.println("Bike1 is running");
	}
	
	void add(int a, int b)
	{
		int c= a+b;
		System.out.println("Addition of 2 nos "+c);
	}
		
}

public class MethodOverridingEx1 extends Bike{
	
	//Overridden method
	void run()
	{
		System.out.println("Overridden the run method in the child class");
	}
	
	void add(int a, int b)
	{
		int c=0;
		c=a+b;
		System.out.println("The addtion of "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverridingEx1 obj = new MethodOverridingEx1();
		obj.run(); //method in the child class
		obj.add(5, 5);

	}

}