package intermediate;


class Car
{
	String brandName;
	int carPrice;
	static String vehicleModel;
	
	void carDetails()
	{
		//System.out.println("New Model Cars :");
		System.out.println(brandName+":"+carPrice+":"+vehicleModel);
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Car obj =new Car();

obj.brandName="Porche";
obj.carPrice=540000;
obj.vehicleModel="200ce";

Car.vehicleModel ="geo";

obj.carDetails();
	}

}
