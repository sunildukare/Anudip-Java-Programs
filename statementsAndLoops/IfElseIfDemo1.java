package statementsAndLoops;

import java.util.Scanner;

public class IfElseIfDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers to find the greatest:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is greatest.");
		}
		else if (num2>num3) {
			System.out.println(num2+" is greatest.");
		} else {
			System.out.println(num3+" is greatest.");
		}
	}
}
