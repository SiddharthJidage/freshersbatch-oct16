package Assignment8;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda4 {

	    public static void main(String args[]) throws CloneNotSupportedException {
	        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("Apple","Banana","Grapes","IceCream","coconut"));
	        for (int i = 0; i <=numbers.size()-1; i++) {
	            int a = numbers.get(i).length();
	            if (a % 2 !=0) {
	            	//removing the words which are having odd length
	                numbers.remove(i);
	                
	            }
	        }
	       //printing  words which are having even length
	        System.out.println(numbers); 
	    }
	}


