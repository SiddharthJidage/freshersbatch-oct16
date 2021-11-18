package Assignment1;

import java.util.Arrays;
import java.util.Scanner;
 
class elementfinder {
 
	
    public static void check(int[] arr, int toCheckvalue)
    {
        // sort given array
        Arrays.sort(arr);
 
        // check if the specified element
        // is present in the array or not
        // using Binary Search method
        int res = Arrays.binarySearch(arr, toCheckvalue);
 
        boolean test = res > 0 ? true : false;
 
        // Print the result
        System.out.println("Is " + toCheckvalue
                           + " present in the array: " + test);
    }
 
    public static void main(String[] args)
    {
    	
    	int toCheckvalue;
 
        // Get the array
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
 
        // Get the value to be checked
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find :");
		toCheckvalue =sc.nextInt();
 
        // Print the array
        System.out.println("Array: "
                           + Arrays.toString(arr));
 
        // Check if this value is
        // present in the array or not
        check(arr, toCheckvalue);
    }
}
