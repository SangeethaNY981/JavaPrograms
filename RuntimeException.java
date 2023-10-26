package exception;

public class RuntimeException {

	public static void main(String[] args) {
	     try {
			int a= 5 / 0;
			System.out.println("This will not reached"); //Arithmetic Exception
	     }
	     catch(Exception e) {
	    	 e.printStackTrace();
	     }
	     System.out.println("Arithmetic Exception can be Handled");
			try 
			{
			int a1[]=new int[5];
			a1[6] =5; // ArrayIndexOutOf BoundsException
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("ArrayIndexOutOfBounds can be Handled");
			
			try 
			{
			String str ="hello";
			int num =Integer.parseInt(str); //NumberFormatException
			}
			catch(Exception e2) 
			{
				e2.printStackTrace();
			}
			System.out.println("Number Format Exception can be handled");
			try
			{
			String s =null;
			System.out.println(s.length());  //NullPointerException
			}
			catch(Exception e3) 
			{
				e3.printStackTrace();
			}
			System.out.println("NullPointer Exception can be handled");


	}

}
