package collectionExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add(null);
		System.out.println(ll);
		
	    ll.addFirst("sangeetha");
		ll.addLast("N");
		System.out.println(ll);
		
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		//for loop
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
//			for(Object o:ll ) {
//				System.out.println(o);
//			}
			
			Iterator itr =ll.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());  // it will print the values
			}
			
			
		
		
	}

}
