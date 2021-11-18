package Assignment2;

/* There are 2 ways to stop or prevent inheritance in Java programming.
 * By using final keyword with a class or by using a private constructor
 *  in a class.
 * 
 * */
public final class Singletone 
{

	public static void main(String[] args)
	{
		
		ABC Obj1 = ABC.getInstance();

	}

}

// Steps to create a Singletone class.
class ABC
{
	
	// Step 1: create a static of the class 
	static ABC obj = new ABC();
	
	// Step 2: Don't allow user to create Instance using default constructor. 
	// by the default the constructor is Public so we need to create private
	// constructor to restrict user from further using it .
	
	private ABC()
	{
		

	}
	 
	// step 3: create a method which should be static which will return a 
	// instance of ABC class
	public static ABC getInstance() 
	{
		return obj;
		
	}

	
}

public class A extends Singletone{
	
} 


