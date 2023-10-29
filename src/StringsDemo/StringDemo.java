package StringsDemo;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String	s="Ananda aanu";
	String s1="ananda aanu 1224";
	 System.out.println(s.compareTo(s1));
	 
	 System.out.println(s.compareToIgnoreCase(s1));
	 System.out.println(s.equals(s1));
	 System.out.println(s.equalsIgnoreCase(s1));
	 System.out.println(s.charAt(4));
	 System.out.println(s.formatted(s1));
	 System.out.println(String.format(s1, s));
	 System.out.println(s.intern());
	 System.out.println(s1.isBlank());
	 System.out.println(s1.strip());
	 char[] c = s.toCharArray();
	 for (char d : c) {
		 System.out.println(d);
	}
	 String[] s2= s.split(" ");
	 for (String s3 : s2) {
		System.out.println(s3);
	}

System.out.println(s.trim());
System.out.println(s.subSequence(s.indexOf('A'),s.indexOf('a', s.indexOf('a')+1)));
System.out.println(s.subSequence(s.indexOf('A'), s.lastIndexOf('a')-3));
	}

}
