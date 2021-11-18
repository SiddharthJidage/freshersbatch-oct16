package Assignment1;

import java.util.*;
public class SimpleInterest_CompoundInterest {

	public static void main(String[] args) {
		double pr, rate, time, si,ci;
	    Scanner sc = new Scanner (System. in);
		System.out.println("Enter the amount:");
		pr=sc.nextDouble();
		System. out. println("Enter the No.of years:");
		time=sc.nextDouble();
		System. out. println("Enter the Rate of  interest");
		rate=sc.nextDouble();
		
	    si=(pr * time * rate)/100;
	    ci=pr * Math.pow(1+rate/100,time) - pr;
	    System.out.println("Simple Interest="+si);
	    System.out. println("Compound Interest="+ci);
	}

}

