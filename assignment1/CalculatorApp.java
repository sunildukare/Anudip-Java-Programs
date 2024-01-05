package assignment3;

import java.util.Scanner;
//4) Write a program to create a calculator using switch statement.
public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Enter the operation to perform (+,-,*,/,%)");
		char operator = scan.next().charAt(0);
		CalculatorApp ca = new CalculatorApp();
		ca.calculate(num1, num2, operator);
	}
	
	public void calculate(int n1, int n2, int op) {
		switch (op) {
		case '+': System.out.println("Addition is: "+(n1+n2));
				  break;
		case '-': System.out.println("Subtraction is: "+(n1-n2));
				  break;
		case '*': System.out.println("Multiplication is: "+(n1*n2));
				  break;
		case '/': System.out.println("Division is: "+(n1/n2));
				  break;
		case '%': System.out.println("Remainded is: "+(n1%n2));
				  break;
		default: System.out.println("Wrong input");
		}
	}
}
