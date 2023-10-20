package interfaces;

interface Parents2{
	abstract void parents2Method();
}

interface Parents3{
	abstract void parents3Method();	
}
class Child  implements Parents2, Parents3 {

	@Override
	public void parents3Method() {
	System.out.println("Child class extending with parent3");
		
	}

	@Override
	public void parents2Method() {
		System.out.println("Child class extending with parent2");
		
	}
	
}
public class ExampleInterface1 {

	public static void main(String[] args) {
	Child ob =new Child();
	ob.parents2Method();
	ob.parents3Method();
	}

}
