package assignment3;

import java.util.Scanner;
//5) Check if a given number is an armstrong number.
class Strong{
	int findDigit(int num) {
		int digits = 0;
		while(num!=0) {
			digits++;
			num = num/10;
		}
		return digits;
	}
	int armstrongResult(int num, int digits) {
		int res = 0;
		while (num!=0) {
			int last_digit = num%10;
			int product = 1;
			for (int i=1;i<=digits;i++) {
				product = last_digit*product;
			}
			num = num/10;
			res = res+product;
		}
		return res;
	}
}
public class ArmstrongNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Armstrong number or not:");
		int num = scan.nextInt();
		Strong strong = new Strong();
		int digits = strong.findDigit(num);
		int res = strong.armstrongResult(num,digits);
		if (num == res) {
			System.out.println(num+" is an Armstrong number.");
		}
		else {
			System.out.println(num+" is not an Armstrong number.");
		}
	}
}
