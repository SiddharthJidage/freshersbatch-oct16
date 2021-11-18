package Assignment3;

public class StringMethods {

	public static void main(String[] args) {
		String Msg ="Java String Reffers To Collection Of String Which Are Stored In Heap Memory.";
		System.out.println("Actual string: "+Msg);
		
		String msg= Msg.toLowerCase();
		System.out.println("Lower case >> "+ msg);
		
		String MSG= Msg.toUpperCase();
		System.out.println("Upper case >> "+ MSG);
		
		String replace= msg.replace("a", "$");
		System.out.println("updated string is = "+ replace);
		
		System.out.print("Dose the string contains 'Collectoin' word in it ? "+Msg.contains("Collection"));
		
		
		
		
	    if (Msg==msg) {
	    	
		     System.out.println("  // Strings are equal");
		
		}else {
			System.out.println("// Strings are not equal");
			
		}
	    
	    if (msg.equals(Msg)) {
	    	
		     System.out.println("Strings are equal");
		
		}else {
			System.out.println("Strings are not equal");
		}
		
		
		
	

	}

}
