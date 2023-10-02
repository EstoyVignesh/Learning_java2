package advanced;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//heterogenous data
		HashMap<Object,Object> hm = new HashMap<Object,Object>();
		
		//homogenous key and value pair
		HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
		
		//creating hashmap with memory
		HashMap hm2= new HashMap(100);
		
		//Mentioning the memory and the load factor
		HashMap hm3= new HashMap(100,(float).90);
		
		//Hashmap doesn't maintain order
		
		hm.put(1, "java");
		hm.put(2, "selenium");
		hm.put(3, "selenium");
		hm.put(1, "python");
		hm.put(null, 20);
		
		System.out.println("Default HashMap-->"+hm);
		
		//hm.remove(3); //3 is key here
		System.out.println("remove-->"+hm);
		
		System.out.println("get-->"+hm.get(2));
		
		System.out.println("Is empty-->"+hm.isEmpty());
		System.out.println("Is empty-->"+hm1.isEmpty());
		
		System.out.println("contains key-->"+hm.containsKey(1));
		System.out.println("contains key-->"+hm1.containsKey(100));
		
		System.out.println("contains value-->"+hm.containsValue("python"));
		System.out.println("contains value-->"+hm1.containsValue("c"));
		
		System.out.println("Size-->"+hm.size());
		
		//Keys are returned in set format because both Set and keys are unique
		System.out.println("Keys-->"+hm.keySet());
		
		System.out.println("values-->"+hm.values());
		
		System.out.println("entryset-->"+hm.entrySet());
		
		hm2.putAll(hm);
		System.out.println("Hm2-->"+hm2);
		
		hm2.clear();
		System.out.println("Hm2 after clear-->"+hm2);
		
		hm2= (HashMap) hm.clone();
		System.out.println("Hm2 after clone-->"+hm2);
		
		
		//Iterator
		Set s= hm.entrySet();
		Iterator itr= s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("==============");
		
		//foreach loop
		//for(datatype varaible:collection)
		for(Map.Entry<Object,Object> eachEntry: hm.entrySet())
		{
			// 1 entry--> 1k, 1 v
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
		
		

		


		


		
		

	}

}
