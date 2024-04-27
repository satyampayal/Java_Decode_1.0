package Sorting;

public class DecresingBubbleSort {
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
        
        int[] arr={10,-4,20,1,8,-6};
        print(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        print(arr);
    }
}
