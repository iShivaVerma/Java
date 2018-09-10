package question6;

public class Item {

	private int itemId;
	private double itemPrice;
	private String itemDesc;
	public Item() {
		super();
	}
	public Item(int itemId, double itemPrice, String itemDesc) {
		super();
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemDesc = itemDesc;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemPrice=" + itemPrice + ", itemDesc=" + itemDesc + "]";
	}
}
