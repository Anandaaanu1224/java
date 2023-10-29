package Constructordemo;

abstract class ParentArithmetic {
	int var1;
	int var2;
	 ParentArithmetic(){
		 System.out.println("this is parent class ");
	 }
	 ParentArithmetic(int a, int b){
		 
		 var1=a;
		 var2=b;
				 
		 System.out.println("this is parent class " + (a+b));
	 }
}
