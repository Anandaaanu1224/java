package ArrayDemo;

public class Arraydemo {
	
int arry[] =new int[5];

public void printArray() 
{
	 arry[0]=1;
	 arry[1]=2;
	 arry[2]=3;
	 arry[3]=4;
	 arry[4]=5;
	 System.out.println("Normal For Loop");
		for(int i=0; i<3; i++)
		{
		System.out.println(arry[i]);
		}
			System.out.println("Array Reversal");
		for(int i=4; i>=0; i--)
		{
		 System.out.println(arry[i]);	
		}
			System.out.println("Enhanced For Loop");
		for(int k : arry)		{
			System.out.println(k);
		}

}
public static void main(String[] args) {
	Arraydemo a = new Arraydemo();
	a.printArray();

}
}
