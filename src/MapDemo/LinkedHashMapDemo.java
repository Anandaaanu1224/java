package MapDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
//		LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();  
//		LinkedHashMap<Integer,Character> m1=new LinkedHashMap<Integer,Character>();
		LinkedHashMap<Object,Object> m=new LinkedHashMap<Object,Object>();
		
		m.put("Maths", 23);
		m.put("Tamil", null);
		m.put("Chemistry",64 );
		m.put("Tamil", 43);
		//m.put(null,null);
		m.put("Science",null);
		m.put("English", 45);
		m.put("Social", 55);
		//m.put(null,24);
		
		System.out.println(m);
		System.out.println("-----------------");
		
		TreeMap<Object,Object> t= new TreeMap<Object,Object>();
		//t.putAll(m);
		//System.out.println(t);
	t.put("Maths", 23);
		t.put("Tamil", null);
		t.put("Chemistry",64 );
		t.put("Tamil", 23);
		//m.put(null,null);
		t.put("Science",null);
		t.put("English", 45);
		t.put("Social", 55);
		//m.put(null,24);
		System.out.println(t);
		
	}
  
  
}
