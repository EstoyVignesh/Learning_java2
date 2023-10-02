package ProblemSolving;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveLettersfromString {

	public static void main(String[] args) {

		String str = "liril";
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {  // 0<5
			
			set.add(str.charAt(i));  // adding the str characters by reading charAt by reading line by line characters (l,i,r) and Duplicated not added because of LinkedHashSet
					
		
		}
		
		System.out.println(set);
		
	}

}
