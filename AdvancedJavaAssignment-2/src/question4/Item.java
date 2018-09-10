package question4;

public class Item {

	private int itemId;
	private String itemName;
	private int itemPrepTime;
	
	public Item() {
		super();
	}
	public Item(int itemId, String itemName, int itemPrepTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrepTime = itemPrepTime;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrepTime() {
		return itemPrepTime;
	}
	public void setItemPrepTime(int itemPrepTime) {
		this.itemPrepTime = itemPrepTime;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrepTime=" + itemPrepTime + "]";
	}
	
}
