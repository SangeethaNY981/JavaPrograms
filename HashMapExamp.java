package maps;

import java.util.HashMap;

public class HashMapExamp {

	public static void main(String[] args) {
		HashMap<String,Integer> ob=new HashMap<>();
		ob.put("Student1",10);    //to add the elements
		ob.put("student",11);
		ob.put("STUDENT2",12);
		ob.put("Student3",13);
		ob.put("Student4",13);
		
		System.out.println(ob);
		
	    System.out.println(ob.remove("student"));
	    System.out.println(ob);
	    
	    System.out.println(ob.containsKey("Student3"));
	    System.out.println(ob.containsKey("Student"));
	    
	    System.out.println(ob.containsValue(10));
	    System.out.println(ob.containsValue(14));
	    
	    boolean containsKey =ob.containsKey("student");
	    System.out.println(containsKey);

	}

}
