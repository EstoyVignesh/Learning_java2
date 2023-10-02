package advanced;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way to store heteregenous data
		ArrayList al = new ArrayList();
		
		al.add("Java");
		al.add(100);
		al.add(12.5);
		al.add(true);
		al.add('c');
		al.add(100);    
		al.add("");
		al.add(null);
		System.out.println(al);
		
		//second way -- to create arraylist with homogenous data
		ArrayList<Integer> al1= new ArrayList<Integer>();
		ArrayList<String> al2= new ArrayList<String>();

		al1.add(101);
		
		
		al2.add("null");
		System.out.println(al2);
		
		//Third way
		List al4=new ArrayList();
		
	
		

	}

}
