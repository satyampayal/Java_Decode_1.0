package DynamicProgramming;

public class HouseRobber {
    public static int rob(int[] arr) {
        int maxAmount=-1;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int k=i+2;
            int temp=k;
            int sumAmount=0;
            for(int j=0;j<n-i-2;j++){
                while(k<n){
                     sumAmount+=arr[k];
                     k+=2;
                }
                maxAmount=Math.max(sumAmount,maxAmount);
                temp=temp+1;
                k=temp;
            }
        }
        return maxAmount;
        
    }

    public static void main(String[] args) {
        int[] arr={5,15,6,20,22};
        System.out.println(rob(arr));
    }
}
