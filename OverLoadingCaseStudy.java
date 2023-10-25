package com.edu2;

class Case{
public void show() {
	System.out.println("No-arg method");
}
public void show(int a) {
	System.out.println("int type method");
}
public void show(float a) {
	System.out.println("Floating type method");
}
}
public class OverLoadingCaseStudy {

	public static void main(String[] args) {
	Case ob=new Case();
	ob.show();
	ob.show(10);
	ob.show('b');
	ob.show(60.05f);

	}

}
