package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class employee{
	private String name;
	private double salary; 
	private  String work;
	
	
	public employee(String name, double salary, String work) {
		super();
		this.name = name;
		this.salary = salary;
		this.work = work;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + ", work=" + work + "]";
	}


	public static Object stream() {
		
		return null;
	}


	public Object compareTo(employee i1) {
		// TODO Auto-generated method stub
		return null;
	}	
	
	}

public class EmployeeExample {

	public static void main(String[] args) {
		ArrayList <employee> E=new ArrayList<employee>();
		 E.add(new employee("Bob",30000,"Software Engineer"));
		 E.add(new employee("Alice",44000,"Manager"));
	     E.add(new employee("Jhoni",23000,"Teacher"));
		System.out.println( E);
		
		long count =E.stream().count();
		System.out.println(count);
		
		List<employee> salary =  E.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(salary);
//		List<Integer> salary=  employee.stream().map((i) -> i*2).collect(Collectors.toList());
//	
//		System.out.println(salary);

	}

}
