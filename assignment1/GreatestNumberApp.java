package assignment3;
/*
 * 3) Write a program to take three numbers from user. 
 * Check which number is the greatest of the three.
 * 8) Write a program to find the max of three numbers.
 */
import java.util.Scanner;

public class GreatestNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int res = findGreatestNumber(num1,num2,num3);
		System.out.println("Greatest of the 3 numbers is: "+res);
	}
	public static int findGreatestNumber(int n1, int n2, int n3) {
		if ((n1>n2) && (n1>n3)) {
			return n1;
		}
		else if(n2>n3){
			return n2;
		}
		return n3;
	}
}
