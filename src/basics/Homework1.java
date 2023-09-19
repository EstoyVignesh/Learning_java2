package basics;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. get the String
		//2. reverse the String using the index without using reverse method
		//3. then compare the input string and the reversed string
		//4. If they are same, then its a palindrome string or else its not palindrome string
		

		String str = "anna";
		String revStr="";
		System.out.println("The Value of str is "+ str);
		for(int i = 0;i<str.length();i++) {
			
			 revStr = str.charAt(i)+ revStr ;
	    }
	    
	    System.out.println("Reversed string: "+ revStr);
	    if(str.equals(revStr)) {
	    	System.out.println("The Given String is a Palindrome");
	    	
	    }else
	    	System.out.println("The Given String is not Palindrome");
		
	    
	    //Draw Right ANgle Triangle using *
	   
	}
}
