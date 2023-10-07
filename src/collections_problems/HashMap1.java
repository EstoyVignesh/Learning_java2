package collections_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Object,Object> hm = new HashMap<Object,Object>();
		hm.put(2, "Cow");
		hm.put(5, "Rabbit");
		hm.put(1, "Fish");
		hm.put(3, "Dog");
		
		System.out.println(hm);
				
		hm.get(2);
		System.out.println(hm.get(1));

		
		//program to associate the specified value with the specified key in a HashMap.

		for(Map.Entry x:hm.entrySet())
		{  
			System.out.println(x.getKey()+" "+x.getValue());  
		}  
		
		
		//program to count the number of key-value (size) mappings in a map.
		//Size of Key-Value
		  System.out.println("Size of the hash map: "+hm.size());
		
		  
		  //program to copy all mappings from the specified map to another map
		  
		  HashMap<Object,Object> hm1 = new HashMap<Object,Object>();
		  // put all values in secondmap
		  hm1.putAll(hm);
		  System.out.println("\nNow values in second map: " + hm1);
		  
		  
		  // program to remove all mappings from a map
		  hm1.clear();// Removing all the elements
			System.out.println("The New map : " + hm1);
			
			
			hm1.putAll(hm);
			  System.out.println("\nNow values in second map: " + hm1);
			  
			  
			  System.out.println("========================");
			  
			  
			 // program to check whether a map contains key-value mappings (empty) or not.
			 
			// check if map is empty
			  boolean result = hm.isEmpty();
			  // check the result
			  System.out.println("Is hash map empty: " + result);
			  
			  // Removing all the elements from the linked map
			  hm1.clear();
			  // check if map is empty
			  result = hm1.isEmpty();
			  // check the result
			  System.out.println("Is hash map empty: " + result);
			  
			  
			  //program to get a shallow copy of a HashMap instance.
			  //Clonning 
			  HashMap<Integer,String> new_hashmap = new HashMap<Integer,String>();	
				new_hashmap = (HashMap)hm.clone();     
				System.out.println("Cloned HashMap : " + new_hashmap);        
				
				
				// program to test if a map contains a mapping for the specified key
				// Checking for the key_element '20' 
		        System.out.println("Is the key '20' present? "
		                           + hm.containsKey(20)); 
		  
		        // Checking for the key_element '5' 
		        System.out.println("Is the key '5' present? "
		                           + hm.containsKey(5)); 
		        
		        
		        System.out.println("========================");
		        
		        
		        //program to test if a map contains a mapping for the specified Value
		       
		        System.out.println("Is value 'Fish' Exists ?");
				if (hm.containsValue("Fish"))
				{
					System.out.println("Yes! ");
				}
				else
				{
					System.out.println("no!");
				}
		 
				System.out.println("Is value 'tiger' Exists ?");
				if (hm.containsValue("tiger"))
				{
					System.out.println("yes! - " );
				} 
				else
				{
					System.out.println("No!");
				}
				
				
				// program to create a set view of the mappings contained in a map.
				Set set = hm.entrySet();// create set view
				 
				System.out.println("Set values : " + set);// check set values
				
				
				// program to get a set view of the keys contained in this map
				// get value of key 3
				   String val=(String)hm.get(3); 
				   // check the value
				   System.out.println("Value for key 3 is: " + val);
				   
				   
				   // program to get a set view of the keys contained in this map
				// get keyset value from map
				   Set keyset = hm.keySet();
				      
				  // check keyset values
				   System.out.println("Key set values are: " + keyset);  
				   
				   
				   System.out.println("========================");
				   
				   
				   // checking collection view of the map
				   System.out.println("Collection view of values is: "+ hm.values());
	}

}
