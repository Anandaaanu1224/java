package setDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;



public class Examples {
String s ="Ananda";
public void stringDemo() {
	char c[] = s.toCharArray();
	//Arrays.sort(c);
	//System.out.println(c);
	HashSet<Object> h = new HashSet<>();
	for(int i=0;i<s.length();i++) {
		// h.add(i);
		System.out.println(s.charAt(i));
		h.add(s.charAt(i));
	}
//	for (Object o : c) {
//		h.add(o);
//		System.out.println(o);
//	}
	System.out.println(h);
	
}
public void setDemo() {

	TreeSet<Object> h = new TreeSet<>();
	for(int i=0;i<s.length();i++) {
		// h.add(i);
		System.out.println(s.charAt(i));
		h.add(s.charAt(i));
	}
	System.out.println(h);
	Iterator<Object> i = h.descendingIterator();
	System.out.println(i);
	  NavigableSet<Object> d = h.descendingSet();
System.out.println(d);
System.out.println(h.ceiling(' '));
System.out.println(h.first());
System.out.println(h.floor('e'));
System.out.println(h.higher('a'));
System.out.println(h.last());
System.out.println(h.lower('a'));
System.out.println(h);
System.out.println(h.pollFirst());
System.out.println(h);
System.out.println(h.pollLast());
System.out.println(h);
System.out.println(h.retainAll(d));
//System.out.println(h.spliterator());

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examples a =new Examples();
//
a.stringDemo();
a.setDemo();




}

}