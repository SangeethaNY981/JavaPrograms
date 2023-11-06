package lambdaExpression;

import java.util.Scanner;


public class LoginForm {
public static void main(String[] args) {
	
	        String validUsername = "Bob";
	        String validPassword = "Bob@123";

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();

	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();

	        if (username.equals(validUsername) && password.equals(validPassword)) {
	            System.out.println("Login successful. Welcome, " + username + "!");
	        } else {
	            System.out.println("Login failed. Invalid username or password.");
	        }

	        scanner.close();
	    }
	}



