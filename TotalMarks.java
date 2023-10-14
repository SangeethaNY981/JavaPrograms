package BasicPrograms;

public class TotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
       int math =85;
       int iot =80;
       int nosql =85;
       int english =90;
       int hindi =97;
       int mang =70;
       double tot_marks = math+ iot+ nosql+ english + hindi+ mang;
       System.out.println("total marks is" + tot_marks);
    //   double percentage =(tot_marks*100/600);
       System.out.println(tot_marks/(6*100)*100);
      // System.out.println("percentage"+percentage);
	}

}
