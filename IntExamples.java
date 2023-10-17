package com.edu1;

public class IntExamples {

	public int addition (int a,int b) {
		int sum =a+b;
		System.out.println("addition of two numbers is "+sum);
		return sum;
	}
	
	public int subtraction (int a,int b) {
		int sub =a-b;
		System.out.println("Subtraction of two numbers is "+sub);
		return sub;
	}
	
	public int Multiplication (int a,int b) {
		int mul =a*b;
		System.out.println("multiplication of two numbers is"+mul);
		return mul;
		
	}
	
	public int Division (int a,int b) {
		int div =a/b;
		System.out.println("division of two numbers is "+div);
		return div;
	}
	
	public static void main(String[] args) {
		VoidExamples ob =new VoidExamples();
		ob.addition(10,30);  //Int Type
		ob.subtraction(40,20);
		ob.Multiplication(15,23);
		ob.Division(1025, 25);

	}

		

}
