package statementsAndLoops;

import java.util.Scanner;

public class whileDemo {
	/*
	 * while loops are another type of loop used to execute repetitive task
	 * We use for loop when We know the exact number of times that We want to repeat a task
	 * while loop is used when We do know how many times the task needs to be repeated
	 * 
	 * Syntax:-
	 * while (condition){
	 * repetitive task
	 * increment/decrement
	 * }
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		while (num>0) {
			num/=10;
			count++;
		}
		System.out.println(count);
	}
}
