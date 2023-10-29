package StringsDemo;

public class convertdataTypes {

	public static void main(String[] args) {
		int i =100;
		String s= "200";
		
		int p = Integer.parseInt(s);
System.out.println(i+p);
 String si = String.valueOf(i);
 System.out.println(s+si);
 String v = String.valueOf(s+ '0');
	System.out.println(v);
	}
}
