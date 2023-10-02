package ProblemSolving;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Declare two strings
        String a = "Hello";
        String b = "World";
          
        // Print String before swapping
        System.out.println("Strings before swap: a = " + 
                                       a + " "+b);
          
        // append 2nd string to 1st
        a = a + b;
          
        // store initial string a in string b
  //      b = a.substring(0,a.length()-b.length());
          
        // store initial string b in string a
        
        a = a.substring(b.length());
          
        // print String after swapping
        
        System.out.println("Strings after swap: "+ a );
        
 //   System.out.println("Strings after swap: a = " + a + " " + b); 
                                     
		
	}

}
