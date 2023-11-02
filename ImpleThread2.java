package threadConcept;

class MyThread3 extends Thread{
	public void run() {
		System.out.println("no arg");
	}
}

public class ImpleThread2 {

	public static void main(String[] args) {
		MyThread3 ob1 =new MyThread3();
		
		ob1.start();
		System.out.println(" Id of the  Thread"+ob1.getId());
		ob1.setName("Sangeetha");
		System.out.println("After setting thread name "+ob1.getName());
//      System.out.println("Priority of the thread is "+ob1.getPriority());
		ob1.setPriority(1);
		System.out.println("Priority After the setting"+ob1.getPriority());
		
		Thread2 t1 = new Thread2(); //second thread
		t1.start();
		
//      ob.run();

	}

}
