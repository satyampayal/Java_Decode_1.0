package Sorting;

public class ReplaceByZeroToN {
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int minIdx){
        int temp=arr[i];
        arr[i]=arr[minIdx];
        arr[minIdx]=temp;

    }
    public static void main(String[] args) {
        int[] arr={54,11,28,47,91,63};
        int n=arr.length;
        print(arr);

 
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int minIdex=0;
            for(int j=0;j<n;j++){
                if(arr[j]>=i && arr[j]<min){
                    min=arr[j];
                    minIdex=j;

                }
            }
            arr[minIdex]=i;
          

        }
        print(arr);
        
    }
}
