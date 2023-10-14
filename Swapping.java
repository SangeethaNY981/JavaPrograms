package BasicPrograms;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =sc.nextInt();
		System.out.println("Enter the second number");
		int b =sc.nextInt();
		int c =a;
		a =b;
		b =c;
		System.out.println("first number is" +a);
		System.out.println("second number is " +b);
		

	}

}
