package inheritance;

class Oppo{
	String name = "OPPO";
	
	public void sales() {
		System.out.println("There is a total 10% increase in sales made by "+name);
	}
}
class RealMe extends Oppo{
	String name = "RealMe";
	
	public void sales() {
		System.out.println("There is a total 25% increase in sales of "
							+name+" by "+super.name);
	}
	public void statistics() {
		RealMe rm = new RealMe();
		rm.sales();
		super.sales();
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		/*
		 * Write a program where Oppo is the parent class and RealMe is the child class.
		 * Both Oppo and RealMe should have same instance method sales.
		 * 
		 * Try calling both method from RealMe object.
		 */
		RealMe phone = new RealMe();
		phone.statistics();
	}
}
