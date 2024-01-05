package inheritance;

class LivingThing{
	
	public void movements() {
		
		System.out.println("This being is moving...");
	}
}
class Bird extends LivingThing{
	
	public void layingEggs() {
		
		System.out.println("The bird is laying eggs...");
	}
}
public class UpcastingDemo1 {

	public static void main(String[] args) {
		/*
		 * b is the reference variable which is pointing to the memory location 
		 * where the object of Birds class is made.
		 */
		Bird b=new Bird();
		b.movements();
		/*
		 * Below is upcasting. Here we are making the object of child class and 
		 * referring it with a variable of the parent type.
		 */
		LivingThing l=new Bird(); 
		l.movements();
		//l.layingEggs();
	}

}
