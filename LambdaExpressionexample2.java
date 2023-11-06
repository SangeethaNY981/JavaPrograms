package lambdaExpression;

import java.util.Scanner;

//@FunctionalInterface
interface Sub {
	public int sum(int a, int b);
}
public class LambdaExpressionexample2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b = sc.nextInt();
		Sub s = (aNum, bNum)-> a-b;
//		s.sum(a, b);bb
		System.out.println(s.sum(a, b));

	}

}

