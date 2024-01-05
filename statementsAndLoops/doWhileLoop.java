package statementsAndLoops;

public class doWhileLoop {
	public static void main(String[] args) {
		/*
		 * do while loop is used when We want to execute the loop atleast once
		 * even if the condition is not satisfied
		 * 
		 * Syntax:-
		 * do{
		 * }
		 * while(condition);
		 */
		int i=1;
		do {
			System.out.println("Hello");
			i++;
		}while(i<=5);
	}
}
