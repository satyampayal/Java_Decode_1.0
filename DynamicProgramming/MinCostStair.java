package DynamicProgramming;

public class MinCostStair {
    // By Recursion 
    // public int minCost(int i,int[] cost){
    //     if(i<=1) return  cost[i];
    
    //     int minCost=cost[i] + Math.min(minCost(i-1,cost),minCost(i-2,cost));
    //     return minCost;
    //    }
    //     public int minCostClimbingStairs(int[] cost) {
    //         return Math.min(minCost(cost.length-1,cost),minCost(cost.length-2,cost));  
    //     }

        // by Recurssion+ Memozation 
        static int[] dp;
        public int minCost(int i,int[] cost){
     
         if(i<=1) return  cost[i];
      if(dp[i]!=-1) return dp[i];
         int minCost=cost[i] + Math.min(minCost(i-1,cost),minCost(i-2,cost));
         dp[i]=minCost;
         return minCost;
        }
         public int minCostClimbingStairs(int[] cost) {
             dp=new int[cost.length];
             for(int i=0;i<cost.length;i++){
                 dp[i]=-1;
             }
             return Math.min(minCost(cost.length-1,cost),minCost(cost.length-2,cost));  
         }
}
