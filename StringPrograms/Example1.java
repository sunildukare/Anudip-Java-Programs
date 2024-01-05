package StringPrograms;

public class Example1 {
	public static void main(String[] args) {
		String s = "Anudip"; //using String literals
		
		/*
		 * making String objects with new keyword
		 * We have called the empty constructor to make this object
		 */
		String s1 = new String();
		
		System.out.println("s= "+s);
		System.out.println("S1= "+s1);
		
		
		/*
		 * Again calling parameterized constructor which accepts String type data
		 */
		String s2 = new String("Java");
		System.out.println("s2= "+s2);
		
		String s3 = new String(s);
		System.out.println("s3= "+s3);
		
		char symbols[] = {'*','&','%','$'};
		/*
		 * Below We are making the object of the String class by calling the constructor which accepts a
		 * character type array.
		 * When We print s4 we can see that all the characters of the array has been added as one single
		 * string in s4.
		 */
		String s4 = new String(symbols);
		System.out.println("s4= "+s4);
	}
}
