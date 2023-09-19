package basics;

public class StringBufferEx {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the default size of Stringbuffer and Stringbuilders is 16 characters
		
		//First way of creating Stringbuffer
		StringBuffer sb= new StringBuffer();
		sb.append("Hello");
		sb.append("world");
		System.out.println("String buffer-->"+sb);
		
		//Second way of creating 
		StringBuffer sb1= new StringBuffer("Hello");
		sb1.append("world 2");
		System.out.println("String buffer 2-->"+sb1);
		
		//Third way. It will create a StringBuffer object to store 20 characters
		StringBuffer sb2= new StringBuffer(20);
		sb2.append("java");
		sb2.append("selenium");
		System.out.println("String buffer 3-->"+sb2);
		
		//Other StringBuffer methods
	
		sb2.insert(1, "hello");
		System.out.println("Insert at 1-->"+sb2);
		
		//start index is inclusive but end index is exclusive (endindex-1)
		sb2.delete(1, 6);
		System.out.println("delete from 1 to 5-->"+sb2);
		
		//start index is inclusive but end index is exclusive (endindex-1)
		sb2.replace(0, 4, "python");
		System.out.println("After replacing-->"+sb2);
		
		//reverse
		//System.out.println("Reversing a string-->"+sb2.reverse());
		
		//fetch the character from a specified index
		char ch=sb2.charAt(1);
		System.out.println("Character -->"+ch);
		
		System.out.println(sb2.length());
		
		System.out.println(sb2.substring(0, 6));
		
		System.out.println(sb2.substring(6));
		
		StringBuffer sb3= new StringBuffer();
		System.out.println("Default Capacity-->"+sb3.capacity());
		sb3.append("Hello");
		System.out.println("Capacity after adding Hello-->"+sb3.capacity());
		sb3.append("java is my favourite language");
		System.out.println("Capacity after appending more than 16-->"+sb3.capacity()); //new capacity=34
		
		//formula to calculate
		/*
		new capacity=old capacity*2 +2 =16*2+2=34
		
		*/
		

		 
		
	}

	

}
