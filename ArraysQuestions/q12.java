package ArraysQuestions;

import java.util.Arrays;

public class q12 {
    public static void print(long[] arr) {
        for (long i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void merge(long[] a, long[] b, int n, int m) {
        if (b[0] > a[n - 1])
            return;
        int i = 0, j = 0;
        while (i < n) {

            if (a[i] >= b[j]) {
                long temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i++;
                Arrays.sort(b);
            } else {
                i++;
            }
        }
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        long[] a = { 1, 3, 5, 7 };
        long b[] = { 0, 2, 6, 8, 9 };
        print(a);
        print(b);
        int n = a.length;
        int m = b.length;
        merge(a, b, n, m);
        System.out.println("After merge ");
        print(a);
        print(b);

    }
}
