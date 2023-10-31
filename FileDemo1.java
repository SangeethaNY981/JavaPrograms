package fileSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File ob =new File("C:\\Users\\Administrator\\eclipse-workspace\\CoreJavaProject\\src\\fileSystem\\File3.txt");
		if(ob.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File Exist");
		}
		
//		FileWriter ob1 =new FileWriter("File3.txt");
//		ob1.write(65);
//		ob1.write(67);
//		ob1.write(68);
//		ob1.write(69);
//		System.out.println("written successfully");
//		ob1.close();


	}

}
