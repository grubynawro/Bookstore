package bookstore;

import java.util.ArrayList;

public class Order extends EntityBase{

	private Client client;
	private String orderDate;
	private String deliveryDate;
	private float totalPrice;
	private ArrayList <Book> book_list;
		
	public Order(Client client, String orderDate, String deliveryDate,
			float totalPrice, ArrayList<Book> book_list) {
		super();
		this.client = client;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.totalPrice = totalPrice;
		this.book_list = book_list;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public ArrayList<Book> getBook_list() {
		return book_list;
	}
	public void setBook_list(ArrayList<Book> book_list) {
		this.book_list = book_list;
	}
	
	
	
}
