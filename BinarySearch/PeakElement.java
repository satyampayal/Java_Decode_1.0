package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60,70,20,10};
        // int max=Integer.MIN_VALUE;
        int n = arr.length;
        int maxIdx = -1;
        // linear search T.C= O(n)
        // for(int i=0;i<n;i++){
        // if(arr[i]>max){
        // max=arr[i];
        // maxIdx=i;
        // }
        // }

        // Binary Search
        int lo = 1;
        int hi = n - 2;
        while (lo <= hi) {
            int mid = lo + (hi -lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                maxIdx = mid;
                break;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        System.out.println("Maximum Peak:" + maxIdx);

    }
}
