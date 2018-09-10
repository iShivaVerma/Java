package myPack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop laptopObject=new Laptop(101,4000,"AMD Ryzen 7 1700X",2);
		Camera camerObject=new Camera(100, 3300, 40, "F/1.5");
		MainClass mainClassObject =new MainClass();
		mainClassObject.displayInfo(camerObject);
		mainClassObject.displayInfo(laptopObject);
	}
	public void displayInfo(Electronics e)
	{
		if(e instanceof Laptop)
		{
			Laptop laptopObject=(Laptop)e;
			displayLaptop(laptopObject);
		}
		if(e instanceof Camera)
		{
			Camera cameraObject=(Camera)e;
			displayCamera(cameraObject);
		}
	}
	public void displayCamera(Camera cameraObject)
	{
		System.out.println("Camera Details:\n---------------");
		System.out.println("ID:"+cameraObject.getId());
		System.out.println("Current:"+cameraObject.getCurrent()+"mAH");
		System.out.println("MegaPixel:"+cameraObject.getMegaPixel());
		System.out.println("Apperture:"+cameraObject.getApperture());
	}
	public void displayLaptop(Laptop laptopObject)
	{
		System.out.println("Laptop Details:\n---------------");
		System.out.println("ID:"+laptopObject.getId());
		System.out.println("Current:"+laptopObject.getCurrent()+"mAH");
		System.out.println("MegaPixel:"+laptopObject.getProcessor());
		System.out.println("Apperture:"+laptopObject.getStorageCapacity()+"TB");
	}
}
