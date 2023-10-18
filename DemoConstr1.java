package constructor;

public class DemoConstr1 {

	String name; //null
	int roolNo; //0
		
	DemoConstr1(String name,int roolNo){
		
		this.name=name;
		this.roolNo=roolNo;
		
		
	}
	
	DemoConstr1(){
		super();
		System.out.println("no-arg constructor");
		
	}
	
	public static void main(String[] args) {
		
		DemoConstr1 ob =new  DemoConstr1("Sathya",1087);
		System.out.println(ob.name);
		System.out.println(ob.roolNo);
		
		
		DemoConstr1 ob1 =new  DemoConstr1("Sangeetha",1887);
		System.out.println(ob1.name);
		System.out.println(ob1.roolNo);
		

	}

}
