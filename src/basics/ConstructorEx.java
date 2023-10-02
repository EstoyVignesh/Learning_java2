package basics;

public class ConstructorEx {
	/*
	//Constructor is more like a method
	 * 1. If the method name is similar to the class name, then it is called as constructor
	 * 2. Constructor doesn't have any return type
	 * 3. Constructor cannot have keywords like static, final etc
	 * 
	 */
	
	 ConstructorEx()
	{
		 int a =2;
		 int b = 5;
		 int c = a*b;
		System.out.println("This is a default constructor with value : "+c);
	}
	
	public void normalMethod()
	{
		String str ="Hi";
		String str1 ="Java";
		String str2 = str.concat(str1);
				
		System.out.println("The Value of str2 : "+ str2);
		System.out.println("This is a normal method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorEx obj= new ConstructorEx(); 
		obj.normalMethod();

		
	}

}
