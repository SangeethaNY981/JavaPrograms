package com.edu1;

class Example{
	 public void display() {
		   System.out.println("public method");
	   }
	   
	   protected void display1() {
		   System.out.println("protected");
	   }

	   void display2() {
		   System.out.println("default method");
	   }
	   
	   private void display3() {
		   System.out.println("private method");
	   }
}

public class Demo1 {
	private void display3() {
		   System.out.println("private method");
	   }

	public static void main(String[] args) {
		Demo1 dd=new Demo1();
		Example ex=new Example();
		ex.display();
		ex.display1();
		ex.display2();
		dd.display3();
		

	}

}
