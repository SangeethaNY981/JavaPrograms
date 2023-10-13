package Operators;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("enter first number ");
     float a=sc.nextFloat();
     System.out.println("enter second number");
     float b=sc.nextFloat();
     System.out.println("enter third number");
     float c=sc.nextFloat();
     float d=a*b*c;
     System.out.println("Addition of three numbers is"+d);

	}

}
