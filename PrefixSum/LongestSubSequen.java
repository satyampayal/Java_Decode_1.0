package PrefixSum;

import java.util.Arrays;

public class LongestSubSequen {
        public static  int[] answerQueries(int[] nums, int[] queries) {
       Arrays.sort(nums);
       // prefix
       for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
       }
        // Binary Search
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int lo=0;
            int hi=nums.length-1;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(nums[mid]>queries[i]) hi=mid-1;
                else{
                    ans[i]=Math.max(ans[i], mid+1);
                    lo=mid+1;

                }
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums={4,5,2,1,2,7};
        int[] queries={5,10,11};
        int[] ans=answerQueries(nums,queries);
        for (int i : ans) {
            System.out.print(i+" ");
            
        }
    }
}
