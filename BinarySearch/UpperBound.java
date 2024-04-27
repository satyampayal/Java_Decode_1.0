package BinarySearch;

public class UpperBound {
    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,30,30,30,30,60,70};
        print(arr);
        int x=30;
        
        int n=arr.length;
        int low=0,high=n-1;
        int ub=n;
        while(low<=high){
            int mid=low+(high-low)/2;
        if(arr[mid]>x){
            ub=mid;
            high=mid-1;
        }
        else low=mid+1;
        }

        System.out.println(ub);
    }
}
