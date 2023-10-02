package advanced;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Object,Object> lhm= new LinkedHashMap<Object,Object>();
		
		lhm.put(101, "java");
		lhm.put(102, "python");
		lhm.put(103, "selenium");
		lhm.put(104, 2000);
		lhm.put(null, "20");
		lhm.put(110, null);
		
		System.out.println("Default lhm-->"+lhm);
		
		lhm.put(101, false);
		System.out.println("Default lhm-->"+lhm);
		
		lhm.remove(104);
		System.out.println("Default lhm-->"+lhm);
		
		System.out.println("Default lhm-->"+lhm.containsKey(104));
		System.out.println("Default lhm-->"+lhm.containsValue(null));
		
		System.out.println("=================");
		
		LinkedHashMap<Object,Object> lhm1= new LinkedHashMap<Object,Object>();
		lhm1.putAll(lhm);
		
		System.out.println("Default lhm1 -->"+lhm1);
		
		lhm1.clear();
		System.out.println("Default lhm1-->"+lhm1);
		
		System.out.println("Default lhm1-->"+lhm1.isEmpty());
		
		System.out.println("Default lhm-->"+lhm.size());
		System.out.println("Default lhm-->"+lhm.entrySet());
		
		System.out.println("Default lhm-->"+lhm.keySet());
		System.out.println("Default lhm-->"+lhm.values());
		
		lhm1 = (LinkedHashMap<Object, Object>) lhm.clone();
		System.out.println("Default lhm1-->"+lhm1);
		
		System.out.println("=============");
		
		
		//Iterator
		
		Set s = lhm.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()){
			System.out.println("Default lhm-->"+it.next());
		}
		
		
		
		
		

		

	}

}
