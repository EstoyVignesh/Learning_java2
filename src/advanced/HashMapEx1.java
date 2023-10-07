package advanced;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//!st
		HashMap<Object,Object> hs = new HashMap<Object,Object>();
		//2nd
		HashMap hs1 = new HashMap(100);
		//3rd
		HashMap<String, Integer> hs2 = new HashMap<String,Integer>();
		//4th
		HashMap hs3 = new HashMap(100,(float).90);
		
		hs.put(1, 100);
		hs.put(2, "java");
		hs.put(3, false);
		hs.put(4, "Python");
		hs.put(1, 201);
		
		System.out.println("The Entries of hs is : "+hs);
		
		hs.remove(1);
		System.out.println("The Entries of hs is : "+hs);
		
		System.out.println("The Entries of hs is : "+hs.get(2));
		
		System.out.println("The Entries of hs is : "+hs.isEmpty());
		
		System.out.println("The Entries of hs1 is : "+hs1.isEmpty());
		
		System.out.println("======================= : ");
		
		hs1.putAll(hs);
		System.out.println("The Entries of hs1 is : "+hs1);
		
		System.out.println("The Entries of hs is : "+hs.containsKey(1));
		System.out.println("The Entries of hs is : "+hs.containsKey(5));
		
		System.out.println("The Entries of hs is : "+hs.containsValue("java"));
		System.out.println("The Entries of hs is : "+hs.containsValue(100));
		
		System.out.println("========================= : ");
		
		System.out.println("The Entries of hs is : "+hs.size());
		
		System.out.println("The Entries of hs is : "+hs.entrySet());
		
		System.out.println("The Entries of hs is : "+hs.values());
		
		hs1.clear();
		System.out.println("The Entries of hs1 is : "+hs1);
		
		hs1 =(HashMap) hs.clone();
		System.out.println("The Entries cloned hs1 is : "+hs1);
		
		System.out.println("================= : ");
		
		//Iterator
		
		Set t = hs.entrySet();
		Iterator s = t.iterator();
				
		while(s.hasNext());
		{
			System.out.println(s.next());
			
		}
		
	/*	for(Map.Entry<Object,Object> et :hs.entrySet()) {
			System.out.println();
		}*/
		
		
			
		
		
	}

}
