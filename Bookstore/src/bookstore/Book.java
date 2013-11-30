package bookstore;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private float price;
	private String isbn;
	
	Book(){};
	
	Book(String title, String author, String publisher, String isbn, float price){
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.publisher = publisher;
		this.title = title;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
}
