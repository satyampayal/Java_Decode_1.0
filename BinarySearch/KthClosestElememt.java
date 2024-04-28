package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthClosestElememt {

        public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result=new ArrayList<>();
        int n=arr.length;
        if(x<=arr[0]){
            for(int i=0;i<k;i++){
                result.add(arr[i]);
            }
            return result;
        }

           if(x>=arr[n-1]){
            for(int i=n-k;i<n;i++){
                result.add(arr[i]);
            }
            return result;
        }

        // find lb
        int lb=-1;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }

        int i=lb-1;
        int j=lb;
        while(k>0 && i>=0 && j<n){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj){
                result.add(arr[i]);
                i--;
               
            }
            else{
                result.add(arr[j]);
                j++;
            }
             k--;
        }

        while(i<0 && k>0){
            result.add(arr[j]);
            j++;
            k--;
        }
        while(j==n && k>0){
            result.add(arr[i]);
            i--;
            k--;
        }

// collection sort
         Collections.sort(result);
        return result;
        
        
    }
    public static void main(String[] args) {
        
    }
}
