package intermediate;

class A
{
	private int i=10;
	int a=15;
	private void msg()
	{
		System.out.println("Private method");
	}
	
	void msg1()
	{
		System.out.println("Not a private method");
	}
	
//}

//public class PrivateAcchttps://AccessModifier {
	
//	public static void main(String args[])
	{
		A obj= new A();
		obj.msg1();
		System.out.println(obj.a);
		//compile time error
		//obj.msg();
		
	}
	

}
