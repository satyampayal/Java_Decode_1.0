package PrefixSum;

public class FindPivot {
    static void print(int[] prin){
        for (int i : prin) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static  int pivotIndex(int[] nums) {
        int n=nums.length;
       
        if(n==1) return 0;
        int pre[] =new int[n];
        int pos[] =new int[n];
        pos[n-1]=nums[n-1];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=nums[i]+ pre[i-1];
        }
         for(int i=n-2;i>=0;i--){
            pos[i]=nums[i]+ pos[i+1];
        }
     for(int i=0;i<n;i++){
           if(pre[i]==pos[i]) {
           
            return i;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
       System.out.println( pivotIndex(nums));
    }
}
