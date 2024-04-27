package Sorting;

public class KthSmallestElement {
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int findKthSmallest(int[] arr,int k){
      // we use selection sort 
      int n=arr.length;
      if(k>n){
        return -1;
      }
      int minStore=-1;
      for(int i=0;i<k;i++){
        // int minIdx=0;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            if( arr[j]>minStore &&arr[j]<min ){
                min=arr[j];
                // minIdx=j;
            }
        }
        minStore=min;
       

      }
      print(arr);

        return minStore;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        int k=6;

        int result=findKthSmallest(arr,k);

        System.out.println("Answaer is "+result);
    }
}
