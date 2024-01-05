package inheritance;
/*
 * Method overloading is the process of making methods of the same name in the same class.
 * 
 * Uses:-
 * It is used for increasing the readability of the class.
 * 
 * How to do method overloading:-
 * 1) Make same name method in the same class.
 * 2) Parameters should be different.
 * 3) Parameters can be changed in the following wau:-
 * 			a) Increase the number of parameter.
 * 			b) Change the datatype of parameter.
 *			c) Change the sequence of parameter datatypes.
 */

class Calculator{
	
	public void add() {
		
		System.out.println("This is the add method...");
	}
	public void add(int i, int j) {
		
		System.out.println("The addition of int values= "+(i+j));
	}
    public void add(String s, String t) {
		
		System.out.println("The addition of two strings= "+(s+t));
	}
	public void subtract(double d,int i) {
		
		System.out.println("The subtraction of given double value= "+(d-i));
	}
	public void subtract(int i, double d) {
		
		System.out.println("The subtraction of given double value= "+(i-d));
	}
}
public class MethodOverloading1 {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add();
		c.add(23,67);
		c.add("Java","Course");
		c.subtract(56.543, 67);
		c.subtract(67, 56.543);
	}

}
