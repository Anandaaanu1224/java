package ArrayDemo;


public class StringArray {

	String arr[]= {"this","is","my","game"};
	
	
	
	public void printArray() 
	{
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i] + " ");
			
			
		}
		System.out.println(arr.length);
		for(int i=arr.length-1;i>=0; i--) {
			System.out.println(arr[i]+ " ");
		}
		
		
		}
	void ScannerClass() {
		
	}
	public static void main(String[] args) {
		
	StringArray s=new StringArray();
	s.printArray();
	
}
}
