package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void kthMinimum(int[] arr,int k){
   PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
   for (int ele : pq) {
    pq.add(ele);
    if(pq.size()>k) pq.remove();
    
   }
   System.out.println(pq.peek());
    }
    public static void main(String[] args) {
        int[] arr={10,2,3,8,-4,-2,6};
        int k=5;
        kthMinimum(arr,k);
        
    }
}
