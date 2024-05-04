package ArraysQuestions;

public class q8 {
    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static int maxSubArraySum(int[] arr, int n) {
        int sum = Integer.MIN_VALUE;
        int curSum = 0;
        int strIdx = 0;
        int endIdx = 0;

        for (int i = 0; i < n; i++) {
             curSum=Math.max(arr[i],arr[i]+curSum);
            // if (curSum <= curSum + arr[i])
            //     curSum = curSum + arr[i];
            // else if {
            //     curSum = arr[i];
            //     strIdx = i;
            // }
         

             if (curSum > sum) {
                sum = curSum;
                endIdx=i;
            }
        }

        System.out.println("Start Idx"+strIdx+" Last Idx "+endIdx);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1,-2,5,-3,4,-1,6};
        int n = arr.length;
        print(arr);
        System.out.println(maxSubArraySum(arr, n));

    }
}
