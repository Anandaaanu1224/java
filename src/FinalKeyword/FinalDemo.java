package FinalKeyword;

public class FinalDemo {
	int var1;
	final int var2 =40;

	public void finalclass() {
		System.out.println("add num is" + (var1 + var2));
	}
	
	public static void main(String[] args) {
		FinalDemo f = new FinalDemo();
		f.finalclass();
		f.var1=25;
		f.finalclass();
	}
}
