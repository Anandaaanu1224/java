package StringsDemo;

import java.util.Arrays;

public class anagramStringDemo {

	String s= "eat";
	String s1="ate";
	
	public void usingSort() {
		
		char[] c = s.toCharArray();
		System.out.println(c);
		char[] c1 = s1.toCharArray();
		System.out.println(c1);
		Arrays.sort(c);
		Arrays.sort(c1);
		System.out.println(Arrays.equals(c, c1));
		if(Arrays.equals(c, c1)) {
			System.out.println("its an anagram ");
		}else {
			System.out.println("its not anagram");
			
		}
		if(c!=c1) {
			System.out.println(c.hashCode());
			System.out.println(c1.hashCode());
			
			System.out.println("its an anagram ");
		}else {
			System.out.println("its not anagram");
			
		}
		if(c.equals(c1)) {
			// this method also consider as equal hashcode otherwise returns false 
			System.out.println("its an anagram ");
		}else {
			System.out.println("its not anagram");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    anagramStringDemo a= new anagramStringDemo();
    
    a.usingSort();
    
	}

}
