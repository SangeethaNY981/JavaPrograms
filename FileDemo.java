package fileSystem;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File ob = new File("File1.txt");
		if(ob.exists()) {
			System.out.println("Name of the file : "+ob.getName());
			System.out.println("Path ::"+ob.getAbsolutePath());
			System.out.println("Length :: "+ob.length());
			System.out.println("Can read ? "+ob.canRead());
			System.out.println("Can Write ? "+ob.canWrite());
		}
		else {
			System.out.println("File Not Found");
		}


	}

}
