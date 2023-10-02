package advanced;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arl = new ArrayList();
		
		arl.add("Lola");
		arl.add(101);
		arl.add(12.01);
		arl.add(false);
		arl.add(null);
		
		System.out.println("The Values for Collection arl is : "+arl);
		
		arl.add(2, "Flanery");
		
		System.out.println("The Values for Collection arl is : "+arl); 
		
		List arl1 = new ArrayList();
		arl1.addAll(arl);
		
		System.out.println("The Values for Collection arl is : "+arl1);
		
		arl1.remove(5);
		arl1.remove(false); // Can't delete int value - throws indexoutofBounds Exception
		System.out.println("The Values for Collection arl is : "+arl1);
		
		
	}

}
