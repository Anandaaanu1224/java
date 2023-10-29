package encapualationdemo;

public class Bank {
	
	private int num =123; 
	private String s ="aanu";
	public void deposit() {
		System.out.println("8888");
	}
	private void interestRate() {
		System.out.println("8%");
	}
	protected void loanVerfication() {
		System.out.println("verify the loan");
		
	}
	void depend(){
		System.out.println("may i help u ");
	}
	public int getNum() {
	return num;
	
	} 
	public void setNum(int num) {
		this.num= num;
	}
	public String getName() {
		String name=s;
		return name;
	}
	
	
	
}
