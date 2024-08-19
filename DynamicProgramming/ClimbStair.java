package DynamicProgramming;

public class ClimbStair {

    public int climb(int n, int[] dp) {

        if (n <= 3)
            return n;
        if (dp[n] != 0)
            return dp[n];
        return dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return climb(n, dp);

    }
}
