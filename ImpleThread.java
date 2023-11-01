package threadConcept;

class Thread2 extends Thread{


	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				sleep(1000);
			}catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	
	}
	
}
public class ImpleThread {

	public static void main(String[] args) throws InterruptedException {
		Thread2 ob = new Thread2();    //first thread
		
		ob.start();
		System.out.println(" Id of the  Thread"+ob.getId());
		ob.setName("12");
		System.out.println("After setting thread name "+ob.getName());
//		System.out.println("Priority of the thread is "+ob.getPriority());
		ob.setPriority(1);
		System.out.println("Priority After the setting"+ob.getPriority());
		
		ob.join(); //it will make second thread  to join with first thread
		
		Thread2 t1 = new Thread2(); //second thread
		t1.start();

	}

}
