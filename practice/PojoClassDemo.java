package practice;

/*
 * 1) Write a program to create a Book Pojo class/Java Bean.
 * Each Book should have id, name, author, category, price.
 * Demonstrate constructor overloading in the pojo class.
 */
class Book{
	private int id;
	private String name;
	private String author;
	private String category;
	private int price;
	
	public Book() {
		System.out.println("Non-parameterized constructor");
	}
	public Book(int id, String name) {
		System.out.println("Parameterized constructor with two parameters");
		this.id = id;
		this.name = name;
	}
	public Book(int id, String name, String author, String category, int price) {
		System.out.println("Parameterized constructor with five parameters.");
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", category=" + category + ", price="
				+ price + "]";
	}
}

public class PojoClassDemo {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book(1, "Let Us C");
		Book book3 = new Book(2, "Java Programming","Kartik Pawar","Programming",250);
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
	}
}
