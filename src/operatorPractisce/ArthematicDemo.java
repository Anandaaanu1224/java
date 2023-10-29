package operatorPractisce;

public class ArthematicDemo {
int rad=3;
double side;
	
	public void FindArea() {
		System.out.println("Area of circle is" + (3.14*rad*rad));
	}
	
	public double findArea() {
		return 4* side;
	}
	
	public static void main(String[] args) {
		ArthematicDemo a =new ArthematicDemo();
		
	a.FindArea();	
	a.side =4;
	System.out.println(a.findArea());
	}
}
