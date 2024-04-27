package BinarySearch;

public class BinarySearchAlgo {

    public static void binarySrch(int[] arr,int target,int lb,int hb){

        // simply Method 
        // while(lb<=hb){
        // int mid=(lb+hb)/2;
        //     if(arr[mid]==target){
        //         System.out.println("True");
        //       break;
        //     }
        //     else{
        //         if(arr[mid]>target){
        //              hb=mid-1;
        //         }
        //         else{
        //           lb=mid+1;
        //         }
        //     }
        // }
        
// recurrsion Using
        int mid=(lb+hb)/2;
        if(lb>hb){
            System.out.println("False");
            return ;
        }
        if(arr[mid]==target){
           System.out.println("True");
        }
        else if(arr[mid]>target) binarySrch(arr, target, lb, mid-1);
        else binarySrch(arr, target, mid+1, hb);
         
    }
    public static void main(String[] args) {
        
        int[] arr={10,15,21,34,81,105,180,500};
        int target=21536;
        binarySrch(arr, target, 0, arr.length-1);

    }
}
