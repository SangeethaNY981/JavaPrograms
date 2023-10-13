package Operators;

public class Unary {
//post  in opr_-- assign value first
	public static void main(String[] args) {
		int x= 10;
		int y=x++;
		System.out.println("x=10");
		System.out.println(y);
		System.out.println(x);
		
		int a= 10;
		int b=++a;
		System.out.println("a=10");
		System.out.println(b);
		System.out.println(a);
		
		int c=10;
		int d=--c;
		System.out.println("c=10");
		System.out.println(d);
		System.out.println(c);
		
		int e=10;
		int f=e--;
		System.out.println("e=10");
		System.out.println(f);
		System.out.println(e);


	}

}
