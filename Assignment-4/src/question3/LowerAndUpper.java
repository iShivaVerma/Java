package question3;
import question2.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LowerAndUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LowerAndUpper lowerAndUpperObject=new LowerAndUpper();
		String pathLowerClassMan="src\\question2\\LowerClassMan.txt";
		String pathUpperClassMan="src\\question2\\UpperClassMan.txt";
		
		System.out.println("Lower Class Man Details:");
		try{
			lowerAndUpperObject.readStudentObject(pathLowerClassMan);
		}
		catch (Exception exceptionObject) {
			exceptionObject.printStackTrace();
		}
		System.out.println("Upper Class Man Details:");
		try{
			lowerAndUpperObject.readStudentObject(pathUpperClassMan);
		}
		catch (Exception exceptionObject) {
			exceptionObject.printStackTrace();
		}
	}
	public void readStudentObject(String path)throws Exception
	{
		LowerAndUpper lowerAndUpperObject=new LowerAndUpper();
		FileInputStream fileInputStreamObject=new FileInputStream(new File(path));
		ObjectInputStream objectInputStreamObject =new ObjectInputStream(fileInputStreamObject);
		Student studentObject[]=(Student[])objectInputStreamObject.readObject();
		for (Student student : studentObject) {
			if(student!=null)
				lowerAndUpperObject.display(student);
		}
	}//end readStudentObject
	public void display(Student studentObject){
		System.out.println(studentObject);
	}//end display

}
