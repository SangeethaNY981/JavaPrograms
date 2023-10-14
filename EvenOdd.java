package BasicIfPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		if(n%2==0) {
			System.out.println("Even no");
		}
		else {
			System.out.println("Odd no");
		}

	}

}
