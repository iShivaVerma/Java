package myPack;

public class Electronics {

	private int id;
	private int current;
	public Electronics() {
		super();
	}
	public Electronics(int id, int current) {
		super();
		this.id = id;
		this.current = current;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
}
