package bookstore;

public class Client extends EntityBase{


	private String username;
	private String email;
	private String password;
	private String phone;
	private String city;
	private String address;
	private String country;
	
	Client(){};
	
	public Client(String username, String email, String password, String phone,
			String city, String address, String country) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.city = city;
		this.address = address;
		this.country = country;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
	
}
