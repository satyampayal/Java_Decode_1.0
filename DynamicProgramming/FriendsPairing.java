package DynamicProgramming;

import java.util.Scanner;

public class FriendsPairing {
    public static int frineds(int n,int[] dp){
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n]=frineds(n-1,dp) + (n-1)*frineds(n-2,dp);
    }
    public static int byTabulation(int n){
        int[] dp=new int[n+1];
        dp[1]=1;
       if(n>=2)  dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+ (i-1)*dp[i-2];


        }
        return dp[n];
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[]  dp=new int[n+1]; 
    System.out.println(frineds(n,dp));
    System.out.println(byTabulation(n));

        sc.close();
    }
}
