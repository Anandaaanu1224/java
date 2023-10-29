package staticKeywordDemo;

public class CollegeDataBase {

	String sname;
	int sno;
	static String cname = "SRM";
	public void printDB(String a, int b)
	{
		sname = a;
		sno = b;
		System.out.println("Student Name is " +sname);
		System.out.println("Student ID is "+sno);
		System.out.println("College Name is "+cname);	
		
	}
	public static void main(String[] args) {
		CollegeDataBase c = new CollegeDataBase();
		c.printDB("Arun", 1001);  //14 byte
		c.printDB("Naveen", 1002); //14 byte
		CollegeDataBase c1 = new CollegeDataBase();
		c1.printDB("Lokesh", 1003); // 14 byte
		CollegeDataBase c2 = new CollegeDataBase();
		c2.printDB("Muthu", 1004); //14 byte
		CollegeDataBase c3 = new CollegeDataBase();
		c3.printDB("Naresh", 1005); // 14 byte
	}

}
