package ArrayListQuestion;

public class Sort0_1_2byDutch {
    public static void main(String[] args) {
           // int[] arr={0,1,2,0,1,2,1,2,0,0};
        // output-->> 0,0,0,0,1,1,1,2,2,2

      //method-1  // we can also first count no.OfZeroes,no>ofOne's,no.OfTwo's
      //method-2  //Dutch Flag Algorithm ... 3 Pointer approach ..low,mid,high...apply condition on mid
         int[] arr={0,1,2,0,1,2,1,2,0,0};
        // output-->> 0,0,0,0,1,1,1,2,2,2
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(low<=mid && mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
     
for (int i : arr) {
    System.out.print(i+" ");
    
}

    }
    public static  void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
