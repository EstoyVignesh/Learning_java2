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

class VehicleDetails
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
	
	
	//we can have only static variables inside a static method which is why it is showing error for vehicleName and price
	static void displayData1()
	{
		System.out.println("Inside static method");
		//System.out.println(vehicleName+":"+price+":"+vehicleType);
		System.out.println(vehicleType);


	}
	
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("addtion of 2 nos-->"+c);
	}
}



public class StaticMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VehicleDetails obj = new VehicleDetails();
		obj.vehicleName="Honda Activa";
		obj.price=90000;
		//obj.vehicleType="2 Wheeler";
		
		VehicleDetails obj1 = new VehicleDetails();
		obj1.vehicleName="Honda Shine";
		obj1.price=140000;
		//obj1.vehicleType="3 Wheeler";
		
		VehicleDetails.vehicleType="4 wheeler";
		VehicleDetails.vehicleType="6 wheeler";
		
		obj.displayData();
		obj1.displayData();
		
		VehicleDetails.displayData1();
		VehicleDetails.add(4, 7);
		

	}

}
