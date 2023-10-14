package com.edu;
	// single line
	/* multi line  */

	// 1 local
	// 2 instance
	// 3 static 
	class Test1{
		static float a;
		int b;
	}
	
	public class VariableValue {
		
	    static int a=10;
		public static void main(String[] args) {
			Test1 ob = new Test1();
			System.out.println(a);
			System.out.println(Test1.a);
			System.out.println(ob.b);

}
}