package Heaps;

import java.util.PriorityQueue;

public class KthLagrest {
        public static void kthLargest(int[] arr,int k){
   PriorityQueue<Integer> pq=new PriorityQueue<>();
   for (int ele : arr) {
    pq.add(ele);
    if(pq.size()>k) pq.remove();
    
   }
   System.out.println(pq.peek());
    }
    public static void main(String[] args) {
        int[] arr={10,2,3,8,-4,-2,6};
        int k=3;
        kthLargest(arr,k);
    }
}
