package advanced;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll= new LinkedList();
		ll.add("Java");
		ll.add("Luffy");
		ll.add(4);
		ll.add("Itachi");
		ll.add(false);
		ll.add(5, 201);
		ll.addFirst("python");
		ll.addLast("Yonko");
				
		System.out.println(ll);
		
	    ll.remove("python");
	    		
		System.out.println(ll);
		
		ll.get(4);
		System.out.println(ll);
		
		ll.set(6, "Rimuru");
		System.out.println(ll);
		
		System.out.println(ll.contains("Java"));
		
	    LinkedList lll = new LinkedList();
	    
     	lll.add(null);
		lll.addAll(ll);
		System.out.println(lll);
		
	    lll.removeAll(lll);
		System.out.println(lll);    
		
		
		LinkedList<Integer> lli = new LinkedList<Integer>();
		
		lli.add(101);
		lli.add(102);
		lli.add(103);
		lli.add(104);
		
		lli.getFirst();
		lli.getLast();
		System.out.println(lli);
		
		Collections.sort(lli);
		System.out.println("Sorting lli-->"+lli);
		
		Collections.sort(lli,Collections.reverseOrder());
		System.out.println("reverse order-->"+lli);
		
		Collections.shuffle(lli);
		System.out.println("Shuffle-->"+lli);
				
		
		LinkedList l1 = new LinkedList();
		l1.add("Luffy");
		l1.add(false);
		
		ll.retainAll(l1);
		System.out.println("Retains All of ll in l1-->"+l1);
				
				

		

	}

}
