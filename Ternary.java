package Operators;

public class Ternary {

	public static void main(String[] args) {
	 int a =100;
	 int b =6800;
	 int c =350;
	 int d =500;
	 int e =780;
	 int max =(a < b && a < c && a<d && a < e) ? a:
		 ( b <a && b < c && b<d && b<e) ? b:
		 (c < a && c < b && c < d && c<e ) ? c :
		 (d < a && d < b && d < c && d<e) ? d: e;
	    
	 System.out.println("smallest of five numbers is "+max);
	}

}
