package intermediate;

class Power
{
	void frequency(int a, int b)
	
	{
		int c = a*b;
		System.out.println("The Power is Calculated in Ampere "+c);
		
	}


	void frequency(double a, double b, double c)
	{
		double d = a+b+c;
		System.out.println("The Voltage is Measured in Volts "+d);
	}
	
}

public class MethodOverloadingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Power amp = new Power();
amp.frequency(5.5,2.2,5.5);
amp.frequency(8, 2);
	}

}
