package collections_problems;

import java.util.ArrayList;

public class ArrayList_colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		
		ar.add("Blue");
		ar.add("Green");
		ar.add("Black");
		ar.add("Brown");
		
		System.out.println(ar);
		
		for(Object a : ar) {
			
			System.out.println(a);
		}
		
	}

}
