package org.queues;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public  class Priority_queue{
    public static void main(String[] args) {

        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(4.10);
        priorityQueue.offer(431.0);
        priorityQueue.offer(91.8);
        priorityQueue.offer(0.410);
        priorityQueue.offer(789.4);
        priorityQueue.offer(5000.0);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()){
            priorityQueue.poll();
        }
        System.out.println(priorityQueue.peek());

        PriorityQueue<String> reverseSortedQueue = new PriorityQueue<>(Collections.reverseOrder());
        reverseSortedQueue.offer("K");
        reverseSortedQueue.offer("D");
        reverseSortedQueue.offer("X");
        reverseSortedQueue.offer("U");
        reverseSortedQueue.offer("A");
        reverseSortedQueue.offer("E");
        System.out.println(reverseSortedQueue);

    }
}