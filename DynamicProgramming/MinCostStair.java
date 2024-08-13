package DynamicProgramming;

public class MinCostStair {
    // By Recursion 
    public int minCost(int i,int[] cost){
        if(i<=1) return  cost[i];
    
        int minCost=cost[i] + Math.min(minCost(i-1,cost),minCost(i-2,cost));
        return minCost;
       }
        public int minCostClimbingStairs(int[] cost) {
            return Math.min(minCost(cost.length-1,cost),minCost(cost.length-2,cost));  
        }
}
