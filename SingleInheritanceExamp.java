package inheritance;

class Parents {
	public void properties() {
		System.out.println("Parent Properties");
	}
	
}

class Child1 extends Parents {
	public void Details() {
		System.out.println(" Child details with parent Properties");
	}
	
}
public class SingleInheritanceExamp {

	public static void main(String[] args) {
		
		Child1 ob =new Child1();
		ob.properties();
		ob.Details();

	}

}
