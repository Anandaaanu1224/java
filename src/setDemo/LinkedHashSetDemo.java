package setDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Object> h = new LinkedHashSet<Object>();
h.add(23);
h.add(null);
h.add(34);
h.add(23);
h.add("Aanu");
h.add("ananda");
h.add(null);
h.add("Aanu");
h.add(true);
h.add('a');

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
