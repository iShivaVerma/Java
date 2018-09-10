package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	String name;
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			MyClass obj = new MyClass();
			//obj.createSerFile();
			obj.readSerFile();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void createSerFile()throws Exception
	{
		FileOutputStream fos = new FileOutputStream("MyDogSer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Dog d = new Dog();
		d.name = "abc";
		oos.writeObject(d);
		System.out.println(" done");
	}
	public void readSerFile()throws Exception
	{
		FileInputStream fis = new FileInputStream("MyDogSer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d = (Dog)ois.readObject();
		System.out.println(" dog name "+d.name);
	}

}
