package com.edu2;

class Case1{
	public void show(Object o) {
		System.out.println("Parent Class");
	}
	public void show(String s) {
		System.out.println("Child Class");
	}
	
}



public class OverloadingCaseStudy1 {

	public static void main(String[] args) {
		Case1 ob=new Case1();
		ob.show(new Object());  //root class
		ob.show(null);    
		ob.show("ruchika");   //sub class
		
	
		

	}

}
