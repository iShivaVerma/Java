package p2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Runner r = new Runner();
			r.createLaptopSer();
			r.readLaptop();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void createLaptopSer()throws Exception
	{
		FileOutputStream fos = new FileOutputStream("Laptop.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Processor intell = new Processor("Intel",200);
		Laptop laptop = new Laptop("Dell",78000,intell);
		
		oos.writeObject(laptop);
		System.out.println("Done ");
	}
	public void readLaptop()throws Exception
	{
		FileInputStream fis = new FileInputStream("Laptop.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Laptop l = (Laptop)ois.readObject();
		System.out.println(l);
	}

}
