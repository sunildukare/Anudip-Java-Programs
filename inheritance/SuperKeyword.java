package inheritance;
/*
 * super keyword represents the parent class object.
 * It will always declare the immediate parent.
 */
class University{
	String name="Mumbai University";
}
class College extends University{
	String name = "Bhavan's College";
	
	public void display() {
		System.out.println("Name of College: "+name);
		System.out.println("Name of University: "+super.name);
	}
}
class Department extends College{
	String name = "Chemistry Department";
	
	public void show() {
		System.out.println("\nWe are in show method of Department...");
		System.out.println("Name of Department: "+name);
		System.out.println("Name of super: "+super.name);
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		College c = new College();
		c.display();
	}
}
