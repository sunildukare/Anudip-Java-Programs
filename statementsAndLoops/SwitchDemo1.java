package statementsAndLoops;

import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		/*
		 * switch statement is used when We know that a variable is going to have many
		 * possible values and We want to give different output for different values.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any color present in rainbow...");
		String color=scan.nextLine();
		
		switch(color.toLowerCase()) {
		case "violet":
			System.out.println("Known as a royal color.");
			break;
		case "indigo":
			System.out.println("Ashok chakra is of indigo color.");
			break;
		case "blue":
			System.out.println("Clear sky is usually blue in color.");
			break;
		case "green":
			System.out.println("Nature and trees are of green color.");
			break;
		case "yellow":
			System.out.println("Sunflower has a beautiful yellow color.");
			break;
		case "orange":
			System.out.println("The fruit orange is orange in color too.");
			break;
		case "red":
			System.out.println("We stop at red signal.");
			break;
		default: System.out.println("Please give valid color present in rainbow");
		}
	}
}
