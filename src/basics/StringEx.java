package basics;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First method using Literals
		String strr = "Fearrow";
		
		System.out.println(strr);
		
		//Second using "new" method
		
		String strr1=new String("achu");
		System.out.println(strr1);
		
		
		String str = "Bonjour";
		 str = str.concat(", I am fron South India");
		System.out.println(str);
		
		String str1 = str.toUpperCase();
		System.out.println(str1);
		
		String str2 = str.toLowerCase();
		System.out.println(str2);
		
		System.out.println("The Characer in Str1 is "+str1.charAt(0));
		
		
		
}
}