package Arrays;

public class CloningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a [] = {1,2,3};
//		int b [] = a.clone();      //deep copy
//		for(int i=0;i<b.length;i++) {
//		System.out.println(b[i]);
		
//      	int a [] = {1,2,3};   
//		int b [] = {1,2,3};      //check same memory
//		 
//		System.out.println(a==b);

		int [][]a= {{1,2,3},{4,5,6}};
		int [][]b =a.clone();      // shallow copy
		System.out.println(b[0]==b[1]);
		System.out.println(a[1]==b[1]);
		System.out.println(b[0]==b[0]);
		System.out.println(a[2]==b[2]);
		
	
	}
}
