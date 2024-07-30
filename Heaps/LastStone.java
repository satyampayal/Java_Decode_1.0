package Heaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStone {
    static public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int ele:stones){
            arr.add(ele);
        }
        while(arr.size()>1){
            Collections.sort(arr);
            int x=arr.remove(arr.size()-1);
            int y=arr.remove(arr.size()-1);
            if(x!=y)
              arr.add(x-y);
        }
        if(arr.size()==0) return 0;
        else return arr.get(0);
        

        // by heap
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // while(pq.size()>1){
        //     int x=pq.remove();
        //     int y=pq.remove();
        //     if(x!=y)
        //     pq.add(x-y);

        // }
        // if(pq.size()==1) return pq.peek();
        // else return 0;
    }
}
