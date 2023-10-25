package com.edu2;

class case3{
	public void show(int a) {
		System.out.println("one arg method");
	}
	public void show(int...i) {
		System.out.println("any number of argument");
	}
}
public class OverLoadingCaseStudy2 {

	public static void main(String[] args) {
	case3 ob=new case3();
	ob.show(10);
	ob.show(20,30,40,50,60,1,2,7,8,9);

	}

}
