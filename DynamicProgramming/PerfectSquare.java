package DynamicProgramming;

public class PerfectSquare {
    public static boolean isPrefectSqure(int n){
        int s=(int)(Math.sqrt(n));
        return s*s==n;
    }
    public static int numSquare(int n){
        if(isPrefectSqure(n)) return 1;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n/2;i++){
            int count=numSquare(i)+numSquare(n-i);
            min=Math.min(min,count);
        }
        return min;

    }
    public static void main(String[] args) {
        System.out.println(numSquare(13));
    }
}
