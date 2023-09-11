package basics;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 
	  	
	  	int marks = 91;
	 
		
		
		if(marks>90) {
			System.out.println("A Grade");
			
		}
		else if(marks>75) {
			System.out.println("B Grade");
			}
		else
			System.out.println("C Grade");
		
		*/
		
	 /*
	  
	     int n = 5;
	  
		long fact = 1;
		for(int i=1;i<=n;i++) {
		fact = fact * i;
			
				
		}
		
		System.out.println(fact);	        */
		
		
		
	// Multiplication Table	
		
/*		
 
        
        int number = 4;
		for(int i=1;i<=10;i++) {
			
			
			System.out.println(number+" * " +i+" = "+ number*i);
			
			
		}
		                                      */
		
		
		// Odd or Even
/*		
		int a = 5;
		
		if(a%2==0) {
			System.out.println("The given number is Even");
			
		}else
			System.out.println("The Given number is Odd");
		
		
		*/
		
		// Checking Prime Number
		

			    int num = 29;
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) {
			      // condition for nonprime number
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
		
		
		
	}

}
