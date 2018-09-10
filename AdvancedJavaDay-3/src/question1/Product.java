package question1;

import java.sql.Date;

public class Product {

	private int productID;
	private String name;
	private float price;
	private Date date;
	public Product() {
		super();
	}
	public Product(int productID, String name, float price, Date date) {
		super();
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.date = date;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", price=" + price + ", date=" + date + "]";
	}
}
