package advanced;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue pp = new PriorityQueue();
		
		pp.add(51);
		pp.add(42);
		pp.add(85);
		pp.add(12);
		pp.add(3);
		
		System.out.println(pp);
		
		System.out.println(pp.element());
		System.out.println(pp.peek());
		
		//System.out.println(pp1.element());
		//System.out.println(pp1.peek());
	}

}
