package Examples;

import java.util.HashSet;

public class duplcateRemove {
	//boolean flag= false;
	
public static void main(String[] args) {
	String s[] = {"java ", "c#", "python", "Java","c#"};

HashSet <String> h= new HashSet<>();

for (String s1 : s) {
	//System.out.println(h.add(s1));
	if(h.add(s1)) {
		System.out.println("duplicate " + s1);
	}
}

}

}
