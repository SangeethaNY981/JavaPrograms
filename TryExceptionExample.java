package exception;

public class TryExceptionExample {

	public static void main(String[] args) {
		
		try {
		System.out.println("1");
		System.out.println("2");
        System.out.println("3");
        System.out.println(100/0);
        System.out.println("4");
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();   // to get the path we should the e.
			
		}
		System.out.println("exception can be handled here");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
	}

}
