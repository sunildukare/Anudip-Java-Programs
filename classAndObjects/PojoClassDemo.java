package classAndObjects;

/*
 * POJO: Plain Old Java Object
 * It is a compilable class and contains only private variables, constructors, getters,
 * setters and toString. POJO class object is also known as Java Bean.
 * 
 * ---> this keyword represents the current class object. Meaning We are representing object
 * of the class in which We are writing this keyword.
 * 
 * Since variables are private We will not be able to access them directly from other class.
 * We can set values by using: -
 * 1) Parameterized constructors:
 * We used this keyword to declare the instance variables, and then We stored the data of
 * local variable into the instance variable.
 * 
 * 2) Setters:
 * Setters are public methods specifically used to set values to the private variables.
 * Syntax:-
 * public void setVariable(String variable){
 * this.variable = variable;
 * }
 * If We don't have all the details to be stored in the object, then We can call setters
 * of only those variables whose data We have.
 * 
 * 3) Getters:
 * Getters are public methods specifically used to get the value that was stored in the
 * instance variable.
 * Syntax:-
 * public return type getVariable{
 * return variable;
 * }
 */
class Customer{
	private String name;
	private String email;
	private long mobile;
	private boolean fresher;
	private String dob;
	private String education;
	private int noticePeriod;
	
	public Customer() {
		System.out.println("Non-parameterized constructor");
	}
	
	public Customer(String name, String email, long mobile, boolean fresher, String dob,
					String education, int noticePeriod) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.fresher = fresher;
		this.dob = dob;
		this.education = education;
		this.noticePeriod = noticePeriod;
	}
	
	public void display() {
		System.out.println("Name= "+name);
		System.out.println("Email= "+email);
		System.out.println("Mobile= "+mobile);
		System.out.println("Fresher= "+fresher);
		System.out.println("Date of birth= "+dob);
		System.out.println("Education= "+education);
		System.out.println("Notice Period= "+noticePeriod);
	}
	
	//alt+shift+s

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public boolean isFresher() {
		return fresher;
	}
	public void setFresher(boolean fresher) {
		this.fresher = fresher;
	}

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

	public int getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
}
public class PojoClassDemo {
	public static void main(String[] args) {
		Customer c=new Customer("Sanket","sanket@gmail.com",7654324421l,true,"6/11/2000",
								"B. Tech",3);
		c.display();
		

		Customer c1 = new Customer();
		c1.setName("Vaishali");
		c1.setEmail("vaishu@gmail.com");
		c1.setMobile(1546786456);
		System.out.println(c1.getName());
		System.out.println(c1.getEmail());
		System.out.println(c1.getMobile());
	}
}
