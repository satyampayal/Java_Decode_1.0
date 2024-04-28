package BinarySearch;
public class RotatedSortedArray {
    public static int bs(int[] arr,int lo,int hi,int x){
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x) { return mid;}
            else if(arr[mid]>x) hi=mid-1;
           else lo=mid+1;
        }


        return -1;
    }

    public static int search(int[] arr,int x){
        int n=arr.length;
        if(n<=2){
            for(int i=0;i<n;i++){
                if(arr[i]==x) return i;
            }
            return -1;
        }
        int lo=1;
        int hi=n-2;
        int p=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) { p=mid; break;}
            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){ p=mid-1;break;}
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                if(arr[mid]>arr[n-1]) lo=mid+1;
                else hi=mid-1;
            }
        }
        if(p==-1){
            // means array is never rotated
            return bs(arr, 0, n-1, x);
        }
        int left=bs(arr, 0, p, x);
        if(left!=-1){
            return left;
        }
        return bs(arr, p+1, n-1, x);


        
    }
    public static void main(String[] args) {
        int[] arr={1,3,5};
        int x=0;
        // int result =search(arr, x);
        // System.out.println(result);;
        
        // using single BS
        int n=arr.length;
        // if(n<=3){
        //     for(int i=0;i<n;i++){
        //         if(arr[i]==x) {return i;}
        //     }
        //     return -1;
        // }
        int lo=0;
        int hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x) { ans=mid; break;}
            else if(arr[mid]<arr[hi]){
                if(arr[mid]<=x && arr[hi]>=x) lo=mid+1;
                else hi=mid-1;
            }
            else if(arr[mid]>arr[hi]){
                if(arr[lo]<=x && arr[mid]>=x) hi=mid-1;
                else lo=mid+1;
            }
        }
        System.out.println(ans);


        
    }
}
