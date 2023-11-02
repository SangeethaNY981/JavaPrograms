package threadConcept;

class Month extends Thread {
	public  synchronized void wish(String  monthname) throws InterruptedException {
		for(int i=0;i<=5;i++) {
            sleep(1000);
			System.out.println("Month Name " + monthname);
		}
		
	}
}

class Year extends Thread{
	Month m;
	String monthname;
	
 public Year(Month m, String monthname) {
		super();
		this.m = m;
		this.monthname = monthname;
	}


public void run() {
	 try {
		m.wish(monthname);
	} catch (InterruptedException e) 
	 {
		
		e.printStackTrace();
	}
 }
	
}
public class SynchronizationExamp1 {

	public static void main(String[] args) {
		Month ob =new Month();
		Year y =new Year(ob,"Jan");
		y.start();
		Year y1 =new Year(ob,"Feb");
		y1.start();
		Year y2 =new Year(ob,"March");
		y2.start();
		Year y3 =new Year(ob,"December");
		y3.start();
		

	}

}
