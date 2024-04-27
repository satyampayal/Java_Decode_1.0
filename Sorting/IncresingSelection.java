package Sorting;

public class IncresingSelection {

    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int maxIdx){
        int temp=arr[i];
        arr[i]=arr[maxIdx];
        arr[maxIdx]=temp;

    }
    public static void main(String[] args) {
    int[] arr={10,-4,20,1,8,-6};
    int n=arr.length;
    print(arr);
    for(int i=0;i<n-1;i++){
        int maxIdx=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<n-i;j++){
            if(arr[j]>max){
                max=arr[j];
                maxIdx=j;
            }
        }
        swap(arr, n-i-1, maxIdx);
    }
    print(arr);

    
        
    }
}
