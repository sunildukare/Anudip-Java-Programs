package statementsAndLoops;

import java.util.Scanner;

public class SwitchCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		System.out.println("Enter the operation to be performed (+ - * /)");
		char op = scan.next().charAt(0);
		switch (op) {
		case '+': 
			System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
			break;
		case '-': 
			System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
			break;
		case '*': 
			System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
			break;
		case '/': 
			System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
			break;
		}
	}
}
