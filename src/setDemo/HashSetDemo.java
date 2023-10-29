package setDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	
	public static void main(String[] args) {
		HashSet<Object> h = new  HashSet<Object>();
		h.add(23);
		h.add(null);
		h.add(34);
		h.add(23);
		h.add("Aanu");
		h.add("ananda");
		h.add(null);
		h.add("Aanu");
		System.out.println(h);
		
		Object a[] = h.toArray();
		System.out.println("using normal for loop");

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);	
		}
System.out.println("Using enhanced for loop");
		
		for (Object k : a) {
			System.out.println(k);
			}
		System.out.println("using a lambda expression");
		
		h.forEach(k->System.out.println(k));
		
		System.out.println("using oa iterator");
		
		Iterator<Object> i =h.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
	}
}
