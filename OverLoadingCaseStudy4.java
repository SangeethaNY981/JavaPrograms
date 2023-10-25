package com.edu2;

class Case4{
	public void show(int a,float b) {
		System.out.println(" First two arg method");
	}
	public void show(float a,int b) {
		System.out.println("two number argument");
	}
	
}
public class OverLoadingCaseStudy4 {

	public static void main(String[] args) {
		Case4 ob =new Case4();
		ob.show(10,65.50f);
		ob.show(56.8f,20);
		

	}

}
