package basicProgramsExamples;

import java.util.Scanner;

public class PalindromeExamp {

	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0,rem;
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
}
