package assignment5;
/*
 * 2) Show constructor overloading in Vehicle class
 */
class Vehicle{
	String vBrand;
	String vModel;
	int vCost;
	boolean hasAutomaticGears;
	
	public Vehicle() {
		System.out.println("This is a non-parameterized constructor.");
	}
	public Vehicle(String vBrand) {
		System.out.println("This is a parameterized constructor with 1 parameter.");
		this.vBrand = vBrand;
	}
	public Vehicle(String vBrand, String vModel) {
		System.out.println("This is a parameterized constructor with 2 parameters.");
		this.vBrand = vBrand;
		this.vModel = vModel;
	}
	public Vehicle(String vBrand, String vModel, int vCost) {
		System.out.println("This is a parameterized constructor with 3 parameters.");
		this.vBrand = vBrand;
		this.vModel = vModel;
		this.vCost = vCost;
	}
	public Vehicle(String vBrand, String vModel, int vCost, boolean hasAutomaticGears) {
		this.vBrand = vBrand;
		this.vModel = vModel;
		this.vCost = vCost;
		this.hasAutomaticGears = hasAutomaticGears;
	}
}

public class VehicleDemo {
	public static void main(String[] args) {
		//Making objects with different defined/overloaded constructors...
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("TATA");
		Vehicle v3 = new Vehicle("TATA","Nexon");
		Vehicle v4 = new Vehicle("TATA","Nexon",2400000);
		Vehicle v5 = new Vehicle("TATA","Nexon",2400000,true);
	}
}
