package StringsDemo;

public class ReverseString {
	 public static void main(String[] args)
	    {
	        String input = "GeeksForGeeks";
	 
	        // convert String to character array
	        // by using toCharArray
//	        char[] try1 = input.toCharArray();
//	 
//	        for (int i = try1.length - 1; i >= 0; i--)
//	            System.out.print(try1[i]);
	        char[] temparray = input.toCharArray();
	        int left, right = 0;
	        right = temparray.length - 1;
	 
	        for (left = 0; left < right; left++, right--) {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right] = temp;
	        }
	 
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();
	    }
}
