package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("cat");
		al.add("Dog");
		al.add("cow");
		al.add("Goat");
		System.out.println(al);
		
		//copying values from one arraylist to another
		ArrayList<String> al1 =new ArrayList<String>();
		al1.addAll(al);
		System.out.println(al1);
		
		//removeAll()
		System.out.println(al1.removeAll(al));
		System.out.println(al1);

	}

}
