package advanced;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way to store heteregenous data
				ArrayList al = new ArrayList();
				ArrayList al1 = new ArrayList();
				
				al.add("Java");
				al.add(100);
				al.add(12.5);
				al.add(true);
				al.add('c');
				al.add(90);
				
				//replace
				al.set(2, 20);
		
				System.out.println("default Arraylist values-->"+al);
				
				al.add(2, "selenium");
				System.out.println("Arraylist values after adding at index 2-->"+al);
				
				al.remove(true);
				System.out.println("remove --"+al);
				
				//removing at index 4
				al.remove(4);
				System.out.println("remove at index 4--"+al);
				
				System.out.println("isEmpty---------");
				
				//to check whether the arralist is empty of not. If empty, it will return true
				System.out.println(al.isEmpty());
				System.out.println(al1.isEmpty());
				
				System.out.println("contains---------");
				
				//to check th presence of an element
				System.out.println(al.contains("Java"));
				System.out.println(al.contains("python"));
				
				
				al1.addAll(al);
				System.out.println("Add all in al1-->"+al1);
				
				al1.removeAll(al);
				System.out.println("remove all in al1-->"+al1);
				
				ArrayList al3 = new ArrayList();
				al3.add("Java");
				al3.add(100);
				
				al.retainAll(al3);
				System.out.println("retain all in al1-->"+al);
				
				ArrayList<Integer> al5 = new ArrayList<Integer>();

				al5.add(100);
				al5.add(90);
				al5.add(200);
				al5.add(20);
				
				Collections.sort(al5);
				System.out.println("sort all in al-->"+al5);
				
				Collections.sort(al5,Collections.reverseOrder());
				System.out.println("reverse sort all in al-->"+al5);

				
				Collections.shuffle(al5);
				System.out.println("shuffle all in al-->"+al5);
				
				//for loop
				for(int i=0; i<al5.size();i++)
				{
					System.out.println(al5.get(i));
				}
				
				System.out.println("================");
				
				//for each
				/*
				 * for(int each:collectiontype)
				 * {
				 * 
				 * }
				 * 
				 */
				for(int eachElement:al5)
				{
					System.out.println(eachElement);
				}
				
				System.out.println("--------------");
				
				//To iterate over an heterogenous data
				
				for(Object data:al)
				{
					System.out.println(data);
				}
				
				
				
				
				
				

				



				
				


				
				
				

	}

}
