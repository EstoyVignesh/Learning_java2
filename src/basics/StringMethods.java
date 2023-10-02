package basics;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String is a non-primitive data type or a class. Here str is a variable/object to the String class
		
		//first way of creating String (String literals)
		String strr="Guvi";
		String strr1="Guvi";
		String strr2="welcome";
		
		//second way of creating Strings is using the new keyword
		String str4= new String("Hello");
		
		System.out.println(strr+"-->"+strr1+"-->"+strr2+"-->"+str4);
		
		
		
		/// String Methods
		//String is immutable in Java which means that once a value is assigned to the String variable/object, it cant be changed. 
		//If you change the value, store it in a new variable or object
		String str="java";
		
		str=str.concat(" is a programming language");
		
		System.out.println(str);
		
		String str1= str.toUpperCase();
		System.out.println("Uppercase-->"+str1);
		
		String str2= str1.toLowerCase();
		System.out.println("Lowercase-->"+str2);

		System.out.println("The character at index 5 is "+str2.charAt(5));
		
		String str5= str.replace("a", "e");
		System.out.println("Replace-->"+str5);
		
		String str6= str.replace("is", "was");
		System.out.println("Replace for str 6-->"+str6);
		
		boolean value=str.contains("is");
		System.out.println("contains-->"+value);
		
		boolean value1=str.contains("ssssssss");
		System.out.println("contains-->"+value1);
		
		String s1="java";
		String s2="java";
		String s3="Java";

		
		System.out.println("Equals-->"+s1.equals(s2));
		System.out.println("Equals-->"+s1.equals(s3));
		
		System.out.println("Equals ignore case-->"+s1.equalsIgnoreCase(s3));
		
		System.out.println("Length-->"+s1.length());
		
		System.out.println("======================");
		
		System.out.println("The value of str is : "+ str);
		String str7=str.substring(5, 10);
		System.out.println("Sub string for str 7 -->"+str7);
		
		String str8=str.substring(5);
		System.out.println("Sub string-->"+str8);
		
		String str10="";
		boolean value2=str.isEmpty();
		boolean value3=str10.isEmpty(); 
		System.out.println("Is Empty-->"+value2);
		System.out.println("Is Empty-->"+value3);


		
		



		
		
	}

}
