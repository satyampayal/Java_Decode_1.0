package Sorting;

public class MoveZeroUsingBubble {
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

        int[] arr={1,0,4,0,2,-10,100,0,5};
        int n=arr.length;
        print(arr);
        int noz=0;
        for (int i : arr) {
            if(i==0){
                noz++;
            }
            
        }

        for(int i=0;i<noz;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    swap(arr,j);
                }

            }
        }

         print(arr);
    }
}
