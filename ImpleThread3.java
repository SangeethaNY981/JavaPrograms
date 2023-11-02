package threadConcept;

import java.util.Scanner;

class Palindrome extends Thread {
	public void run() {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the Number");	
//    int num=sc.nextInt();
	 int num=12321;
    int temp=num;
    int rev=0, rem; 
    while(temp!=0) {
	rem = temp%10;  //1
	rev =rev *10 + rem;  //0*10+1=1
	temp=temp/10;  //to get rem 121/10 =12
//    System.out.println(rev);
	}
   System.out.println(rev);
   if(rev==num) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
   }
}
	

class primeno extends Thread{
	public void  run() {
		 int num=10;
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
public class ImpleThread3 {

	public static void main(String[] args) {
		
		Palindrome ob= new Palindrome();
		primeno ob1=new primeno();
		ob.start();
		ob1.start();

	}

}
