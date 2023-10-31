package fileSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

	

public class  SerializationAndDeserialization { 

	public static void main(String[] args) {

		   Person ob = new Person("Bob", 8);
		   Person ob1=new Person("Devid",9);
		   int id=1;

	        // Serialization: Writing the object to a file
	        try {
	            FileOutputStream filein = new FileOutputStream("File2.txt");
	            ObjectOutputStream os= new ObjectOutputStream(filein);
	            os.writeObject(ob);
	            os.close();
	            filein.close();
	            System.out.println("Serialization successful. Object saved as ob.serialization");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        //Deserialization reading the data from the file
	        try {
	            FileInputStream fileIn = new FileInputStream("File2.txt");
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

	            // Read the deserialized object from the stream
	            Person person = (Person) objectIn.readObject();

	            objectIn.close();
	            fileIn.close();

	            // Display the deserialized object
	            System.out.println("Deserialization successful. Loaded Person details:");
	            System.out.println("Name: " + person.getName());
	            System.out.println("Age: " + person.getAge());
	            System.out.println("Name "+ob1.getName());
	            System.out.println("Age "+ob1.getAge());
	           
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();	
	        }
	        
	        
	        
	    }


	

}


