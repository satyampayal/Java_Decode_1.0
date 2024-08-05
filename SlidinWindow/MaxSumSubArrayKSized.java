package SlidinWindow;

public class MaxSumSubArrayKSized {
    public static void slidingWindow(int[] arr,int k){
        int n=arr.length;
        int i=0,j=k-1,sum=0;
        int maxSum=0;
        for(int a=i;a<=j;a++) sum+=arr[a];

        i++;
        j++;
        maxSum=sum;
        while(j<n){
            sum=sum-arr[i-1]+arr[j];
            maxSum=Math.max(maxSum, sum);
            i++;
            j++;
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        // Brute Force 
        int[] arr={10,20,1,3,-40,80,20};
        int k=2;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int  tempSum=0;
            for(int j=i;j<i+k;j++){
                tempSum+=arr[j];
            }
            if(tempSum>maxSum) {
                maxSum=tempSum;
            }

        }

        System.out.println(maxSum);
        slidingWindow(arr, k);
       
    }
}
