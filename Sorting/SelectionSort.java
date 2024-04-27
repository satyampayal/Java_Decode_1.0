package Sorting;

public class SelectionSort {
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
        for(int i=1;i<=n-1;i++){
            int minIdx=i-1;
            int min=arr[i-1];
            for(int j=i;j<n;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIdx=j;
                }
            }
            swap(arr, i-1, minIdx);
        }
        print(arr);
    }
}
