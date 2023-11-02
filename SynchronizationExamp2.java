package threadConcept;

class Product extends Thread {
	public  synchronized void Shopping(String item) throws InterruptedException {
		for(int i=0;i<=6;i++) {
//			sleep(1000);
			System.out.println("Product Name " +item);
		}
		
	}
}

class Purchase extends Thread{
	Product p;
	String item;
	
	//constructor
	public Purchase(Product p, String item) {
		super();
		this.p = p;
		this.item = item;
	}
	
 public void run() {
	 try {
		p.Shopping(item);
	} catch (InterruptedException e) 
	 {
		
		e.printStackTrace();
	}
 }
	
}
public class SynchronizationExamp2 {

	public static void main(String[] args) throws InterruptedException {
		Product ob =new Product();
        Purchase t =new Purchase(ob, "Dresses");
        Purchase t1 =new Purchase(ob, "Accessories");
        Purchase t2 =new Purchase(ob, "Chocolates");
        t.start();
        t.join(100);
        t1.start();
        t2.start();

	}

}
