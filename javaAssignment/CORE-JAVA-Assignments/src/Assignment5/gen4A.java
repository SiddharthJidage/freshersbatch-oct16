package Assignment5;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class gen4A {


	    public static void main(String[] args)
	        {
	            // initialize a HashMap for STRING AS KEY and STRING AS VALUE
	            HashMap<String, String> myObj = new HashMap<>();

	            // Add elements using put method
	            myObj.put("Steve","CSE");
	            myObj.put("Tony","CSE");
	            myObj.put("Natasha","EEE");
	            myObj.put("Bruce","BIO");
	            myObj.put("Bucky","CIVIL");

	         



	            // Iterate the map using
	            // for-each loop
	            for (Map.Entry<String, String> e :myObj.entrySet())
	                System.out.println("Key: as NAME: " + e.getKey()+" || "
	                        + " Value: as STREAM: " + e.getValue());
	        }
	    }


