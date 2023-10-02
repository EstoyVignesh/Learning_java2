package advanced;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		
		HashSet hs =new HashSet();
		hs.add(102);
		hs.add("Zoro");
		hs.add(true);
		hs.add("Kurama");
		hs.add(102);
		hs.add(false);
		
		System.out.println("The Values of hs is : "+hs);
		
		hs.remove(false);
		System.out.println("The Values of hs is : "+hs);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.addAll(hs);
		System.out.println("The Values of hs1 is : "+hs1);
		
		HashSet hs2 = new HashSet(100);
		
		hs2.add(102);
		
		hs2.retainAll(hs);
		System.out.println("The Values of hs2 is : "+hs2);
		
		for(Object data:hs) {
			System.out.println("The Values of hs is : "+data);
		}
	}

}
