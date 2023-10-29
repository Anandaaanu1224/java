package ArrayDemo;

public class jaggedArray {
	int arr[][]= {{23,24,25},
			{33,34,35,36,37},{45,46,47,38}};
	public void printTwoArray() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}		
			System.out.println();
		}
		System.out.println("enhanced for loop ");
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jaggedArray j = new jaggedArray();
		j.printTwoArray();

	}

}
