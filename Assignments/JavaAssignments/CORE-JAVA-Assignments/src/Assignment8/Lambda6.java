package Assignment8;
import java.util.ArrayList;

public class Lambda6 {

	    private static ArrayList<String> replace;

		public static void main(String[] args) {
	        replace = new ArrayList<>();
	        replace.add("Steve");
	        replace.add("Tony");
	        replace.add("Stan");
	        replace.add("Peter");
	        replace.add("Bruce");

	      replace.replaceAll((String) ->
	             String.equals(replace) ? String:String.toUpperCase()); 

	        System.out.println(replace); //printing words after changing to upper case
	    }
	}


