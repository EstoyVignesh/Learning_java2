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

class VehicleDetails1
{
	String vehicleName;
	int price;
	static String vehicleType;
	
	void displayData()
	{
		System.out.println(vehicleName+":"+price+":"+vehicleType);
	}
	
}



public class StaticVarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VehicleDetails1 obj = new VehicleDetails1();
		obj.vehicleName="Honda Activa";
		obj.price=90000;
		//obj.vehicleType="2 Wheeler";
		
		VehicleDetails1 obj1 = new VehicleDetails1();
		obj1.vehicleName="Honda Shine";
		obj1.price=140000;
		//obj1.vehicleType="3 Wheeler";
		
		VehicleDetails1.vehicleType="4 wheeler";
		VehicleDetails1.vehicleType="6 wheeler";
		
		obj.displayData();
		obj1.displayData();
		
		
		

	}
	

}
