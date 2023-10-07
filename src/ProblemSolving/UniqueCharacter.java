package ProblemSolving;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		
		String unique ="";
		
Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {  // 0<5
		
		char ch =	str.charAt(i);
		
		
		if(str.indexOf(ch)==str.lastIndexOf(ch)) {
			unique += ch;
		
			
		}       
	}
		
		System.out.println(unique);
		
	}
}