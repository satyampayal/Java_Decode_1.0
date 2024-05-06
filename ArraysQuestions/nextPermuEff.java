package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

public class nextPermuEff {
    static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static List<Integer> nextPermutation(int n, int arr[]) {
        // code here
        List<Integer> ans = new ArrayList<>();
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = n - 1; i > idx; i--) {
                if (arr[i] > arr[idx]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                    break;
                }
            }

            reverse(arr, idx + 1, n - 1);
            for (int i = 0; i < n; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }

        else {
            reverse(arr, idx + 1, n - 1);
            for (int i = 0; i < n; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
        int n=arr.length;
        System.out.println(nextPermutation(n, arr));

    }
}
