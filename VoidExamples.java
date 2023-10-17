package com.edu1;

public class VoidExamples {

	
	public void addition (int a,int b) {
		int sum =a+b;
		System.out.println("addition of two numbers is "+sum);
		
	}
	
	public void subtraction (int a,int b) {
		int sub =a-b;
		System.out.println("Subtraction of two numbers is "+sub);
		
	}
	
	public void  Multiplication (int a,int b) {
		int  mul =a*b;
		System.out.println("multiplication of two numbers is"+mul);
		
		
	}
	
	public void Division (int a,int b ) {
		 int div =a/b;
		System.out.println("division of two numbers is "+div);
		
	}
	
	public static void main(String[] args) {
		VoidExamples ob =new VoidExamples();
		ob.addition(10,30);  // void Type
		ob.subtraction(40,20);
		ob.Multiplication(15,23);
		ob.Division(1025, 25);

	}

}
