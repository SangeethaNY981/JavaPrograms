package SelectionStatement;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the letter grade :");
		char grade = sc.next().charAt(0);
		switch(grade) {
		case 'A':{
			     System.out.println("Your grade is Excellent");
			     break;
		         }
		case 'B':{
			     System.out.println("Your grade is Good");
			     break;
		        }
		case 'C':{
			   System.out.println("Your grade is Average");
			   break;
		       }
		case 'D':{
			    System.out.println("Your grade is Below Average");
			    break;
		       }
		case 'P':{
			   System.out.println("Your grade is just pass");
			   break;
		       }
		case 'F':{
			      System.out.println("Your grade is fail");
			      break;
			      }
		default : System.out.println("Invalid grade");
		} 

	}

}
