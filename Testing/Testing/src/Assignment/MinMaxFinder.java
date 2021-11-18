package Assignment;


import java.util.Arrays;


public class MinMaxFinder {
	   public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   
	   }
	   public static void main(String args[]) {
	      int[] myArray = {56,34,7,3,54,3,34,34,53};
	      MinMaxFinder m = new MinMaxFinder();
	      @SuppressWarnings("unused")
		int[] Array = {m.min(myArray),m.max(myArray)};
	      System.out.println("Maximum value in the array is::"+m.max(myArray));
	      System.out.println("Minimum value in the array is::"+m.min(myArray));
	      System.out.println(Arrays.toString(Array));
	   }
	}


