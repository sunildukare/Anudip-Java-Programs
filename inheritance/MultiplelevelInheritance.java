package inheritance;

/*
 * The reason for not allowing multiple inheritance in Java is because of ambiguity error.
 * 
 * Ambiguity error is when a class has two methods of the same signature. If this happens,
 * then JVM will get confused as to which method has to be called.
 * 
 * If a class is allowed to have multiple parents then there is a possibility that the
 * parents have the same exact methods and consequently these same methods will be inherited
 * by the child. This will again lead to ambiguity error.
 * Hence multiple inheritance is not allowed in Java.
 */
class C{
	public void display() {
		System.out.println("***************");
	}
	public void display(int i) {
		System.out.println("%%%%%%%%%%%%%%%");
	}
	public void display(int i, String s) {
		System.out.println("###############");
	}	
}
public class MultiplelevelInheritance {
	public static void main(String[] args) {
		C c = new C();
		c.display();
		c.display(-1);
		c.display(0,"Go to Hell");
	}
}
