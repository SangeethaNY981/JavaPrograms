package BasicIfPrograms;

import java.util.Scanner;

public class LogicalConditions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score :");
		int score = sc.nextInt();
		if(score>=90) {
			System.out.println("GRADE - S");
		}
		else if(score<=90 && score>81) {
			System.out.println("GRADE - A");
		}
		else if(score<=80 && score>71) {
			System.out.println("GRADE - B");
		}
		else if(score <=70 && score>56) {
			System.out.println("GRADE - C");
		}
		else if(score <=55&& score>36) {
			System.out.println("GRADE - D");
		}
		else {
			System.out.println("GRADE -F");
		}
	}

}
