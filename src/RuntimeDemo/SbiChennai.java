package RuntimeDemo;


public class SbiChennai extends SbiHeadOffice{
	public void roi() {
		System.out.println("Sbi chennai rate of interst is 3.5%");
	}
	public void BranchLocation() {
		System.out.println("Sbi chennai locate in mount road");
	}
	public static void main(String[] args) {
		
		SbiHeadOffice b = new SbiChennai(); // upcasting
		b.roi();
		b.Location();
		
		
		SbiChennai s = new SbiChennai();
		s.roi();
		s.Location();
		s.BranchLocation();
		s.roi();
		  
		SbiHeadOffice a = new SbiHeadOffice();
		
		a.roi();
		SbiChennai c= (SbiChennai)b;
		c.roi();
	}

}

