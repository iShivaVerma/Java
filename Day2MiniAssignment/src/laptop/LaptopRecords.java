package laptop;
import java.util.*;

public class LaptopRecords {

	int count=-1;
	Scanner s=new Scanner(System.in);
	Laptop laptop[]=new Laptop[100];  // naming convention
	
	public void addLaptop(int serialNumber,String brandName,int cost){
		++count;
		laptop[count]=new Laptop();
		laptop[count].setSerialNumber(serialNumber);
		laptop[count].setBrandName(brandName);
		laptop[count].setCost(cost);
	}
	public String displayLaptopInfo(Laptop laptop){
		return "------------------------------\nSerial Number:"+laptop.getSerialNumber()+"\nBrand Name:"+laptop.getBrandName()+"\nCost:"+laptop.getCost();
	}
	public void searchOnBasisOfSerialNumber(int serialNumber){
		int flag=0;
		LaptopRecords laptopRecordObject=new LaptopRecords();
		for(int i=0;i<=count;i++)
		{
			if(laptop[i].getSerialNumber()==serialNumber)
			{
				System.out.println(laptopRecordObject.displayLaptopInfo(laptop[i]));
				flag++;
			}
		}
		if(flag==0)
			System.out.println("Not Found");
	}
	public void searchOnBasisOfCostRange(int minCost,int maxCost){
		LaptopRecords laptopRecordObject=new LaptopRecords();
		int flag=0;
		for(int i=0;i<=count;i++)
		{
			if(laptop[i].getCost()<=maxCost && laptop[i].getCost()>=minCost)
			{
				System.out.println(laptopRecordObject.displayLaptopInfo(laptop[i]));
				flag++;
			}
		}
		if(flag==0)
			System.out.println("Not Found");
	}
}
