package accessModifier;

public class AccessModifierDemo {
	public void accessDemo() {
		
	}
protected void accessDemo(int a , int b) {
	System.out.println(a+b);
	}
private void accessDemo(String a , int b) {
	System.out.println(a+ " "+"is an age" +b);
}




//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//AccessModifierDemo a= new AccessModifierDemo();
//a.accessDemo("Surend", 16);
//a.accessDemo(3, 2);
//	}

}
