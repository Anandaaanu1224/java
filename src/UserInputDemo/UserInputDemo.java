package UserInputDemo;

import java.util.Scanner;

public class UserInputDemo {
	int var1;
	int var2;
	String var3;
	public void userInput(){
		Scanner s = new Scanner(System.in);
		var1=s.nextInt();
		var2=s.nextInt();
		
		System.out.println("us Addnum is" +(var1 + var2));
	}
	public void addnum() {
		Scanner s = new Scanner(System.in);
		var1 =Integer.parseInt(s.nextLine());//type conversion
			var2 =Integer.parseInt(s.nextLine());
		System.out.println("Addnum is" +(var1 + var2));
	}
public void delimiter() {
	Scanner s = new Scanner(System.in);
	var3 = s.nextLine();
	System.out.println(s.delimiter());
}
public void findAll() {
	Scanner s = new Scanner(System.in);
	var3=s.next();
	while(s.hasNext()){
		System.out.println(var3);
	}
}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInputDemo u = new UserInputDemo();
//		u.userInput();
//		u.addnum();
//		u.delimiter();
		u.findAll();
		
	}

}
