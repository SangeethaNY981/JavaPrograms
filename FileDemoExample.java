package fileSystem;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemoExample {

	public static void main(String[] args) throws IOException {
		FileWriter ob =new FileWriter("File1.txt");
		ob.write("Java is object oriented Language");
		System.out.println("written successfully");
		ob.close();

	}

}
