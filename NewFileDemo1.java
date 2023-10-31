package fileSystem;

import java.io.File;

public class NewFileDemo1 {

	public static void main(String[] args) {
	

		File ob = new File("File2.txt");
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


