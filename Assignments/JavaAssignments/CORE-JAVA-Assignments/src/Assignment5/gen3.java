package Assignment5;

import java.util.ArrayList;
import java.util.Collections;

public class gen3 {

	    public static void main(String a[]){
	        ArrayList<String> al = new ArrayList<String>();
	        al.add("Jett");
	        al.add("Brim");
	        al.add("Rayna");
	        al.add("Cypher");
	        al.add("Sage");
	        

	        System.out.println("ArrayList before Swap:");
	        for(String temp: al){
	            System.out.println(temp);
	        }

	        // Swapping elements of array using index
	        Collections.swap(al, 1, 2);

	        System.out.println("ArrayList after swap:");
	        for(String temp: al){
	            System.out.println(temp);
	        }
	    }
	}


