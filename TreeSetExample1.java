package collectionExample;

 // import java.util.Scanner;
import java.util.TreeSet;

class Students implements Comparable<Students> {
    private String FirstName;
    private String LastName;
    private int Id;
    private String phoneNumber;
    private String email;
    private String CourseName;
    
	public Students(String firstName, String lastName, double id, String phoneNumber, String email, String courseName) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Id = Id;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.CourseName = courseName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	@Override
	public String toString() {
		return "Students [FirstName=" + FirstName + ", LastName=" + LastName + ", Id=" + Id + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", CourseName=" + CourseName + "]";
	}
	@Override
	public int compareTo(Students other) {
		return this.phoneNumber.compareTo(other.phoneNumber);
	}   
}
public class TreeSetExample1 {

	public static void main(String[] args) {
		 TreeSet<Students> Details = new TreeSet<>();
		  
		 Details.add(new Students("Alice","J",101,"987-654-3210","juturu123@gmail.com","CSE"));
	     Details.add(new Students("Bob","s",102,"987-754-3210","swrt124@gmail.com","EEE"));
	     Details.add(new Students("Eve","J",103,"984-454-3210","urysxnj156@gmail.com","EcE"));
	     
	     boolean isAdded = Details.add(new Students("Alice","J",101,"987-654-3210","juturu123@gmail.com","CSE"));
	     
	     if (isAdded) {
	    	 System.out.println("Contact Alice added successfully.");
	     } else {
	    	 System.out.println("Contact Alice is already in the list.");
	     }
	     System.out.println("Details (Sorted by Name):");
	     for (Students Students : Details) {
	    	 System.out.println(Students);
	     }

	}

}

