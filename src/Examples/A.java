package Examples;

public class A {

	
	static int x =10;
	static int y =20 ;
	
	
	public static void main (String[]args) {
		A a = new A();
		System.out.println("beforesawap");
		int	z=x;	
	int	x=y;
		int y=z;
	System.out.println("after"+x+"  " +y);
		
	}
}
