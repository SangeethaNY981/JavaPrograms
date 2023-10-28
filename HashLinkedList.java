package collectionExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashLinkedList {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add(108);
		hs.add(12.6);
		hs.add(1200);
		hs.add(67.4f);
		hs.add('A');
		System.out.println(hs);
		
//		System.out.println(hs.addFirst("Sathya"));
//		System.out.println(hs.addLast("Sathya"));
//		
//		
//		System.out.println(hs.removeFirst());
//		System.out.println(hs.removeLast());
		
		System.out.println(hs.add("Sathya"));
		System.out.println(hs.remove(1200));
		System.out.println("after removing "+hs);
		
		System.out.println(hs.contains(108));
		
		//for loop
		Object[] array = hs.toArray();
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
				}
				
					for(Object o:hs ) {
						System.out.println(o);
					}
					
					Iterator itr =hs.iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());  // it will print the values
					}

	}

}
