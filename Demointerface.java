package interfaces;

interface bmw{
	 abstract void features();
}
interface suzuki{
	abstract void  Display();
	
}
class Model implements bmw,suzuki{

	@Override
	public void Display() {
		System.out.println("Car Model is good");
		
	}

	@Override
	public void features() {
		System.out.println("Car has 6 Airbags");
		
	}
	
}
public class Demointerface {

	public static void main(String[] args) {
		Model ob =new Model();
		ob.Display();
		ob.features();	

	}

}
