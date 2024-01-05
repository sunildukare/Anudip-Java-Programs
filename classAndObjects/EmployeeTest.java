package classAndObjects;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Sujina");
		e1.setDesignation("Senior Faculty");
		String name = e1.getName();
		System.out.println("Name of e1 employee = "+name);
		
		Employee e2 = new Employee(500, "Amit", "Team Leader", 50000.0);
		String designation = e2.getDesignation();
		System.out.println("Designation of the e2 employee = "+designation);
		System.out.println("\nPrinting all details of the Employee e2 together...");
		System.out.println(e2);
	}
}
