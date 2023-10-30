package queue;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("X");
        queue.add("Y");
        queue.add("Z");

        System.out.println("Queue using LinkedList:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

