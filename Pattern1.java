package ForLoopStatement;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NO OF ROWS:");
		 int row = sc.nextInt();
		 for(int i=0; i<= row; i++ )
				{
					 for(int j=0 ; j<=i ; j++)
					 {
						 System.out.print(" ");
					 }
					for (int k=4; k>=i ; k--) 
					{
						System.out.print(" *");
					}
				 System.out.println();	
				}

	}

}
