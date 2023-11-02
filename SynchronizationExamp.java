package threadConcept;

class Display extends Thread {
	public  synchronized void wish(String name) throws InterruptedException {
		for(int i=0;i<=10;i++) {
//			sleep(1000);
			System.out.println("Good Morning " +name);
		}
		
	}
}

class M1 extends Thread{
	Display d;
	String name;
	
	//constructor
	public M1(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
 public void run() {
	 try {
		d.wish(name);
	} catch (InterruptedException e) 
	 {
		
		e.printStackTrace();
	}
 }
	
}
public class SynchronizationExamp {

	public static void main(String[] args) {
		Display ob =new Display();
        M1 t =new M1(ob, "Dhoni");
        M1 t1 =new M1(ob, "Yuraj");
        M1 t2 =new M1(ob, "Sachin");
        t.start();
        t1.start();
        t2.start();
	}

}
