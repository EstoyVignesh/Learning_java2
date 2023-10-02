package advanced;

//runtime exceptions or unchecked exceptions. These exceptions will be thrown only when there is error in runtime which we wont be able to predict
//If any exception is thrown, it will come out of the program abruptly. We can handle this using Exception handling mechanism,

/*
 * 1. Try/catch Block
 * 2. throws 
 * 3. throw
 */

/*
 * try
 * {
 * 		//we will write code that might throw exception
 * }
 * catch(Excepion ex)
 * {
 * 		//the thrown exception will be caught in catch block
 * }
 */

public class UncheckedExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0;
		
		int c;
		
		try
		{
			c=a/b;
			System.out.println("The value of c is "+c);
			
			int arr[]= {3}; //index 0
			System.out.println("The value of arr[2]-->"+arr[2]);			
			
		}
		
		
		catch(ArithmeticException ex)
		{
			System.out.println("We cant divide by Zero");
			
		}
		
		/*
		catch(ArrayIndexOutOfBoundsException | ArithmeticException ex ) //introduced from Java 1.7
		{
			System.err.println("Array index out of bound exception");
			ex.printStackTrace();
		}
		*/
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Inside Try block");
		

	}

}
