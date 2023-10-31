package fileSystem;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {

	public static void main(String[] args) throws IOException {
		File ob = new File("File1.txt");
		if(ob.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File Exist");
		}

	}

}
