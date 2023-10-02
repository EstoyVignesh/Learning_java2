package intermediate;

/*
//interface interfacename
{
	
}
*/

//interface can contain only method declaration (abstract methods). Whichever class is implementing that interface,... 
//.....should implement all the methods in that interface
//We cant create object to the interface but we can create object only to its implementing class.
//All the variables inside an interface would be final and static
//All the methods inside an interface will be abstract and public

interface BikeDetails
{
	public int a=10;
	
	//public static final int a=10;
	abstract void gear();
	void accelerate();
}

public class Interface1 implements BikeDetails {
	

	
	@Override
	public void gear() {
		System.out.println("Bike is running");
		
	}

	@Override
	public void accelerate() { 
		// TODO Auto-generated method stub
		System.out.println("Bike is accelerating");
		
	}

	public static void main(String[] args) {
		
		Interface1 obj = new Interface1();

		obj.gear();
		obj.accelerate();
		

	}

	

}
