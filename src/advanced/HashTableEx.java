package advanced;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Object,Object> ht1= new Hashtable<Object,Object>();
		
		Hashtable<Integer, String> ht2= new Hashtable<Integer,String>();
		
		Hashtable ht3= new Hashtable(100);
		
		Hashtable hs4= new Hashtable(100,(float)0.90);
		
		
		//initial capacity is 11 and fill ratio of 0.75
		
		//no null key is allowed
		
		ht1.put(101, "guvi");
		ht1.put(103, "java");
		ht1.put(105, 2000);
		//ht1.put(null, 200); //null key is not allowed
		
		System.out.println("Default hashtable"+ht1);
		
		ht1.put(106, false);
		ht1.put(102, "PIKACHU");
		System.out.println("Default ht1-->"+ht1);
		
		ht1.remove("PIKACHU");
		System.out.println("Default ht1-->"+ht1);
		
		System.out.println("===============");
		
		
		Set s= ht1.entrySet();
		
		//iterator
		Iterator itr= s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
