package advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionEx {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		/*
		 * first way to handle checked exceptions
		 * 
		 */
		/*//*/
		try
		{
			File file = new File("C:\\Users\\arvin\\eclipse-workspace\\learn_java\\Helloworld3.txt");
			Scanner sc = new Scanner(file);
		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("In Finally block");
		}
		System.out.println("Outside finally");
		
		
		
	/*	File file = new File("C:\\Users\\arvin\\eclipse-workspace\\learn_java\\Helloworld3.txt");
		Scanner sc = new Scanner(file);
		
		System.out.println("Throws exception");   */
		

	}

}
