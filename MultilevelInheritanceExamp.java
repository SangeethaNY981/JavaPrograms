package inheritance;

class Nokia {
	public void properties() {
		System.out.println("Parent Properties");
	}
	
}

class Android extends Nokia {
	public void Details() {
		System.out.println(" Child details with parent Properties");
	}
	
}

class  Oneplus extends Android {
	public void Features() {
		System.out.println(" Extended  Battery");
	}
}

public class MultilevelInheritanceExamp {

	public static void main(String[] args) {
		Oneplus ob =new Oneplus();
		ob.properties();
		ob.Details();
		ob.Features();

		

	}

}
