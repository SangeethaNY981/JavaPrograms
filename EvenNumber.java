package WhileCondition;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the  Number");
		int i =sc.nextInt();

		while(i%2==0) {
			System.out.println("even"+i);
			i++;
		}
  System.out.println("odd"+i);
	}

}
