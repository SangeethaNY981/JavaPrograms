package exception;

import java.util.Scanner;

class MyException extends Exception{
	public  MyException(String message) {
		super(message);
	}
}
public class UserDefineExceptionExamp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age =sc.nextInt();
	//	int age = 16;
		try {
		if(age>=18) {
			System.out.println("eligible for voting");
		}
		else {
			 throw new MyException("Not eligible for voting");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
