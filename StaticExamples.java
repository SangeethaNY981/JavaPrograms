package com.edu1;

public class StaticExamples {

	
	public static void  addition (int a,int b) {
		int sum =a+b;
		System.out.println("addition of two numbers is "+sum);
		
		
	}
	
	public static void subtraction (int a,int b) {
		int sub =a-b;
		System.out.println("Subtraction of two numbers is "+sub);
		
		
	}
	
	public static  void  Multiplication (int a,int b) {
		int mul =a*b;
		System.out.println("multiplication of two numbers is"+mul);
		
		
		
	}
	
	public static  void Division (int a,int b) {
		int div =a/b;
		System.out.println("division of two numbers is "+div);
		
		
	}
	
	public static void main(String[] args) {
		// VoidExamples ob =new VoidExamples();
		addition(10,30);  //Static  Type
		subtraction(40,20);
		Multiplication(15,23);
		Division(1025, 25);

	}

	
   }
