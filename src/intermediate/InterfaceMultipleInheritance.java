package intermediate;

interface Car1
{
	void carDetails();
}

interface Bike3
{
	void bikeDetails();
}

public class InterfaceMultipleInheritance implements Car1,Bike3 {
	
	@Override
	public void bikeDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Bike Details");
		
	}

	@Override
	public void carDetails() {
		// TODO Auto-generated method stub
		System.out.println("Car Details");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceMultipleInheritance obj= new InterfaceMultipleInheritance();
		obj.bikeDetails();
		obj.carDetails();

	}

	

}
