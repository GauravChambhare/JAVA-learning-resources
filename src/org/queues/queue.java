package org.queues;
import java.util.LinkedList;
import java.util.Queue;
public class queue {
//    queue is an interface in JAVA and not an in built class.
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Batata Vada");
        queue.offer("Sambar Vada");
        queue.offer("Dahi Vada");
        queue.offer("Rassam Vada");
        queue.offer("Medu Vada");
        queue.offer("Dal Vada");
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
        
    }
}
