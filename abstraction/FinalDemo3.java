package abstraction;

final class Demo3{
	String name = "Anudip";
	int id = 500;
	
	public void display() {
		System.out.println("Hello everyone!!!");
	}
}
/*
 * Below We are not able to extend the Demo3 class because a final class cannot be extended.
 * A final class can never be a super class/parent class.
 */

class SubDemo3 /*extends Demo3 - will show error*/{
	
}
public class FinalDemo3 {
	public static void main(String[] args) {
		/*
		 * We can make objects of final class. And We can call the methods of final class
		 * from the objects.
		 */
		Demo3 d = new Demo3();
		d.display();
	}
}
