package Examples;

public class example {
	static int x=1;
	static int y =2;
public static void main(String[] args) {
	System.out.println("beforeswap" +x+" " + y);
	//sing third var Assign operator
/*	int v;
	
	v=x;
	x=y;
	 y=v; */
	
	//using without third var just arithmetic operator
/*	y=(y+x)-y;
	x=x+y; */
	x=x*y;
	y=(x/y);
	
	
	 
	System.out.println("afterswap" +x+" " + y);
	
}
}
