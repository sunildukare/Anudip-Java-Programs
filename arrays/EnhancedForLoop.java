package arrays;

public class EnhancedForLoop {
	public static void main(String[] args) {
		/*
		 * Enhanced for loop is also known as for each loop.
		 * This type of loop is used to fetch data from arrays or collections.
		 * 
		 * Syntax:-
		 * for(arrayDataType var: arrayName){}
		 * 
		 */
		
		double[] marks = {90,54,45.23,87.00,52.00,95.87};
		for (double m: marks) {
			System.out.print(m+" ");
		}
	}
}
