package basics;

public class Simple_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data types
		/*
		 * byte --> which can store integer value between -128 to 127
		 * short -->store integer values from -32,768 to 32,767
		 * int --> -2^31 to 2^31-1
		 * long --> -2^63 to 2^63-1
		 * float --> storing decimal nos. It can store 7 digits after decimal
		 * double --> Storing decimal nos. It can store 16 digits after decimal
		 * boolean --> true  or false
		 * char --> to store single character
		 * 
		 * Memory for each datatype
		 * byte- 1 byte (8 bits)
		 * short- 2 bytes (16 bits)
		 * int- 4 bytes
		 * long- 8 bytes
		 * float- 4 bytes
		 * double- 8 bytes
		 * boolean- 1 bit
		 * char- 2 bytes
		 */
		
		/*
		 * int --> what type of data to store in the variable
		 * a-> variable name
		 * 10--> value
		 */
		int a=10;
		int b=20;
		int c= a+b;//30
		
		//concatenation is nothing but combining 2 different data types
		System.out.println("The value of a is "+ c);
		
	}

}
