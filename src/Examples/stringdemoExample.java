package Examples;



import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.ldap.SortKey;
//anagram string
public class stringdemoExample {

	 String s = "silent";
    String s1 ="listen";
	public void string() {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);
		System.out.println(Arrays.equals(c, c1));
		System.out.println(c.equals(c1));
		System.out.println(c);
		System.out.println(c1); 
		if(Arrays.equals(c, c1)) {
			System.out.println("anagram string");
			
		}else {
			System.out.println("not anagram");
		}

}
	
 public static <E> void main(String[] args) {
	stringdemoExample sd= new stringdemoExample();
	
sd.string();


	
	
	
	
}
}
