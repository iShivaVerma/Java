import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainCLass mainCLassObject=new MainCLass();
		String path="Laptop.txt";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Laptops:");
		int number=Integer.parseInt(s.nextLine());
		Laptop laptopObject[]=new Laptop[number];
		mainCLassObject.insert(laptopObject, number);
		
		try{
			mainCLassObject.saveLaptop(laptopObject, path);
			mainCLassObject.readLaptop(path,number);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void insert(Laptop laptopObject[],int number)
	{
		Scanner s=new Scanner(System.in);
		String name;
		int cost;
		int megaPixel;
		Camera cameraObject;
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter Details for Laptop["+(i+1)+"]:");
			System.out.println("Enter Name:");
			name=s.nextLine();
			System.out.println("Enter the Cost:");
			cost=Integer.parseInt(s.nextLine());
			System.out.println("Enter Camera Resolution:");
			megaPixel=Integer.parseInt(s.nextLine());
			cameraObject=new Camera(megaPixel);
			laptopObject[i]=new Laptop(name, cost, cameraObject);
			System.out.println("-----------Inserted------------");
		}
	}
	public void output(Laptop laptopObject)
	{
		System.out.println("-------------------Laptop Details:------------------");
		System.out.println("Name:"+laptopObject.getName());
		System.out.println("Cost:"+laptopObject.getCost());
		System.out.println("Camera Megapixel:"+laptopObject.cameraObject.getMegaPixel());
	}
	
	public void saveLaptop(Laptop laptop[],String path)throws Exception
	{
		FileOutputStream fos = new FileOutputStream(new File(path));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(laptop);
		System.out.println("------Object saved------");
	}

	public void readLaptop(String path,int number)throws Exception
	{
		MainCLass mainCLass=new MainCLass();
		FileInputStream fis = new FileInputStream(new File(path));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Laptop laptop[] = (Laptop[])ois.readObject();		
		for(int i=0;i<number;i++)
		{
			mainCLass.output(laptop[i]);
		}
	}
}
