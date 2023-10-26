package exception;

public class ClassNotFoundException {

	public static void main(String[] args) {
		try {
			Class.forName("com.edu2.OverLoadingCaseStudy");//if we give non existing class name it will throw an Exception
			System.out.println("class found");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
