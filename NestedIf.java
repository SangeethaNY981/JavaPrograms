package BasicIfPrograms;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the total purchase amount: $");
		        double purchaseAmount = scanner.nextDouble();
		        System.out.print("Are you a member (yes/no): ");
		        String isMember = scanner.next();

		        if (purchaseAmount >= 50) {
		            if (isMember.equals("yes")) {
		                System.out.println("You are eligible for a 10% discount.");
		            } else {
		                System.out.println("You are eligible for a 5% discount.");
		            }
		        } else {
		            System.out.println("Sorry, you are not eligible for any discount.");
		        }
		    
		}

	}


