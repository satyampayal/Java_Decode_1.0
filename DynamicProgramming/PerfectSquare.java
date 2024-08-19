package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPrefectSqure(int n){
        int s=(int)(Math.sqrt(n));
        return s*s==n;
    }
    public static int numSquare(int n, int[] dp){
        if(isPrefectSqure(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n/2;i++){
            int count=numSquare(i,dp)+numSquare(n-i,dp);
            min=Math.min(min,count);
        }
        return  dp[n]= min;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(numSquare(n,dp));
        sc.close();
    }
}
