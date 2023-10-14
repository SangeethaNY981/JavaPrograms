package BasicIfPrograms;

import java.util.Scanner;

public class IfEslePgms {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age =sc.nextInt();
		if (age>18) {
			System.out.println("Eligible for Voting");
			
		}
		else {
			System.out.println("Not Eligible for Voting");
		}
	}

}
