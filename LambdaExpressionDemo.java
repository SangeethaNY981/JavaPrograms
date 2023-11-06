package lambdaExpression;

@FunctionalInterface 
interface Demo2{
	public int square(int n);
//	static void display() {
//		
//	}
//	default void display2() {
//		
//	}

}
//class Main1 implements Demo1{
//	@Override
//	public int square(int n) {
//		return n*n;	
//	}
//}
public class LambdaExpressionDemo {
	public static void main(String[] args) {
//		Demo2 m = () -> System.out.println(a*a);
//		Main1 m = new Main1();
		Demo2 m = (n) -> {return n*n;};
		m.square(2);
		System.out.println("Square of ther number is "+m.square(2));
	}
}