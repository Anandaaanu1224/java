package ArrayDemo;

public class PalindromeNumber {
	int n =232 ;
	
	void validatePalindrome() {
		int t =n;
		int r=0;
	while(n>0) {
		int d = n%10;
		r= r*10+d;
		n=n/10;		
	}
	if(t==r) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}
	}
	void verifypalindrome() {
int r=0;
int sum=n;
while(n!=0) {
	
	r=r*10+n%10;
	n=n/10;
	if(sum==r) {
		System.out.println("palindrome "+ r);
	}else {
		System.out.println("not palindrome"+ r);
	}
	
}
	}
	public static void main(String[] args) {
		PalindromeNumber p =new PalindromeNumber();
		//p.validatePalindrome();
		p.verifypalindrome();
	}
}
