package abstraction;
/*
 * Abstraction is another pillar of OOPs concept.
 * 
 * In java we achieve abstraction by making abstract method.
 * Abstract methods do not have their own method body. Thet only have method signature.
 * These abstract methods are given implementation/method body by child classes according to their requirements.
 * 
 * point to remember:- 
 * 1) Abstract method has to be declared by using abstract keyword.
 * 2) An abstract method can only be made inside an abstract to declare the class also abstract.
 * 3) We cannot make the object of abstract class because our class is incomplete since it has abstract method.
 * 4) Any child class of an abstract class has to give implementation to abstract method.
 * 5) If a child class does not want to give implementation to the abstract method inherited from parent class, then
 * 	  it will have to declare itself as abstract.
 * 6) We can have constructor in abstract class. We cannot call this constructor directly after new keyword we have
 * 	  to call it with super keyword from child class constructor.
 * 7) Because abstract keyword and final keyword are doing completely opposite work.
 *    With abstract we are preventing child class to make changes.
 *    Hence we are not allowed to use these keyword together.
 */
abstract class Robot1 {           //Declare class as abstract
	
	public void talking() {
		
		System.out.println("The robot is talking...");
	}
	public void cleaning() {
		
		System.out.println("The robot is cleaning...");
	}
	/*
	 * Below we are seeing an abstract method.
	 * This type of method does not have method body.
	 */
	public abstract void dancing();  //Declare method as abstract
}
class SamiiRobot extends Robot1 {
	
	public void dancing() {
		
		System.out.println("My robot is doing Bharatnatyam dance!!!");
	}
}
class TejRobot extends Robot1 {

	@Override
	public void dancing() {
		// TODO Auto-generated method stub
		System.out.println("My robot is doing Hip-Hop dance!!!");
	}
}
abstract class SharRobot extends Robot1{
	
	public void protectIndia() {
		
		System.out.println("My robot is on the Kashmir border...");
	}
}
class SanRobot extends SharRobot {
	
	public void dancing() {
		
		System.out.println("My robot is doing kathakali.");
	}
}
public class Example1{

	public static void main(String[] args) {
		
		//Robot1 r=new Robot1();   //Java not allowed to used object of abstract class bcoz abstract class is incomplete.
		SamiiRobot a=new SamiiRobot();
		a.talking();
		a.cleaning();
		a.dancing();
		
		System.out.println("\nThis is Tejas's Robot");
		TejRobot t = new TejRobot();
		t.cleaning();
		t.dancing();
		System.out.println("\nThis is Sanjay's Robot");
		SanRobot s = new SanRobot();
		s.protectIndia();
		s.dancing();
		s.cleaning();
	}

}
