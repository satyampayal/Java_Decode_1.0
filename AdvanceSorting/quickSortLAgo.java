package AdvanceSorting;

public class quickSortLAgo {
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

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        // arr[0] ko pivot banao or correct idx per lajao
        int idx = partation(arr, lo, hi);

        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, hi);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 7, 1, 2, 3, 1, 5, 8 };
        int n = arr.length;
        print(arr);
        quickSort(arr, 0, n - 1);
        print(arr);

    }
}
