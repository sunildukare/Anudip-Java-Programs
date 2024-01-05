package StringPrograms;

import java.util.Scanner;

/*
 * Take user input of name, city and graduation.ccfvfcfc
 * Write a program where at the end s should have all details added in the blanks.
 */
public class Exercise5 {
	public static void main(String[] args) {
		String s="Hi my name is _. I am from _. I have done graduation in _.";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("Where are you from?");
		String city = scan.nextLine();
		System.out.println("In which stream have you done your graduation?");
		String graduation = scan.nextLine();
		s = s.replaceFirst("_",name);
		s = s.replaceFirst("_",city);
		s = s.replaceFirst("_", graduation);
		System.out.println("Your generated introduction -\n"+s);
	}
}
