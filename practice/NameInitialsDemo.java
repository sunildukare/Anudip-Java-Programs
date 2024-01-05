package practice;

import java.util.Scanner;
/*
 * 11) Take the full name of the user, Example Sachin Tendulkar,
 * write a program to print only the initials meaning S. T.
 */
public class NameInitialsDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		
		//Method1
		String nameArr[] = name.split(" ");
		for (String s: nameArr) {
			System.out.print(s.charAt(0)+". ");
		}
		System.out.println();
		
		//Method2
		System.out.print(name.charAt(0)+". ");
		for (int i=1;i<name.length();i++) {
			if (name.charAt(i-1)==' ') {
				System.out.print(name.charAt(i)+". ");
			}
		}
	}
}
