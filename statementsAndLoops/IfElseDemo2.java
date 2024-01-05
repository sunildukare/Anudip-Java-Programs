package statementsAndLoops;

import java.util.Scanner;

public class IfElseDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is even or odd:");
		int num = scan.nextInt();
		if (num%2==0) {
			System.out.println("Given number is even.");
		}
		else {
			System.out.println("Given number is odd.");
		}
	}
	
}
