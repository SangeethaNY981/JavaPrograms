package basicProgramsExamples;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
while(true) {
		System.out.println("Enter the Number :");
		int num =sc.nextInt();
		for(int k=2;k<=num;k++) {	
	      int factors=0;
	  
	      for(int i=2;i<=k;i++)
	      {
		  if(k%i==0)
		  {
			  factors=1;
//			  System.out.println(factors);
		  
		  }
	  }
		  if(factors==0) {
			  System.out.println(k);
		  }
		  else {
			  System.out.println("not prime");
		  }
	  

	}
}
	}

}
