package assignment2;

class  StaticContainer{
	static String str = "This is a static string";
}

public class StaticCallerApp {
	public static void main(String[] args) {
		System.out.println(StaticContainer.str); //static variable str is called without creating new instance of StaticContainer Object
	}
}
