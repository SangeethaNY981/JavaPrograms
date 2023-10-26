package exception;

public class TryExceptionExample1 {

	public static void main(String[] args) {
		try {
			int []numbers = {1,2,3,4,5,6};
			System.out.println(numbers[20]);
          }
		catch(Exception a) {
			a.printStackTrace();   //to get path
			System.out.println(a);
		}
		System.out.println("finally Exception can be handled");
		}

}
