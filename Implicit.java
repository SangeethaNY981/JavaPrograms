package TypeCasting;

public class Implicit {

	public static void main(String[] args) {
		
		byte a =123;
		int e = a;
		System.out.println(e);
		
		int b=123;
		byte c =(byte) b;
		
		int num =1232330890;
		double d =num;
		
		double d1 =2175.67;
		int i =(int)d1;
		System.out.println("Double to int"+i);
		
		String num1= "45";
		int f=Integer.parseInt(num1);
		System.out.println(num1);
	}

}
