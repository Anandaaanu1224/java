package operatorPractisce;

public class AdditionDemo {
	int num1;      //variable
	int num2;
	public void addNumbers()   // method - camel Notation
	{
		System.out.println("Addition is "  + (num1 + num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AdditionDemo a= new AdditionDemo();
a.num1 = 20;
a.num2 = 30;
a.addNumbers();

	}

}
