package intermediate;

//A class which can have abstract methods is called as Abstract class. An abstract can have both abstract and non-abstract methods
//Normal classes can have only non-abstract methods
//If a class has atleast one abstract methods, then that class becomes an abstract class


abstract class BikeDetails1
{
	abstract void bikeDetails();
	int a = 7;
	
	void displayData()
	{
		//int a = 5;
		int b = 3;
		int c = a%b;
		System.out.println("Non-abstract method : "+c);
	}
}


 abstract class BikeDetails2 extends BikeDetails1
{

	void displayData1()
	{
		int b =5;
		int c = a*b;
		
		System.out.println("Non abstract method in child class : "+c);
	}
	
}

public class AbstractClassEx extends BikeDetails2 {
	
	@Override
	void bikeDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Implemented the abstract method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassEx obj = new AbstractClassEx();
		obj.bikeDetails();
		obj.displayData();
		obj.displayData1();

	}

	

}
