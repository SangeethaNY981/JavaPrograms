package queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
//duplicates are allowed
//FIFO
public class CollectionsQueueExample {

	public static void main(String[] args) {
	
// is a double-ended queue that can be used as a queue using the offer, poll, and peek methods.	
		ArrayDeque<Integer> ob = new ArrayDeque<>();
		// Queue ob=new LinkedList();
		ob.add(8);
		ob.add(2);
		ob.add(3);
		ob.add(2);
		ob.add(3);
        ob.add(9);
      System.out.println(ob);
        
        
        //First element will be removed
       System.out.println(ob.remove());
       System.out.println(ob);
//       System.out.println(ob.remove());
//       System.out.println(ob);
//     System.out.println(ob.removeFirst()); 
//       
		//just like add method
		ob.offer(4);
		ob.offer(12);
		ob.offer(6);
		ob.offer(7);
		ob.offerFirst(10);
		ob.offerLast(9);
		System.out.println(ob);
		
		
//		System.out.println(ob.element()); //it will print the first element it will not remove
//		System.out.println(ob);
//		
//		System.out.println(ob.poll()); //return the first value then it will remove
//		System.out.println(ob);
		
//		System.out.println(ob.peek()); //return the first value then it will remove
//		System.out.println(ob);
//		
		
//		//to display the data
//		for(Object o:ob) {
//			System.out.println(o);
//		}
//		
//		Iterator<Integer> itr = ob.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}

}
