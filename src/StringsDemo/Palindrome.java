package StringsDemo;

public class Palindrome {
	String s ="nun";
	String rev="";
	String os=s;
	public void ForloopUsingCharAt() {

		int len = s.length();
		for(int i = len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
//		System.out.println(os);
//		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("PALINDROM");
			
		} else {
			System.out.println("np");
		}
			
	}
	public void UsingCharArray() {
		char[] ch = s.toCharArray();
	int l = ch.length;
	for(int i= l-1 ; i>=0; i--) {
		rev =rev+ch[i];
	}System.out.println(rev);
	if(os.equals(rev)) {
		System.out.println("PALINDROM");
		
	} else {
		System.out.println("np");
	}
		
	}
	public void StringBuffer(String str) {
		String sr = str;
		StringBuffer sb= new StringBuffer(sr);
		java.lang.StringBuffer reve = sb.reverse();
		System.out.println(reve);
		System.out.println(sr);
		if(sr.contentEquals(reve)) {
			System.out.println("PALINDROM");
			
		} else {
			System.out.println("np");
		}			
		if(sr.contentEquals(sb.reverse())) {
			System.out.println("PALINDROM");
			
		} else {
			System.out.println("np");
		}			
	}
	public void StringBuilder(String str) {
		String sr= str;
		StringBuilder sb = new StringBuilder(sr);
		java.lang.StringBuilder reve = sb.reverse();
		if(sr.contentEquals(reve)) {
			System.out.println("PALINDROM");
			
		} else {
			System.out.println("np");
		}			
	}
public static void main(String[] args) {
	Palindrome p= new Palindrome();
	//p.ForloopUsingCharAt();
	//p.UsingCharArray();
	p.StringBuffer("mom");
	p.StringBuilder("lol");
	}}
