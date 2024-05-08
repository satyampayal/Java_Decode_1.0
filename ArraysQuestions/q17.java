package ArraysQuestions;

public class q17 {

    // Not Proper Logic implmented
    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int i = 0;
        int j = 1;
        int count = 0;
        while (i < n && j < n) {
            if (i == j)
                j = i + 1;
            else if (arr[i] + arr[j] == k) {
                count++;
                i++;
            } else {
                j++;
            }
        }

        while (i == n && j < n) {
            if (arr[i - 1] + arr[j] == k) {
                count++;
            }
            j++;
        }
        while (j == n && i < n) {
            if (arr[j - 1] + arr[i] == k) {
                count++;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        // 49 50
        // 48 24 99 51 33 39 29 83 74 72 22 46 40 51
        // 67 37 78 76 26 28 76 25 10 65 64 47 34 88
        // 26 49 86 73 73 36 75 5 26 4 39 99 27 12 97
        // 67 63 15 3 92 90
        // correct o/p--> 7
        int[] arr = { 1, 1, 1, 1 };
        int n = arr.length;
        int k = 2;
        System.out.println(getPairsCount(arr, n, k));
    }
}
