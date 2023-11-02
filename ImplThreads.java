package threadConcept;

//class MyThread extends Thread{
//	public void run() 
//	{
//		for(int i=0;i<=10;i++) 
//		{
//			System.out.println("hello");
//		}
//	}
//}

class MyThread1 extends Thread {
	 public  void run() {
		System.out.println("No arg");
	}
	 void run(int i)
	{
		System.out.println("one-arg");  //to get this method need
	}
	void run(int a,int b)
	{
		System.out.println("2 arg");
	}
}


public class ImplThreads {

	public static void main(String[] args) {
	
		MyThread1 ob = new MyThread1();
		ob.start();  //this will print only no arg
		ob.run(1);
		ob.run(1,2);

	}

}
