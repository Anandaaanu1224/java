package ArrayDemo;

import java.lang.reflect.Array;

import java.util.Arrays;

public class Arraysort {
	int arr[]= {3,5,4,6,7};
	public void printArray() 
		{	
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);	
		}
	
		
		}
	public static void main(String[] args) {
		Arraysort a = new Arraysort();
		a.printArray();
	}
}
