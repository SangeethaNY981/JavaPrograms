package inheritance;

class Parent {
	public void properties() {
		System.out.println("Parent Properties");
	}
	
}

class Child extends Parent {
	public void Details() {
		System.out.println(" Child details with parent Properties");
	}
	
}
public class ExampleInheritance {

	public static void main(String[] args) {

		Child ob =new Child();
		ob.properties();
		ob.Details();
 // Parent ob1=new Parent();   // we cannot access child class
 // ob1.properties;
	}

}
