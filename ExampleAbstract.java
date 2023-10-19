package abstractprograms;

   abstract class A{
	 abstract void display();
}
  
   class B extends A {

	@Override
	void display() {
		System.out.println("Abstract  method  implementation from  child class");
		
	}
	   
   }
public class ExampleAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob =new B();
		ob.display();

	}

}
