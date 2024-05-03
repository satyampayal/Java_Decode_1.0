package AdvanceSorting;

public class kthSmallest {
    static int ans;
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int correctIdx, int pidx) {
        int temp = arr[pidx];
        arr[pidx] = arr[correctIdx];
        arr[correctIdx] = temp;
    }

    public static int partation(int[] arr, int lo, int hi) {
        int pivot = arr[lo], pidx = lo;
        int smallerCount = 0;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot)
                smallerCount++;
        }
        int correctIdx = lo + smallerCount;

        // swap arr[pidx] & arr[cidx]
        swap(arr, pidx, correctIdx);

        // partation
        int i = lo, j = hi;
        while (i <= correctIdx && j > correctIdx) {
            if (arr[i] <= pivot)
                i++;
            else if (arr[j] > pivot)
                j--;
            else if (arr[i] > pivot && arr[j] <= pivot)
                swap(arr, i, j);
        }
        return correctIdx;

    }

    public static void quickSelect(int[] arr, int lo, int hi,int k) {
        if (lo >hi) return;
        if(lo==hi){
       if(lo==k-1){
        ans=arr[lo];
        return;
       }
        }
     
        //  arr[0] ko pivot banao or correct idx per lajao
        int idx = partation(arr, lo, hi);
        if(idx==k-1) {
            ans=arr[idx];
            return;
        }

        if((k-1)<idx) quickSelect(arr, lo, idx - 1,k);
        else  quickSelect(arr, idx + 1, hi,k);

    }

    public static void main(String[] args) {
        int[] arr = { 4,9,7,1,2,3,6 };
        int n = arr.length;
        int k=5;
        ans=0;
        print(arr);
        // for find ktn smallest
        quickSelect(arr, 0, n - 1,k);
        System.out.println(k+"th smalest  "+ans);
        //for kth largest element k=n-k+1
        k=2;
        quickSelect(arr, 0, n - 1,n-k+1);
        System.out.println(k+"th largest  "+ans);



    }
}
