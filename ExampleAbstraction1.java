package abstractprograms;

abstract class Friut{
	abstract void Taste();
}

 
	class Mango extends Friut{

		@Override
		void Taste() {
		System.out.println("Mango is Sweet");
			
		}
		
	}
   
public class ExampleAbstraction1 {

	public static void main(String[] args) {
		Mango ob=new Mango();
		ob.Taste();

	}

}
