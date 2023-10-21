package encapsulation;
class School{
	private String Studentname;
	private int Rollno;
	private String Fathername;
	private String Mothername;
	
	
	public School (String Studentname, int Rollno, String Fathername, String Mothername){
		this.Studentname=Studentname;
		this.Rollno=Rollno;
		this.Fathername=Fathername;
		this.Mothername=Mothername;
	}
		
		public String getStudentname() {
			return Studentname;
		}
		public int getRollno() {
			return Rollno;
		}
		public String getFathername() {
			return Fathername;
		}
		public String getMothername() {
			return Mothername;
		}
		
		public void setStudetname(String Studentname, int Rollno) {
			this.Studentname=Studentname;
			this.Rollno=Rollno;
		}
}


		
public class DemoEncapsule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          School ob =new School("Sandeep", 106, "Gowda", "Sridevi");
		
		System.out.println("Student name is "+ob.getStudentname());
		System.out.println("Student rollno is "+ob.getRollno());
		System.out.println("Student father name is "+ob.getFathername());
		System.out.println("Student mother name is "+ob.getMothername());

	}

	}


