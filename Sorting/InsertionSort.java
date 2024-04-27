package Sorting;

public class InsertionSort {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1 };
        int n = arr.length;
        print(arr);

        for (int i = 1; i < n ; i++) {
            if (arr[i] < arr[i - 1]) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        swap(arr, j, j - 1);

                    } else
                        break;
                }
            }
        }
        print(arr);

    }
}
