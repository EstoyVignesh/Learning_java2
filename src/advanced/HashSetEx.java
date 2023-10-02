package advanced;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way
		HashSet hs = new HashSet();
		
		//second way --> homogenous
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		//Third way -- mentioning the memory
		HashSet hs2 = new HashSet(100);
		
		//fourth --> mentioning the memory and the fill ratio
		HashSet hs3= new HashSet(100,(float)0.90);
		
		hs.add("java");
		hs.add(102);
		hs.add("python");
		hs.add(102);
		hs.add("selenium");
		hs.add(true);

		
		System.out.println("Default hashset-->"+hs);
		
		hs.remove("python");
		System.out.println("removed -->"+hs);
		
		System.out.println(hs1.isEmpty());
		
		System.out.println(hs.contains("java"));
		
		hs1.addAll(hs);
		System.out.println("Hs1 hashset-->"+hs1);
		
		//hs1.removeAll(hs);
		System.out.println("Hs1 hashset after removeAll-->"+hs1);
		
		
		hs.retainAll(hs1);
		System.out.println("Hs1 hashset after retain-->"+hs);
		
		//iterate over a Hashset
		for(Object data:hs)
		{
			System.out.println(data);
		}
		
		//Iterator
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		




		

	}

}
