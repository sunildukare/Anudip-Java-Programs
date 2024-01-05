package assignment2;

import java.util.Scanner;

public class PercentageCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your total marks out of 500");
		int marks = scan.nextInt();
		double percentage = percentageCalc(marks);
		System.out.println(percentage);
	}
	public static double percentageCalc(int marks) {
		return (marks*100/500.0);
	}
}
