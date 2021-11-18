package Assignment6;

import java.util.*;

public class Collection2 {

	    public static void main(String args[]){
	        //Creating and adding elements to tree-set
	        TreeSet<Integer> val=new TreeSet<Integer>();
	        val.add(15);
	        val.add(26);
	        val.add(35);
	        val.add(45);
	        val.add(56);
	        val.add(86);
	        val.add(97);
	        val.add(81);
	        val.add(96);
	        val.add(150);
	        //adding duplicate value to set but it will not store null values ,it simply rejects duplicate at run time
	        val.add(96);

	        System.out.println(val);// here we can see tree-set sort the data automatically.

	        System.out.println("Reverse Set: "+ val.descendingSet());
	    }
	}


