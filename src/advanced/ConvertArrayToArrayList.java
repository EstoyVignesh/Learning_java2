package advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,50,100};
		
		ArrayList al = new ArrayList();
		
		
		for (int a :arr)
		{
			al.add(a);
		}
		
		System.out.println(al);
	}

}
