package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//it will allow duplicate values 
//it can have n number of null values
public class ArrayListExample {

	public static void main(String[] args) {
	ArrayList al=new  ArrayList();
//	ArrayList<String> al1 =new ArrayList<String>();
//	List<String>l=new ArrayList<String>();

	al.add("sindhu");
	al.add(100);
	al.add(2001);
	al.add(12.3f);
	al.add(true);
	al.add(14.5);
	System.out.println("After inserting values"+al);
	
	//using index value
	al.add(0,"prathana");
	System.out.println("inserting using index value "+al);
	
	// al.contains(100);
	System.out.println(al.contains(100));
	System.out.println(al.contains(150));
	
	System.out.println(al.isEmpty());
	
	System.out.println(al.remove(3));
	System.out.println("size of the arraylist is "+al.size());
	
//	//for loop
//	for(int i=0;i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
	
//		for(Object o:al ) {
//			System.out.println(o);
//		}
		
		Iterator itr =al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());  // it will print the values
		}
		
		
	}
	}


