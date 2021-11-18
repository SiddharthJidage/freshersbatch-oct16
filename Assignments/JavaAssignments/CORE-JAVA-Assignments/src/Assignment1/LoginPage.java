package Assignment1; 

import java.util.*;

public class LoginPage {

	public static void main(String[] args) {
		String ID,id, PASS,pass;
		
	    ID = "1235XYZ";
		PASS= "PASS231";
		
		for(int i = 0 ;i<4; i++) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your ID:");
			id=sc.next();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter your PASS:");
			pass=sc1.next();
			
			if ((PASS.equals(pass))&&(ID.equals(id))) {
				System.out.println("Welcome..!!");	
			}
			
		System.out.println("Please Contact Admin");
		}
		


		
		
		


	}

}
