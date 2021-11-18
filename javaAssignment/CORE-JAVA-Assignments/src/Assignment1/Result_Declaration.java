package Assignment1;

import java.util.*;

public class Result_Declaration {

	public static void main(String[] args) {
		
		int sub1,sub2,sub3;
		
		
		Scanner sc = new Scanner (System. in);
		System.out.println("Enter the marks of sub1:");
		sub1=sc.nextInt();
		
		Scanner sc1 = new Scanner (System. in);
		System.out.println("Enter the marks of sub2:");
		sub2=sc1.nextInt();
		
		Scanner sc2 = new Scanner (System. in);
		System.out.println("Enter the marks of sub3:");
		sub3=sc2.nextInt();
		
		if ( sub1 > 60 && sub2 > 60 && sub3 > 60) {
			System.out.println("Passed..!");
		} else if ((sub1 <60 && sub2 <60)|| (sub2 <60 && sub3 < 60) ||(sub1 <60 && sub3 <60) ) {
			System.out.println("fail!!");
			
		} else {
			System.out.println("Premoted..!");
			
		}
			
		
	}

}
