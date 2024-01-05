package fundamentals;

import java.util.Scanner;

public class ParametersDemo2 {
	public String details(String name, String email) {
		return ("Name: "+name+"\nEmail: "+email);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = scan.nextLine();
		
		System.out.println("Enter the email address:");
		String email = scan.next();
		ParametersDemo2 pd2 = new ParametersDemo2();
		System.out.println(pd2.details(name, email));
	}
}
 