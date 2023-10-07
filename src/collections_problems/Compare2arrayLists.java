package collections_problems;

import java.util.ArrayList;

public class Compare2arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al1= new ArrayList<String>();
		al1.add("Maruthi");
		al1.add("Mahindra");
		al1.add("Tata");
		al1.add("Hyundai");
		
		ArrayList<String> al2= new ArrayList<String>();
		
		al2.add("Maruthi");
		al2.add("Mahindra");
		al2.add("Tata");
		
		ArrayList<String> al3= new ArrayList<String>();
		
		//tenary operator
		
		//condition? yes: No
		//a=10,b=5
		//a>b ? "greater":"lesser"
		
		for(String c:al1)
		{
			al3.add(al2.contains(c)?"Yes":"No");
		}
		System.out.println("compared arraylist-->"+al3);	
		
	}

}
