package intermediate;

interface RBI1
{
	void interest();
}


class HDFC1 implements RBI1
{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("The rate of interest is 10");
		
	}
	
}

class ICICI1 implements RBI1
{

	@Override
	public void interest() {
		System.out.println("The rate of interest is 11");		
	}
	
}

public class InterfaceEx2 {
	
	public static void main(String args[])
	{
	
	HDFC1 hdfc1 = new HDFC1();
	hdfc1.interest();
	
	ICICI1 icici = new ICICI1();
	icici.interest();
	}


}
