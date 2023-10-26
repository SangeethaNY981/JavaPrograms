package exception;
//encapsulation =datahiding + abstraction
class Bank {
	static String branchname;
	private String name;
	private String Accountno;
	private String Bankname;
	private String ifsc;
	private double balance;
	

	public void branch() {
		System.out.println("banglore branch");
	}
	//constructor
	
class MyBank extends Exception{
	public MyBank(String message) {
		super(message);
	}
}

public Bank(String name, String accountno, String bankname, String ifsc, double balance) {
		super();
		this.name = name;
		this.Accountno = accountno;
		this.Bankname = bankname;
		this.ifsc = ifsc;
		this.balance = balance;
	}

//getter and setter
public String getname() {
	return name;
}

public String getAccountno() {
	return Accountno;
}
public String getBankname() {
	return Bankname;
}
public String getifsc() {
	return ifsc;
}
public double getbalance() {
	return balance;
}

public void setname(String name) {
	this.name=name;

}
public void setAccountno(String Accountno) {
	this.Accountno=Accountno;

}
public void setBankname(String Bankname) {
	this.Bankname=Bankname;

}
public void setifsc(String ifsc) {
	this.ifsc=ifsc;

}
public void setbalance(double balance) {
	this.balance=balance;
}

//user methods

public double deposit(double deposit) {
	return balance += deposit;
}

public double withdraw(double amount) {
	try {
	if(balance>amount) {
		System.out.println("withdraw amount is :" +amount+"$");
	}
	else {
		 throw new MyBank("No Sufficient balance");
	}
	}catch(Exception e) {
		System.out.println(e);
	}

	return balance -=amount;
}
}


public class DemoExceptionBanking {

	public static void main(String[] args) {
		Bank ob=new Bank("Sangeetha","SBI000123","SBI","SBI5467",5000);
		ob.branch();
		System.out.println("Customer Name : "+ob.getname());
		System.out.println("Account no :" +ob.getAccountno());
		System.out.println("Bank Name : "+ob.getBankname());
		System.out.println("Bank IFSC number is "+ ob.getifsc());
		System.out.println("Initial Balance :" +ob.getbalance());
		System.out.println("Balance After deposit :" +ob.deposit(6000));
		ob.withdraw(2000);
		System.out.println("Balance After withdrawal :" +ob.getbalance());
		

	}

}
