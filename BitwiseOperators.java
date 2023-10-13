package Operators;

public class BitwiseOperators {

	public static void main(String[] args) {

		int a = 4;
		int b = 5;
		int c = a|b;
		System.out.println("OR A |B");
		System.out.println(c);
		int d = a&b;
		System.out.println("AND A & B");
		System.out.println(d);
		int e = a^b;
		 System.out.println("XOR  A^B");
		 System.out.println(e);
		int f = ~b;
        System.out.println("Negotion  of B");
        System.out.println(f);
	}

}
