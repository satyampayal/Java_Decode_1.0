package ArraysQuestions;

public class q16 {
    public static void maxProfit(int[] arr, int n) {
        int mxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[j] - arr[i];
                if (temp > mxProfit) {
                    mxProfit = temp;
                }

            }
        }
        System.out.println(mxProfit);
    }

    public static void main(String[] args) {
        int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
        int n = arr.length;
        maxProfit(arr, n);

        int profit=0;
        int mini=arr[0];
        for(int i=1;i<n;i++){
            int cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }

        System.out.println(profit);
    
    }
}
