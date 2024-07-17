package Heaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KClosestPoints {
    static  class   Pair{
        public int x;
        public int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static  int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Pair> map=new HashMap<>();
        int n=points.length;
        for(int a=0;a<n;a++){
            int x=points[a][0]*points[a][0]+points[a][1]*points[a][1];
            pq.add(x);
            map.put(x,new Pair(points[a][0],points[a][1]));
            if(pq.size()>k){
              pq.remove();
            }
        }
        for(int i=0;i<k;i++){
            int key=pq.remove();
            Pair coors=map.get(key);
            ans[i][0]=coors.x;
            ans[i][1]=coors.y;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[][] arr={ {1,3},{-2,2}};
        int k=1;
        int[][] ans=kClosest(arr,k);
        for(int[] temp:ans){
            for(int ele:temp){
                System.out.print(ele+" ");

            }
            System.out.println();
        }

        
    }
}
