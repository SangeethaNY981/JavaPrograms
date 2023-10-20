package encapsulation;

class Person {
	  private String Name;
	private int Age;
public Person(String Name,int Age) {
	this.Name=Name;
	this.Age = Age;
}

public String getName() {
	return Name;
}
 

public  int getAge() {
	return Age;
}

public void setName(String Name) {
	this.Name =Name;
}

public void setAge(int Age) {
	 this.Age =Age;
}

}
public class ExampleEncapsule1 {
	

	public static void main(String[] args) {
		Person ob =new Person("Sangeetha",22);
		System.out.println("Name of the person :"+ob.getName());
		System.out.println("Age is:"+ob.getAge());

	}

}
