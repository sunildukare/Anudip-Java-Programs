package StringPrograms;

public class CompareToDemo {
	public static void main(String[] args) {
		/*
		 * compareTo method will subtract the ASCII value of each letters one at a time.
		 * As soon as it finds that the result is any value other than 0 it stops comparison and returns
		 * the result of the subtraction. 
		 */
		String s1 = "Mom";
		String s2 = "Tom";
		
		int i = s1.compareTo(s2);
		System.out.println("i= "+i);
		
		String t1 = "Jinny";
		String t2 = "Jonny";
		int j = t1.compareTo(t2);
		System.out.println("j= "+j);
	}
}
