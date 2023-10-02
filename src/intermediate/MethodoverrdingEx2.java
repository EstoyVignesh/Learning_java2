package intermediate;

class RBI
{
	void interest()
	{
		System.out.println("Interest rate of personal loan is with in 10");
	}
}

class HDFC extends RBI
{
	void interest()
	{
		System.out.println("Interest rate of personal loan is 9");

	}
	
}

class ICICI extends RBI
{
	void interest()
	{
		System.out.println("Interest rate of personal loan is 8");
	}
}

class AXIS extends RBI
{
	void interest()
	{
		System.out.println("Interest rate of personal loan is 8.5");
	}
}

public class MethodoverrdingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC hdfc= new HDFC();
		hdfc.interest();
		
		ICICI icici= new ICICI();
		icici.interest();
		
		AXIS axis = new AXIS();
		axis.interest();

	}

}
