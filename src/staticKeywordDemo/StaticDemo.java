package staticKeywordDemo;

public class StaticDemo {

	static   //Static block
	{
		System.out.println("Hi i am Static Block");
	}
	public static void staticMethod()  //Static Method
	{
		System.out.println("Hi i am Static Method");
	}
	public void instanceMethod()
	{
		System.out.println("Hi i am Instance Method");
	}
	
	public static void main(String[] args) {
		
		StaticDemo s = new StaticDemo();
		s.instanceMethod();
		s.staticMethod();
		StaticDemo.staticMethod();  // Static method should be called by using classname itself not by using object.
	}

}
