package SlidinWindow;

class LongestArrayWith1AfterRemove0{
    public static  void longestSubArrayWith1(int[] arr){
        int i=0,j=0,maxLen=0,zeroes=0;
        int n=arr.length;
        while(j<n){
            while(j<n && arr[j]!=0) j++;
           if (j<n)  zeroes++;
            if(zeroes>1){
                maxLen=Math.max(maxLen,j-i-1);
                while(arr[i]!=0) i++;

                i++;
                zeroes--;
            }
            j++;
        }
            maxLen=Math.max(maxLen,j-i-2);

        
        System.out.println("lOngest :"+maxLen);
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,1,0,1,1};
        longestSubArrayWith1(arr);
        
    }
}