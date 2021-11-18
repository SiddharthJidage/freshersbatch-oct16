package Assignment1;

import java.util.*;

public class ArmstrongNum1 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter any Number :");
		
		Scanner sc = new Scanner(System.in);
		
		int SC =sc.nextInt();
		int NUM, remainder, result = 0;
        
        NUM = SC;
        while (NUM != 0)
        {
            remainder = NUM % 10;
            result = result+(remainder*remainder*remainder);
            NUM /= 10;
        }   
        if(result == SC)
            System.out.println(SC + " is an Armstrong number.");
        else
            System.out.println(SC + " is not an Armstrong number.");
    }

}