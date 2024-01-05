package StringPrograms;

public class StartsEndsWithDemo {
	public static void main(String[] args) {
		String institute = "Anudip Foundation";
		boolean a = institute.startsWith("An");
		boolean b = institute.startsWith("abc");
		boolean c = institute.endsWith("on");
		boolean d = institute.endsWith("abc");
		System.out.println("Does the institue starts with An? "+a);
		System.out.println("Does the institue starts with abc? "+b);
		System.out.println("Does the institue ends with on? "+c);
		System.out.println("Does the institue ends with abc? "+d);
	}
}
