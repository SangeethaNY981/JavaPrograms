package com.edu1;

public class AccessModifiersDemo {

	public static void display() {
		
		System.out.println("Static method ");
	}
	public void display1() {
		System.out.println("Public method");
	}
	public int addition(int a,int b) {
		int sum=a+b;
		System.out.println("addition of two numbers is "+sum);
		return sum;
	}
	
	public static void main(String[]args) {
		AccessModifiersDemo ob =new AccessModifiersDemo();
		ob.display1();
		display();  //static method  
		ob.addition(10,30);    //passing values to parameters
		

	}

}
