package intermediate;

//declaring a class as final will not allow extending that class

final class Bike2
{
	void run()
	{
		System.out.println("Class is declared as final");
	}
}

//Compile time error because class is declared a s final
//public class FinalClassEx extends Bike2  {
public class FinalClassEx  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
