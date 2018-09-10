package myPack;

public class Laptop extends Electronics{

	private String processor;
	private int storageCapacity;
	public Laptop() {
		super();
	}
	public Laptop(int id,int current,String processor, int storageCapacity) {
		super(id,current);
		this.processor = processor;
		this.storageCapacity = storageCapacity;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	@Override
	public String toString() {
		return "Laptop [processor=" + processor + ", storageCapacity=" + storageCapacity + "]";
	}
}
