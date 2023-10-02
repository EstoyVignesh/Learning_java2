package advanced;

public class UncheckedExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20, b = 0;
		
		try
		{
			int c = a/b;
			System.out.println("The Value of C is "+c);
			
			//int arr[]  = {2};
			//System.out.println("The Value for 3 is "+arr[5]);
		}
		
	/*	catch(ArithmeticException ex)
		{
			System.out.println("We cant divide by Zero");
			
		}
		*/
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException ex )
		{
			System.out.println("Jumped to catch when the Exception occurs");
			System.err.println("Array index out of boubd exception");
		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}
		
		finally
		{
			System.out.println("In Finally block");

		}
		
	}

}
