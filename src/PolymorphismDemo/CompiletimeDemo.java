package PolymorphismDemo;

public class CompiletimeDemo {
	
		public void addnumber()
		{
			System.out.println("NO para:addition is" + (2+1));
		}
		public void addnumber(int a, int b)
		{
			System.out.println("Two int para:addition is" + (a+b));
		}
		public void addnumber(double a, double b)
		{
			System.out.println("Two double para:addition is" + (a+b));
		}
		public void addnumber(int a, double b)
		{
			System.out.println("One int and one double para:addition is" + (a+b));
		}
		public void addnumber(double a, int b)
		{
			System.out.println("one double one int para:addition is" + (a+b));
		}
		public void addnumber(String a, String b)
		{
			System.out.println("Two String para:addition is" + (a+b));
		}
		public static void main(String[] args)
		{
			CompiletimeDemo a = new CompiletimeDemo();
		    a.addnumber();
		    a.addnumber(" anand", " aanu");
		    a.addnumber(4, 5.1);
		    a.addnumber(4, 5);
		    a.addnumber(6.1, 7);
		    a.addnumber(1,1);
		   
		}
	}


