package fundamentals;

import java.util.Scanner;

public class ParametersDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ParametersDemo1 pd = new ParametersDemo1();
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		System.out.println("The total is: "+pd.add(num1, num2));
	}
	public int add(int num1,int num2) {
		return num1+num2;
	}
}
