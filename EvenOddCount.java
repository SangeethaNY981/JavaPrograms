package basicProgramsExamples;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num= sc.nextInt();
		// int num=2234;
//		if(num%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
		
		int even_count=0;
		int odd_count=0;
		
		while(num!=0) {
			int rem=num/10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num =num/10;
			
		}
		System.out.println("EvenCount : "+even_count);
		System.out.println("OddCount : "+odd_count);
	}

}
