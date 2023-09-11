package basics;

public class Allex_programs {

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
		
//==========================================================================================	;	
		
	//	conditional statements:

		//	If Else Code:

		
					
					//If Else is a conditional statement which will be used to validate a condition in java
					
					
					
					/*
					 * if(condition)
					 * {
					 * 	//condition passes
					 * }
					 * else if(next condition)
					 * {
					 *	//condition passes
					 *	}
					 *else
					 *{
					 *	//no condition passes
					 *
					 *}
					 *
					 */
					
				/*
				 
				 	
				 	int a =10;
					int b=10;
					int c=30;
					
					if (a>b)

					{
						System.out.println("a is greater than b");
						
					}
					else if (b>a)
					{
						System.out.println("b is greater than a");
					}
					else if(c>b)
					{
						System.out.println("c is greater than b");
					}
					else
					{
						System.out.println("a and b are equal");
					}
				
					*/
	//		==========================================               =================== ==           ===============


					
					
	//		If ElseIf code:


	
					
					//If Else is a conditional statement which will be used to validate a condition in java
					
					
					
					/*
					 * if(condition)
					 * {
					 * 	//condition passes
					 * }
					 * else if(next condition)
					 * {
					 *	//condition passes
					 *	}
					 *else
					 *{
					 *	//no condition passes
					 *
					 *}
					 *
					 */
					
					
					/*
					 * if block is mandatory. else if and else blocks are not mandatory
					 * 
					 */
					
					
				/*	
				    
				    int a =10;
					int b=20;

					
					if (a>b)
					{
						System.out.println("a is greater than b");
						
					}
					else
					{
						System.out.println("b is greater than a");
					}     
					
					  */
			
//===================================================			==================		==============================		
		
		
//		While loop:

		
					/*
					 * Loop --> repeating the same code again and again until the condition fails
					 * 
					 */
					
					/*
					 * while(condition)
					 * {
					 * 
					 *	//condition pass
					 * }
					 */ 
					
					
					
					
			/*		int i=1;
					
					while(i<10)
					{
						System.out.println("The value of is "+i);
						i++; //i=i+1, i=1+1, i=2
					}

			
					
					*/
					
					
		//	=================================                    ================================


		// do while
		
	
					/*
					 * do
					 * {
					 * 		//execute the code
					 * }while(condition);
					 * 
					 * Do while loop will get executed once irrespective of the condition (pass or fail) 
					 * whereas in while loop, condition would be validated first and then print
					 */
				
		
		
					/* 
					 
					 
					int i=1;
					do
					{
						System.out.println("The value of i is "+i);
						i++; //i=i+1
					}while(i<10);

			
		                                */
					
//===============                 =================================             ===================================		
		
		
//		For loop conditions
	
				
				/*
				 * for (initialization; condition; increment/decrement)
				 * {
				 * 
				 * 		//execute code
				 * }
				 * 
				 */
				
				//print 1 to 10 in ascending order
				
				
		
			/*
			 
			 	for(int i=1; i<=10;i++)
				{
					System.out.println("The value of i is "+i);
				}
				
				System.out.println("===============");
				
				//print 1 to 10 in descending order
				//i--,i=i-1
				for(int i=10; i>=1;i--)
				{
					System.out.println("The value of i is "+i);
				}

			*/
		
	//	=====================================================          ++++         ===============================================
	  
			
		
		//input for the program
		
		
/*		int factorialNumber=35;
		
		long factResult=1;
		
		for(int i=1; i<=factorialNumber;i++)
		{
			factResult= factResult*i;
			
			//factResult=1
			//factResult=1*2=2
			//factResult=2*3=6
			//factResult=6*4=24
			//factResult=24*5=120
		}
		System.out.println("The factorial value for the given number is "+factResult);
		
		
		
		*/
		
		
//=====================         ============================            ===========================		
		
		
				//  Relational Operators 
		
				
	/*			int a=10;
				int b=20;
				int c=20;
				System.out.println("a > b "+(a>b));
				System.out.println("a < b "+(a<b));
				System.out.println("c >= b "+(c>=b));
				System.out.println("a <= b "+(a<=b));
				System.out.println("c == b "+(c==b));
				System.out.println("a != b "+(a!=b));                               */
				
				
				
//				===============         ========================             =====================

/*
 
 	
		int num1=5;
		num1+=5; //num1+=5--> num1=num1+5=10
		System.out.println("The assignment operation value for addition is "+num1);
		
		int num2=5;
		num2-=2; //num2=num2-2=3
		System.out.println("The assignment operation value for substraction is "+num2);

		int num3=6;
		num3*=10; //num3=num3*10=60
		System.out.println("The assignment operation value for multiplication is "+num3);

		int num4=10;
		num4/=2; //num4=num4/2=5
		System.out.println("The assignment operation value for division is "+num4);
		
		int num5=5;
		num5%=5; //num5=num5%5=0
		System.out.println("The assignment operation value for modulo is "+num5);
		
		
		*/

//==========================================================================

	/*
	 	
	
		//logical ANd =&&
		//logical OR = ||
		
		int num1=10, num2=20, num3=30;
		boolean retVal=false;
		
		if( (num1<num2) && (num2>num1) )
		{
			retVal=true;
			System.out.println("AND Condition "+retVal);
		}
		 if( (num1<num2) && (num2<num1) )
		{
			retVal=true;
			System.out.println("AND Condition "+retVal);
		}
		 if ((num1<num2) || (num3<num1))
		{
			retVal=true;
			System.out.println("OR Condition "+retVal);
		}
		
		
		*/
		
//==========================         ==================================        ==========================
	// Statements
		
		//Break Statement
/*          
 
 		
 		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			
			System.out.println(i);
		}

	
	
	                    */
	                    
//=========================================================

	
	//continue statement will skip the current iteration and proceed to the next iteration based on the condition

	
		// TODO Auto-generated method stub
/*		for (int i=1; i<=10;i++)
		{
			
			if (i==5)
			{
				continue;
			}
			System.out.println(i);
		}

                                             */
		
		
//		================   =======================================     ===============================
				
				
				
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
