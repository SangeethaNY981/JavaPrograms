package lambdaExpression;
import java.util.Scanner;

//@FunctionalInterface
interface Demo1 {
	public int add(int n, int m);
}

public class LambdaExample {

	public static void main(String[] args) {

		       Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the value of n: ");
		        int n = scanner.nextInt();

		        System.out.print("Enter the value of m: ");
		        int m = scanner.nextInt();

		        Demo1 ob = (nVal, mVal) -> {
		            return nVal + mVal;
		        };

		        int result = ob.add(n, m);
		        System.out.println("The sum of " + n + " and " + m + " is: " + result);
		    }
		}

	


