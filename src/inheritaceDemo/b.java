package inheritaceDemo;

public class b extends A{
	public void d()  {
		System.out.println("d in b class");
	}
	public void c() {
		System.out.println("c in  b class");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A n= new b();
 n.c();
 n.d();
 ;
	}

}
