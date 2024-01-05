package inheritance;

class ClothingApp{
	public void addToCart() {
		System.out.println("The clothing item is added to the cart.");
	}
	public void addReview() {
		System.out.println("Thank you for adding your review in the ClothingApp.");
	}
	public void placeOrder() {
		System.out.println("Your order is placed.");
	}
}
class Myntra extends ClothingApp{
	public void addToCart() {
		System.out.println("The clothing item is added to Myntra's cart.");
	}
	public void addToFavourites() {
		System.out.println("The clothing item is added to your favourites list.");
	}
	public void useVoucher() {
		System.out.println("The voucher is used and the amount is deducted"
							+ "from the price of item.");
	}
}

public class UpcastingPrac1 {
	public static void main(String[] args) {
		/*
		 * Make a class ClothingApp
		 * It should have methods addToCart, addReview and placeOrder.
		 * 
		 * Make a class Myntra that is child class of ClothingApp
		 * Change the behavior of addToCart in Myntra app
		 * Myntra should have its own two methods
		 * 
		 * Demonstrate upcasting in this program.
		 */
		ClothingApp capp = new Myntra();
		capp.addToCart();
		capp.addReview();
		capp.placeOrder();
		//capp.addToFavourites();
		//capp.useVoucher();
	}
}
