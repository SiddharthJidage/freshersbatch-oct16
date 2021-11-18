package Assignment4;

public class AritmaticException {

	public static void main(String[] args) {
	        int a = 12;
	        int b = 0;
	        try {
	            System.out.println(a / b); // throw Exception
	        }
	        catch (ArithmeticException e) {
	            // Exception handler
	            System.out.println("Divided by zero operation cannot possible");
	        }
	    }

	}

