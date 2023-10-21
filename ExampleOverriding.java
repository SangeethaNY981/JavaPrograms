package overriding;

class ParentA{
	public void properties() {
		System.out.println("gold+money+land");
	}
	public void marry() {
		System.out.println("parents likes subbalakshmi | subbamma ");
	}
}

class ChildA extends ParentA{
	public void marry() {
		System.out.println("child likes Sneha | Katrina | Dhanya | Kareena ");
	}
}
public class ExampleOverriding {

	public static void main(String[] args) {
		ParentA ob =new ParentA();
		ob.properties();
		ob.marry();
//
        ChildA ob1 =new ChildA();
		ob1.properties();
		ob1.marry();
//		
		ParentA ob2 =new ChildA();
		ob2.properties();
		ob2.marry();
//		
//		ChildA ob3 =new ParentA(); // cannot convert  from parentA to ChildA 
//		ob3.properties();
//		ob3.marry();
	}

}
