package intermediate;

//Method overloading with the difference in the datatypes

class Arithmetic1
{
	void add(int a, int b)
	{
		int c= a+b;
		System.out.println("Addition of 2 nos-->"+c);
	}
	
	void add(double a, double b)
	{
		double c= a+b;
		System.out.println("Addition of 2 double nos-->"+c);
	}
}



public class MethodOverloadingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic1 obj = new Arithmetic1();
		obj.add(6, 7);
		obj.add(7.5,7.5);
		

	}

}
