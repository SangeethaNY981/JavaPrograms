package maps;

 //import java.security.Key;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> ob=new HashMap<>();
		ob.put(101,"Student1");    //to add the elements
		ob.put(101,"student");
		ob.put(102,"STUDENT2");
		ob.put(103,"Student3");
		ob.put(104,"Student4");
		
		System.out.println(ob);
		
	    System.out.println(ob.remove(102));
	    System.out.println(ob);
	    
	    System.out.println(ob.containsKey(102));
	    System.out.println(ob.containsKey(101));
	    
	    System.out.println(ob.containsValue("Student3"));
	    System.out.println(ob.containsValue("student3"));
	    
	    boolean containsKey =ob.containsKey(102);
	    System.out.println(containsKey);
		
	    //to get only key
	    for(Object o:ob.keySet()) {
	    	System.out.println(ob);
	    	}
	    	
	    	 //to get only value
		    for(Object o1:ob.values()) {
		    	System.out.println(ob);
		    }
		    	
		    	 //to get  both key and value
			    for(Object o2:ob.keySet()) {
			    	System.out.println(ob.get(ob)+" "+ob); 
	    }
	}
}

