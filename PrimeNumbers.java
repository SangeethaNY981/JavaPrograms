package basicProgramsExamples;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num =sc.nextInt();
	//  int num=10;
	  int factors=0;
	  for(int i=1;i<=num;i++) {
		  if(num%i==0) {
			  factors++;
			  System.out.println(factors);
			  
		  }
	  }
		  if(factors==2) {
			  System.out.println("prime");
		  }
		  else {
			  System.out.println("not prime");
		  }
	  

	}

}
