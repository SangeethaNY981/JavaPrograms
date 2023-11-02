package threadConcept;

class Thread3 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			Thread.yield();
			System.out.println("Thread" +i);
		}
	}
	}

class Thread4 extends Thread{
public void run() {
	for(int i=5;i<=10;i++) {

			System.out.println("Thread1" +i);
		}
}
	}

public class ImplThreadYield {

	public static void main(String[] args) {
		Thread3 t =new Thread3();
		t.start();
		Thread4 t1 =new Thread4();
		t1.start();

	}

}
