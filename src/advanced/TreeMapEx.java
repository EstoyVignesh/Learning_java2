package advanced;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//only for homogenou key, value pair
		//no null key concept
		
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		
		tm.put(110, "java");
		tm.put(102, "python");
		tm.put(103, "selenium");
		//tm.put(null, "20");
		tm.put(101, null);
		
		System.out.println("default treemap-->"+tm);

	}

}
