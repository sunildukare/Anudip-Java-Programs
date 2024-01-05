package inheritance;
/*
 * Upcasting is done to make a child object behave like a parent.
 * We do it by making a child class object and referring it with parent type variable.
 * By doing this now We will be able to call only those methods which the child has inherited
 * from the parent.
 * Any method that the child class has of its own cannot be called.
 */
class LivingThings{
	
	public void movements() {
		
		System.out.println("This being is moving...");
	}
}
class Birds extends LivingThings{
	
	public void layingEggs() {
		
		System.out.println("The bird is laying eggs...");
	}
public void movements() {
		
		System.out.println("This bird is moving...");
	}
}
public class UpcastingDemo {

	public static void main(String[] args) {
		/*
		 * b is the reference variable which is pointing to the memory location 
		 * where the object of Birds class is made.
		 */
		Birds b=new Birds();
		b.movements();
		/*
		 * Below is upcasting. Here we are making the object of child class and 
		 * referring it with a variable of the parent type.
		 */
		LivingThings l=new Birds(); 
		l.movements();
		//l.layingEggs();
	}

}

