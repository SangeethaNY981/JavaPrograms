package encapsulation;


public class ExampleEncapsule {
	private double balance;
	
	public double getBalance() {
		return balance;
		
	}
	
	public void setBalance(double balance) {
		this.balance =balance;
		
	}

	public static void main(String[] args) {
		ExampleEncapsule ob=new ExampleEncapsule();
		ob.setBalance(10000);
		System.out.println(ob.getBalance());

	}

}
