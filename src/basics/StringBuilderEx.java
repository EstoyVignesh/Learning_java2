package basics;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//First way of creating StringBuilder
		StringBuilder sb= new StringBuilder();
		sb.append("Bonjour ");
		sb.append("isekai");
		System.out.println("String Builder Value is "+sb);
		
		//Second way of creating 
		StringBuilder sb1= new StringBuilder("Hello ");
		sb1.append("isekai 2");
		System.out.println("String Builder Value is "+sb1);
		
		//Third way. It will create a StringBuilder object to store 20 characters
		StringBuilder sb2= new StringBuilder(20);
		sb2.append("What? ");
		sb2.append("selenium");
		System.out.println("String Builder Value is "+sb2);
		
		//Other StringBuilder methods
	
		sb2.insert(1, "hello");
		System.out.println("Insert at 1 Value is "+sb2);
		
		//start index is inclusive but end index is exclusive (endindex-1)
		sb2.delete(1, 8);
		System.out.println("delete from 1 to 5 Value is "+sb2);
		
		//start index is inclusive but end index is exclusive (endindex-1)
		sb2.replace(0, 4, "No one knows ");
		System.out.println("After replacing, Value is "+sb2);
		
		//reverse
		//System.out.println("Reversing a string, Value is "+sb2.reverse());
		
		//fetch the character from a specified index
		char ch=sb2.charAt(2);
		System.out.println("Character  Value is "+ch);
		
		System.out.println(sb2.length());
		
		System.out.println(sb2.substring(0, 6));
		
		System.out.println(sb2.substring(6));
		
		StringBuilder sb3= new StringBuilder();
		System.out.println("Default Capacity is "+sb3.capacity());
		sb3.append("Hello");
		System.out.println("Capacity after adding Hello is "+sb3.capacity());
		sb3.append("java is my favourite language");
		System.out.println("Capacity after appending more than 16, Value is "+sb3.capacity()); //new capacity=34
		
	
			
	
	
	
	
	
	
	
	
	
	
	
	}

}
