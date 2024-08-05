package PrefixSum;

public class Penalty {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int[] pre=new int[n+1];
        int[] suf=new int[n+1];
        int j=1;
        for(int i=0;i<n;i++){
              if(customers.charAt(i)=='N') pre[j]= pre[j-1] +1;
              else  pre[j]+=pre[j-1];
              j++;
        }
        for(int i=n-1;i>=0;i--){
            if(customers.charAt(i)=='Y') suf[j]= suf[j+1] +1;
            else suf[j]+=suf[j+1];
            j++;
      }

      int[] ans=new int[n+1];
      for(int i=0;i<=n;i++){
        ans[i]=pre[i]+suf[i];
      }
      int minPenaltyIndx=0;
      for(int i=1;i<=n;i++){
        if(ans[i]<ans[minPenaltyIndx]) minPenaltyIndx=i;

      }
      return minPenaltyIndx;
        
    }
    
}
