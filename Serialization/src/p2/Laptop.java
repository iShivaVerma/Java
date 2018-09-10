package p2;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Processor{
	private String company;
	private int speed;
	public Processor(String company, int speed) {
		super();
		this.company = company;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Processor [company=" + company + ", speed=" + speed + "]";
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

public class Laptop implements Serializable{

	private String name;
	private int cost;
	transient private Processor cpu;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String name, int cost, Processor cpu) {
		super();
		this.name = name;
		this.cost = cost;
		this.cpu = cpu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Processor getCpu() {
		return cpu;
	}
	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", cost=" + cost + ", cpu=" + cpu + "]";
	}
	
	private void writeObject(ObjectOutputStream oos)throws Exception
	{
		System.out.println(" -----");
		oos.defaultWriteObject();
		String c = cpu.getCompany();
		int s = cpu.getSpeed();
		System.out.println(" --->> c"+c+" and "+s);
		oos.writeObject(c);
		oos.writeInt(s);
		System.out.println("--- Write close --");
		
	}
	
	private void readObject(ObjectInputStream ois)throws Exception
	{
		System.out.println(" ----- Inside read ---");
		ois.defaultReadObject();
		System.out.println("--->> 2");
		
		String name = (String)ois.readObject();
		System.out.println("--->> Name "+name);
		
		int sp = ois.readInt();
		System.out.println(" ---------->> speed : "+sp);
		
		Processor cpu = new Processor(name, sp);
		
	}
}
