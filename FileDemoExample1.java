package fileSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemoExample1 {

	public static void main(String[] args) throws IOException {
//		FileWriter ob1 =new FileWriter("File2.txt");
//		ob1.write(65);
//		ob1.write(67);
//		ob1.write(68);
//		ob1.write(69);
//		System.out.println("written successfully");
//		ob1.close();
		
		File ob =new File("File2.txt");
		Scanner sc=new Scanner(ob);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

}
