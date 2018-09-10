package question2;

import java.io.File;
import java.io.FileFilter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="D:\\demo\\";
		
		File fileObject=new File(path);
		FilesInDirectory filesInDirectoryObject=new FilesInDirectory() {
			
			@Override
			public void disp() {
				// TODO Auto-generated method stub
				boolean fileFilterObject=fileObject.getName().endsWith(".java");
				System.out.println(fileFilterObject);
			}
		};
		
		
	}

}
