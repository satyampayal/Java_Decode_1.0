package HashMaps;
import java.util.HashMap;

public class COuntNocepair {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
    public static  int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

  int count=0;
  int  n=nums.length;
  for(int i=0;i<n;i++){
    int iRev=reverse(nums[i]);
    nums[i]=nums[i]-iRev;
    System.out.println(nums[i]);
    if(map.containsKey(nums[i])) {
           count+=map.get(nums[i]);
           map.put(nums[i],map.get(nums[i])+1);
    }
    else map.put(nums[i],1);

    // for(int j=i+1;j<n;j++){
    //     int jRev=reverse(nums[j]);
    //     System.out.println("At "+i+" "+j+" "+(nums[i]+jRev));
    //     System.out.println("At "+i+" "+j+" "+(nums[j]+iRev));
    //     if((nums[i]+jRev)==(nums[j]+iRev)) count++;
    // }
  }
        return count;
        
    }
    public static void main(String[] args) {
        int[] nums={13,10,35,24,76};
        System.out.println(countNicePairs(nums));

    
        
    }
}
