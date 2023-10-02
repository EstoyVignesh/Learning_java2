package basics;

class A1 {
	
	void msg()
	{
		System.out.println("Default method");
	}

}

class DefaultAccessModifier1
{
	public static void main(String args[])
	{
		A1 obj = new A1();
		obj.msg();
	}
	
}
