package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    // recursion + memoziation
           public static int amount(int[] nums,int i,int[] dp) {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1 ) return dp[i];
        int take=nums[i]+ amount(nums,i+2,dp);
        
        int skip=amount(nums,i+1,dp);
        return  dp[i]=Math.max(take,skip);
        
    }
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
         return amount(nums,0,dp);
    }

    public static void main(String[] args) {
        int[] arr={5,15,6,20,22};
        System.out.println(rob(arr));
    }
}
