package interfaces;

class sky 
{  
public void displayHuman()  
{  
System.out.println("Method defined inside HumanBody class");  
}  
}  
interface blue  
{  
public void morning();  
}  
interface black  
{  
public void night();  
}   
public class HybridExample extends sky implements blue, black {  
	@Override
	public void night() {
		System.out.println("Its prints black sky in Night");
		
	}
	@Override
	public void morning() {
		System.out.println("Its prints blue sky int Morning");
		
	}	 



	public static void main(String[] args) {
		// TODO Auto-generated method stub

   HybridExample obj = new HybridExample();  
   System.out.println("Implementation of Hybrid Inheritance in Java");  
   obj.night();  
   obj.morning();  
} 

	}


