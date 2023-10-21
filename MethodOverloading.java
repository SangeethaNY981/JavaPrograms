package polymorphism;

class Demo2{
	public void add() {
		System.out.println("1st method");
	}
	public void add(int a) {
		System.out.println("2nd method :"+(a+a));
	}
	public void add(int a,int b) {
		System.out.println("3rd method :"+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("4th method :"+(a+b));
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
	Demo2 ob=new Demo2();
	ob.add();
	ob.add(10);
    ob.add(10, 20);
    ob.add(40,60.5f);
    ob.add('c');
	}

}
