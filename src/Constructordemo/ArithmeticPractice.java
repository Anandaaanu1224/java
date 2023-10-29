package Constructordemo;

public class ArithmeticPractice extends ParentArithmetic {
	
	int var1;
	int var2;
	
	ArithmeticPractice()
	{
		this(5000,4000);
		var1 = 50;
		var2 = 40;
		System.out.println("This is non parameterized Constructor");
	}
	
	ArithmeticPractice(int a, int b)  // Parameterized consructor
	{
		this(8000,1.1);
		
		// constructor Chaining
		System.out.println("2 int para Addition is : " +(a+b));
	}
	
	ArithmeticPractice(double a, double b)  // Parameterized consructor
	{
		super(45,55);  // Invoking parent class constructor
		System.out.println("Two Double Addition is "+ (a+b));
	}
	
	ArithmeticPractice(int a, double b)  // Parameterized consructor
	{
		this(1.1,2.4); 
		System.out.println("One Int One Double : Addition is "+ (a+b));
		
	}
	
	public void addNumbers()
	{
		System.out.println("Addition is "+ (var1+var2));
	}

	public static void main(String[] args) {
		
		ArithmeticPractice a = new ArithmeticPractice();
		a.addNumbers();
		}
}
