package com.edubridge1;

import com.edubrigde.AccessModifiersDemo1;

// import com.edubrigde.AccessModifiersDemo1;

public class Main {
  final int a =10 ;
      //  a=10+10;  
	public static void main(String[] args) {
		AccessModifiersDemo1 ob =new AccessModifiersDemo1();
		ob.display();
  //    ob.display1();  //cannot access default method outside the package
  //    ob.display2();  //cannot access private method outside the package
  //    ob.display3();  // cannot access protected method outside the package
		Main ob1=new Main();
		System.out.println(ob1.a);
	}

}
