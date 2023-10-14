package BasicPrograms;

import java.util.Scanner;

public class NewScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc =new  Scanner(System.in);
		System.out.println("Enter the length");
		int l =sc.nextInt();
		System.out.println("Enter the Breadth");
		int b =sc.nextInt();
		double area =l*b;  //area of rect
		System.out.println("area of rect is"+area);
		
        System.out.println("Enter the height");
        float h =sc.nextFloat();
        System.out.println("Enter the breadth");
        float br =sc.nextFloat();
        double Area =0.5*h*br;
        System.out.println("area of triangle is"+Area);
        
	}

}
