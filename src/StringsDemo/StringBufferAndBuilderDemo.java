package StringsDemo;




public class StringBufferAndBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String	s="Ananda aanu";
	String s1="ananda aanu 1224";
	//System.out.printf(s1, s);
	//using validate to variable

StringBuffer sr =new StringBuffer(s);
	System.out.println(sr.append(false));
	int c = sr.capacity();
	System.out.println(c);
	
	StringBuffer a = sr.append(12);
	System.out.println("***"+a+"*****");
	
	int cd = sr.capacity();
	System.out.println(cd);
	StringBuffer insert = sr.insert(6, "s");
	System.out.println(insert);
	  CharSequence su = sr.subSequence(0, 12);
	  System.out.println( sr.delete(12, 20));
	  StringBuffer r = sr.reverse();
	  System.out.println(r);
	  
	  
	 	}

}
