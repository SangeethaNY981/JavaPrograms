package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Fruits{
	int Fno;
	String FName;
	String FTaste;
	String FColor;


	public Fruits(int fno, String fName, String fTaste, String fColor) {
		super();
		 this.Fno = fno;
		this.FName = fName;
		this.FTaste = fTaste;
		this.FColor = fColor;
	
	}

public int getFno() {
		return Fno;
	}

	public void setFno(int fno) {
		Fno = fno;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getFTaste() {
		return FTaste;
	}

	public void setFTaste(String fTaste) {
		FTaste = fTaste;
	}

	public String getFColor() {
		return FColor;
	}

	public void setFColor(String fColor) {
		FColor = fColor;
	}

@Override
	public String toString() {
		return "Fruits [Fno=" + Fno + ", FName=" + FName + ", FTaste=" + FTaste + ", FColor=" + FColor + "]";
	}

}

public class CrudOperationExample {

	public static void main(String[] args) {
		ArrayList<Fruits> ob =new ArrayList();
		Scanner sc=new Scanner(System.in);
		int choice;
			do {
				System.out.println("1. Insert Data");
				System.out.println("2. Display");
				System.out.println("3. Search");
				System.out.println("4. Delete");
				System.out.println("5. Exit");
				System.out.println("Enter Your Choice ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter Fno ");
	                    int Fno = sc.nextInt();
	                    sc.nextLine(); // Consume the newline character
	                    System.out.println("Enter Fname ");
	                    String Fname = sc.nextLine();
	                    System.out.println("Enter FTaste ");
	                    String FTaste = sc.nextLine();
	                    System.out.println("Enter FColor ");
	                    String FColor = sc.nextLine();
	                    ob.add(new Fruits(Fno, Fname, FTaste,FColor));
	                    break;

	                case 2:
	                    Iterator<Fruits> itr = ob.iterator();
	                    while (itr.hasNext()) {
	                        System.out.println(itr.next());
	                    }
	                    break;

	                case 3:
	                    boolean found = false;
	                    System.out.println("Enter Fno to Search: ");
	                    int Fno1 = sc.nextInt();

	                    Iterator<Fruits> i = ob.iterator();
	                    while (i.hasNext()) {
	                        Fruits e = i.next();
	                        if (e.getFno() == Fno1) {
	                            System.out.println(e);
	                            found = true;
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("Record Not Found");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Enter Fno to delete");
	                    int FnotoDelete = sc.nextInt();
	                    boolean isDeleted = false;

	                    Iterator<Fruits> it = ob.iterator();
	                    while (it.hasNext()) {
	                        Fruits le = it.next();
	                        if (le.getFno() == FnotoDelete) {
	                            it.remove();
	                            isDeleted = true;
	                        }
	                    }
	                    if (isDeleted) {
	                        System.out.println("Record has been deleted");
	                    } else {
	                        System.out.println("Sorry lno not found, Deletion failed");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Exiting the program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    break;
	            }

	        } while (choice!= 0);

	        sc.close();
	    }
}
				
