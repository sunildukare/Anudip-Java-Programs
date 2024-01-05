package inheritance;

class Food{
	int foodId=101;
	String foodName="Wada pav";
	double foodPrice=25.00;
	
	public void addSalt() {
		System.out.println("Adding more salt in food");
	}
	public void addChutney() {
		System.out.println("Adding more chutney to food");
	}
}

class Cart{
	Food f = new Food();
	public void changeFood() {
		f.addSalt();
	}
}
public class AggregationDemo1 {
	public static void main(String[] args) {
		/*
		 * Inheritance shows IS-A relationship.
		 * Here child is a type of parent
		 * 
		 * Aggregation show HAS-A relationship.
		 * In this one class has a object of another class.
		 */
		
		Cart c = new Cart();
		c.changeFood();
		c.f.addSalt();
	}
}
