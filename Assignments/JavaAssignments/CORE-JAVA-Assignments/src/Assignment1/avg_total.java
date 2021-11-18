package Assignment1;
import java.util.Scanner;
public class avg_total {
	
	private static Scanner sc;
		public static void main(String[] args) {
			
			int  chemistry, physics, maths; 
		    float total, Percentage, Average;
			sc = new Scanner(System.in);
			
			System.out.print(" Please Enter the 3 Subjects Marks : ");
			chemistry = sc.nextInt();		
			physics = sc.nextInt();	
			maths = sc.nextInt();	
			
			total =  chemistry  + physics + maths;
			Average = total / 3;
		    Percentage = (total / 300) * 100;
		    
		    System.out.println(" Total Marks =  " + total);
		    System.out.println(" Average Marks =  " + Average);
		    System.out.println(" Marks Percentage =  " + Percentage);
		}
	}