package ArraysQuestions;

import java.util.Arrays;

public class q9 {
    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        // code here
       Arrays.sort(arr);
       int res=arr[n-1] -arr[0];

       for(int i=1;i<n;i++){
         if(arr[i]-k<0) continue;
        int minHeight=Math.min(arr[0]+k, arr[i]-k);
        int maxheight=(int) Math.max(arr[n-1]-k,arr[i-1]+k);
        res=(int)Math.min(res,maxheight-minHeight);
       }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,5,8,10};
        print(arr);
        int n=arr.length;
        int k=2;
       System.out.println( getMinDiff(arr, n, k));

    }
    
}
