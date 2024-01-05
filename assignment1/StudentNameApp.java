package assignment2;

import java.util.Scanner;

public class StudentNameApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me your name.");
		String name = scan.nextLine();
		String welcomeMsg = welcome(name);
		System.out.println(welcomeMsg);
	}
	public static String welcome(String name) {
		return "Hello "+name+". Welcome to this java session.";
	}
}
