package listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l = new ArrayList<Object>();
		
		l.add(1);
		l.add('a');
		l.add(0.3);
		l.add(null);
		l.add("aanu");
		l.add("zero");
		l.add(1);
		System.out.println(l);
		List<Object> l1 = new ArrayList<Object>();
		
		
		l1.addAll(l);
		System.out.println(l1);
		
		ArrayList<Object> l2 = (ArrayList<Object>) ((ArrayList) l).clone();
		System.out.println(l2);
		
		l.removeAll(l);
		System.out.println(l);
		System.out.println(l.isEmpty());
		System.out.println("using the iteration");
		
		Object a[] = l1.toArray();
		 
		for(int i=0;i<a.length;i++) {
			System.out.println(i);
		}
		System.out.println("Using enhanced for loop");
		
		for (Object k : a) {
			System.out.println(k);
			}
		System.out.println("using a lambda expression");
		
		l1.forEach(k->System.out.println(k));
		
		System.out.println("using oa iterator");
		
		Iterator<Object> i =l1.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
		
	}

}
