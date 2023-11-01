package threadConcept;

class MyThread implements Runnable {
public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println("hello");
	}
}

}
public class ImpleThread1 {

	public static void main(String[] args) {
		MyThread ob =new MyThread();
		Thread t=new Thread(ob);
		t.start();
	}
		 // System.out.println("hello");
	}
//
//	public static void main(int[] args) {
//		System.out.println("hi");
//	}


