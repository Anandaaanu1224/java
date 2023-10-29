package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> m = new HashMap<>();
		
		m.put("maths", 23);
		m.put("Tamil", 24);
		m.put("Chemistry",64 );
		m.put("Tamil", 43);
		m.put("Science", 40);
		m.put("English", 45);
		m.put("Social", 55);
		System.out.println(m);
		System.out.println(m.get("Tamil"));
	System.out.println(m.remove("maths"));
	System.out.println(m);
	System.out.println(m.replace("Tamil", 43, 23));
	System.out.println(m);
	System.out.println(m.replace("Science", 41));
	System.out.println(m);
	Set<Object> k = m.keySet();
	System.out.println(k);
	Object a[] = k.toArray();
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
	Collection<Object> v = m.values();
	System.out.println(v);
	Object[]  b= v.toArray();
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
			}
	Set<Entry<Object, Object>> e = m.entrySet();
	System.out.println(e);
	Iterator<Entry<Object, Object>> i = e.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
//	String[] a1 = e.toArray(new String[0]);
//	for (int j = 0; j < a1.length; j++) {
//		System.out.println(a1[j]);	}
	for (Entry<Object, Object> u : e) {
		System.out.println(u.getKey()+ " " +u.getValue());
		
	}
	
	
	
	}

}
