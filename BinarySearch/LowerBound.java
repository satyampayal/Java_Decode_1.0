package BinarySearch;

public class LowerBound {
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
        int lb=n;
        /*
        if(x<arr[0]){
            System.out.println(0);
        }
        else if(x>arr[high]) System.out.println(n);
        else{
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==x) {
                    // check repeatation 
                    int idx=mid;
                    while(idx<n){
                        if(arr[idx+1]==arr[mid]) idx++;
                        else break;
                    }
                    System.out.println(idx); break;
                }
                else if(low+1==mid){
                    if(x>arr[low] && x<arr[mid]){
                        System.out.println(mid);
                        break;
                    }
                }
                else if(arr[mid]>x) high=mid;
                else low=mid;
            }
        }
         */
        while(low<=high){
            int mid=low+(high-low)/2;
        if(arr[mid]>=x){
            lb=mid;
            high=mid-1;
        }
        else low=mid+1;
        }

        System.out.println(lb);
    }

}
