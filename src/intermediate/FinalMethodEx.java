package intermediate;

/*
 *When we declare final in method, We cantoverridde the method in teh child class
 */


class Bike1
{
	final void run()
	{
		System.out.println("Bike is starting");
	}
}
public class FinalMethodEx extends Bike1 {
	/* Overriding is not possible here because the method is declared as final
	void run()

	{
		
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethodEx obj= new FinalMethodEx();
		obj.run();
	}

}
