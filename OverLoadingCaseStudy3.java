package com.edu2;

class Case2{
	public void show(String s) {
		System.out.println("String Class");
	}
	public void show(StringBuffer sb) {
		System.out.println("StringBuffer class");
	}
}

public class OverLoadingCaseStudy3 {

	public static void main(String[] args) {
	
		Case2 ob =new Case2();
		ob.show("Sathya");
		ob.show(new StringBuffer());
	//	ob.show(null);

	}

}
