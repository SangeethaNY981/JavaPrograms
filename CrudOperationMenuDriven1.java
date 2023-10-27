package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner {
    int lno;
    String lname, ldegree;

    public int getLno() {
        return lno;
    }

    public void setLno(int lno) {
        this.lno = lno;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLdegree() {
        return ldegree;
    }

    public void setLdegree(String ldegree) {
        this.ldegree = ldegree;
    }

    public Learner(int lno, String lname, String ldegree) {
        super();
        this.lno = lno;
        this.lname = lname;
        this.ldegree = ldegree;
    }

    @Override
    public String toString() {
        return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
    }
}

public class CrudOperationMenuDriven1 {

    public static void main(String[] args) {

        ArrayList<Learner> ob = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Insert Data");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Lno ");
                    int lno = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    System.out.print("Enter Lname ");
                    String lname = sc.nextLine();
                    System.out.print("Enter degree ");
                    String ldegree = sc.nextLine();
                    ob.add(new Learner(lno, lname, ldegree));
                    break;

                case 2:
                    Iterator<Learner> itr = ob.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Enter lno to Search: ");
                    int lno1 = sc.nextInt();

                    Iterator<Learner> i = ob.iterator();
                    while (i.hasNext()) {
                        Learner e = i.next();
                        if (e.getLno() == lno1) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter lno to delete");
                    int lnotoDelete = sc.nextInt();
                    boolean isDeleted = false;

                    Iterator<Learner> it = ob.iterator();
                    while (it.hasNext()) {
                        Learner le = it.next();
                        if (le.getLno() == lnotoDelete) {
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

        } while (choice != 0);

        sc.close();
    }
}
