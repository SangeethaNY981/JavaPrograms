package queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(3);
        queue.add(7);

//        System.out.println("Queue using PriorityQueue (priority order):");
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
            
//            System.out.println(queue.element()); //it will print the first element it will not remove
//    		System.out.println(queue);
    		
//    		System.out.println(queue.poll()); //return the first value then it will remove
//    		System.out.println(queue);
    		
    		System.out.println(queue.peek()); //return the first value then it will remove
    		System.out.println(queue);
        }
    }

