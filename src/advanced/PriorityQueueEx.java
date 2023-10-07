package advanced;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq= new PriorityQueue();
		PriorityQueue pq1= new PriorityQueue();

		//to add an element (add, offer)
		//add() will throw an exception, if we are not able to add an element or any error while adding to a priority queue
		//offer() will thrown a null value, if we are not able to add an element or any error while adding to a priority queue
		
		pq.add(10);
		pq.add(2);
		pq.add(20);
		pq.add(10);
		pq.offer(100);
		
		System.out.println("The value are -->"+pq);
		
		
		//To fetch an element from a priority queque, there are 2 methods
		//element() --> will fetch the head element (exception would be thrown, if this fetch operation fails)
		//peek()--> will fetch the head element (null value will be returned, if this fetch operation fails)
		
		System.out.println(pq.element());
		System.out.println(pq.peek());

		
		//System.out.println(pq1.element());
		System.out.println(pq1.peek());
		
		//To remove an element
		//remove() -->to return and remove the head element (exception will be thrown, if this operation fails)
		//poll() -->to return and remove the head element(null value will be returned, if this operation fails)
		
		//System.out.println("remove-->"+pq.remove());
		//System.out.println("new Pq-->"+pq);
		
		System.out.println("poll-->"+pq.poll());
		System.out.println("new Pq-->"+pq);
		
		//System.out.println("remove-->"+pq1.remove());
		System.out.println("poll-->"+pq1.poll());



	}

}
