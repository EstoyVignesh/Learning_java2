package intermediate;

/*

//Local variable--> variables that are declared within the method and it will have the scope only within the same method
//instance variable--> variables that are declared outside of all the methods and it will have scope for all the methods inside the class.
						The values of the instance variables will change based on the instance or object of the class
						
//static variable-> 
 * Here vehicleName and price are instance variables and its value will change based on the instance
 * Whereas vehicleType is a static variable which belongs to the complete class. Once a value is set, it will reflect for all instances or objects
 * We use static for efficient memory mgmt. Since the static variable or method belongs to the complete, we should call them using classname.variablename
*/

class VehicleDetails2
{
	//instance or non-static variable
	String vehicleName;
	int price;
	static String vehicleType;
	
	//non-static method
	//A non-static method can have both static and non-static variable inside it
	void displayData()
	{
		System.out.println("instance method");
		System.out.println(vehicleName+":"+price+":"+vehicleType);
	}
	
	
	static
	{
		System.out.println("Inside static block");
		vehicleType="4 wheeler";
		
	}
	
	VehicleDetails2()
	{
		System.out.println("inside constructor");
	}
	
	
	
}



public class StaticBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VehicleDetails2 obj = new VehicleDetails2();
		obj.vehicleName="Honda Activa";
		obj.price=90000;
		
		VehicleDetails2 obj1 = new VehicleDetails2();
		obj1.vehicleName="Honda Shine";
		obj1.price=140000;
		
		obj.displayData();
		obj1.displayData();
		
		
		/*
		 * The exceution flow would be,
		 * 1. static block
		 * 2. constructor
		 * 3. instance methods
		 */

	}

}
