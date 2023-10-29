package utilDemo;

import java.util.Date;

public class DateDemo {
public static void main(String[]args) {
		Date time= new Date();
System.out.println("Current date => " + time);
		
		System.out.println("Date => " + time.getTime() + " milliseconds");
		
		System.out.println("after() => " + time.after(time) + " milliseconds");
		
		System.out.println("before() => " + time.before(time) + " milliseconds");
		
		System.out.println("hashCode() => " + time.hashCode());
		System.out.println();
    
}
}
