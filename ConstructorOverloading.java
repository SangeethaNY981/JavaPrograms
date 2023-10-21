package polymorphism;

class Constructor{
	Constructor(){
		System.out.println("No arg constructor");
	}
	Constructor(int a) {
		System.out.println("one arg constructor");
	}
	Constructor(int b,int a) {
		System.out.println("two arg constructor");
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Constructor ob =new Constructor();
		Constructor ob1=new Constructor(10);
		Constructor ob2 =new Constructor('c',2);

	}

}
