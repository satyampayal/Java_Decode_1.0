package Recursion;

public class TraversArray {
    public static void trvArr(int[] arr,int n){
        if(n<0) return;
        trvArr(arr, n-1);
        System.out.print(arr[n]+" ");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length-1;
        trvArr(arr, n);
    }
}
