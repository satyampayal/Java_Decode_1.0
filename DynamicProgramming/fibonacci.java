package DynamicProgramming;

public class fibonacci {
    static int[] dp;
    public static int fibo(int n) {
       if(n<=1) return n;
       if(dp[n]!=0) return dp[n];
      int ans= fibo(n-1)+ fibo(n-2);
      dp[n]=ans;
      return ans;
  }
  public static  int fib(int n) {
      dp=new int[n+1];
      return fibo(n);
  }
  public static void main(String[] args) {
     System.out.println(fib(6));
  }
}
