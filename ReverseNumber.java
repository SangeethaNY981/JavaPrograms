package basicProgramsExamples;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
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

	}

}
