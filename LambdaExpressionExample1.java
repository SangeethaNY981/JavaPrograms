package lambdaExpression;


@FunctionalInterface
interface Add {
	public int sum(int a, int b);
}
//class child implements Add{
//	@Override
//	public int sum(int a, int b) {
//		return a+b;
//	}
//}

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		Add d = (int a, int b) ->{return a+b;};
//		child ch=new child();
		d.sum(6,8);
		System.out.println(d.sum(6, 8));
	}

}

