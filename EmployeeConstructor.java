package constructor;

public class EmployeeConstructor {

	String name; //null
	int roolNo; //0
	int age;
	int salary;
	String department;
	String Email;
	long phoneNo;
	String Address;
	String State;
	
	public EmployeeConstructor(String name, int roolNo, int age, int salary, String department, String Email,
			long phoneNo, String address, String state) {
		super();
		this.name = name;
		this.roolNo = roolNo;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.Email = Email;
		this.phoneNo = phoneNo;
		this.Address = address;
		this.State = state;
	}

	
	EmployeeConstructor(){
		super();
		System.out.println("no-arg constructor");
		
	}
	
	public static void main(String[] args) {
		
		EmployeeConstructor ob =new  EmployeeConstructor("Sathya",1087,26,320000,"SALES","sathya@gmail.com",314252268,"Yelahanka","Karnataka");
		System.out.println(ob.name);
		System.out.println(ob.roolNo);
		System.out.println(ob.age);
		System.out.println(ob.salary);
		System.out.println(ob.department);
		System.out.println(ob.Email);
		System.out.println(ob.phoneNo);
		System.out.println(ob.Address);
		System.out.println(ob.State);
		
		
		EmployeeConstructor ob1 =new  EmployeeConstructor("Sangeetha",1887,25,400000,"IT Sector","sangeetha@gmail.com",1233456678,"vijayanagar","karnataka");
		System.out.println(ob1.name);
		System.out.println(ob1.roolNo);
		System.out.println(ob1.age);
		System.out.println(ob1.salary);
		System.out.println(ob1.department);
		System.out.println(ob1.Email);
		System.out.println(ob1.phoneNo);
		System.out.println(ob1.Address);
		System.out.println(ob1.State);
		
		EmployeeConstructor ob2 =new  EmployeeConstructor("Sandeep",100,30,500000,"Marketing","sandeep@gmail.com",1234557361,"Habbal","karnataka");
		System.out.println(ob2.name);
		System.out.println(ob2.roolNo);
		System.out.println(ob2.age);
		System.out.println(ob2.salary);
		System.out.println(ob2.department);
		System.out.println(ob2.Email);
		System.out.println(ob2.phoneNo);
		System.out.println(ob2.Address);
		System.out.println(ob2.State);
	

	}
	
}
