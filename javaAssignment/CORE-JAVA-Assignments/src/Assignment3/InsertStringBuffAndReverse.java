package Assignment3;


public class InsertStringBuffAndReverse {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("It is used to  at specific index.");
		System.out.println("string = " + str);
		str=str.insert(14, "insert text");
		System.out.println("updated string ->"+ str);
		System.out.println("=========================================================");
		
	      StringBuilder str0 = new StringBuilder("It is used to  at specific index.");
	      System.out.println("string = " + str0);
	      str0.insert(14, "insert text");
	      System.out.println("updated string = " + str0);
	      
	      System.out.println("=========================================================");
		
        StringBuffer str1 = new StringBuffer("This method reverse the string on whic it was called");
        System.out.println("Actual string = " + str1);
          
        // Here it reverses the string buffer
        str1.reverse();
        System.out.println("Stringbuffer after reversing = " + str1);
        System.out.println("=========================================================");
        
       // Here it reverses the  stringbuilder
        StringBuilder str2
        = new StringBuilder("This method reverse the string on whic it was called");

        System.out.println("String = "
                       + str2.toString());

        // reverse the string
        StringBuilder reverseStr = str2.reverse();

        System.out.println("Reverse Stringbulder = "
                       + reverseStr.toString());

		

	}

}
