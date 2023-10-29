package Examples;

public class PalindromeNumbersimp {

	public static void main(String[] arg) {
		int num =1234;
		int rev =0;
		while(num!=0) {
			 rev = rev*10 + num%10;
			 num = num/10;
		}
		System.out.println(rev);
		
		//using wrapping int to string and using string builder to revers
		
		String v = String.valueOf(num);
		System.out.println(v);
		StringBuilder sb = new StringBuilder(v);
		StringBuilder r = sb.reverse();
		System.out.println(r);
		
		String s= "nun";
		String sr="";
		String os =s;
		char[] c = s.toCharArray();
		int len = c.length;
		for(int i=len-1;i>=0;i--) {
			sr=sr+c[i];
			//System.out.println(sr);
		}System.out.println(sr);
		
	}
}
