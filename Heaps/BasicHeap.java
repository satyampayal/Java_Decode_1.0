package Heaps;

import java.util.PriorityQueue;

public class BasicHeap {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.remove();
        pq.add(0);
        System.out.println(pq);
    }
}
