package encapualationdemo;

public class Customer {
//int num;
//	public  int CustomerAccess() {
//		System.out.println(num);
//		 return num;
//	}
	
	public static void main(String[] args) {
		Bank manager = new Bank();
		manager.setNum(234);
		System.out.println(manager.getNum());
		System.out.println(manager.getName());
	}
}
