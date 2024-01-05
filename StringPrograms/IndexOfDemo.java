package StringPrograms;

public class IndexOfDemo {
	public static void main(String[] args) {
		String movie = "Jailer The Movie";
		int i = movie.indexOf('e');
		int j = movie.lastIndexOf('e');
		int k = movie.indexOf("The");
		int l = movie.indexOf('e', 6);
		int m = movie.indexOf("The", 8);
		System.out.println("Movie: "+movie);
		System.out.println("Movie length: "+movie.length());
		System.out.println("1st Index of 'e': "+i);
		System.out.println("Last Index of 'e': "+j);
		System.out.println("1st Index of The: "+k);
		System.out.println("Index of 'e' from 6th: "+l);
		System.out.println("Index of The from 8th: "+m);
		
	}
}
