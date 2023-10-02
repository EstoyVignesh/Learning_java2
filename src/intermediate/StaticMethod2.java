package intermediate;



class Fruit
{
	String fruitName;
	int fruitPrice;
	static String fruitQuality;
	
	void display()
	{
		System.out.println("instance method");
		System.out.println(fruitName+":"+fruitPrice+":"+fruitQuality);
	}
	
	static void show()
	{
				
		System.out.println(fruitQuality);
		
	}
}
public class StaticMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fruit fru = new Fruit();
		
		fru.fruitName = "Mango";
		fru.fruitPrice = 50;
		
		Fruit.fruitQuality = "Low";
		
		fru.display();
		
		fru.show();
	}

}
