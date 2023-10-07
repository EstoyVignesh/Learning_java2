package collections_problems;

import java.util.LinkedList;

public class InsertElement {

	public static void main(String[] args) {
		
		LinkedList ar = new LinkedList();
		
		ar.add("Blue");
		ar.add("Green");
		ar.add("Black");
		ar.add("Brown");
		
		System.out.println(ar);
		
		ar.addFirst("Gold");
		
		System.out.println(ar);
	}

}
