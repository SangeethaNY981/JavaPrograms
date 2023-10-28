package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Name");
		ll.add(109);
		ll.add(27.4);
		ll.add(56.4f);
		ll.add(true);
		System.out.println(ll);
		
		//add First,add Last()
		ll.addFirst("sangeetha");
		ll.addLast("N.Y");
		
		System.out.println(ll);
		
//		//removeFirst,removeLast
		
		
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println("after removing "+ll);
		

	}

}
