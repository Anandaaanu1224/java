package UserInputDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BufferDemo {
int var1;
int var2;
public void addNum()throws Exception {
	InputStreamReader i= new InputStreamReader(System.in);
	BufferedReader b = new BufferedReader(i);
	var1 = Integer.parseInt(b.readLine());
	var2 = Integer.parseInt(b.readLine());
	System.out.println("add num is" + (var1 +var2));
	
}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferDemo a= new BufferDemo();
		a.addNum();

	}

}
