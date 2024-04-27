package Sorting;

public class BubbleSort {
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;

    }
    public static void main(String[] args) {
        
        int[] arr={5,1,3,4,2};
        print(arr);
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j);

                }
                
            }
        }
        print(arr);

    }
}
