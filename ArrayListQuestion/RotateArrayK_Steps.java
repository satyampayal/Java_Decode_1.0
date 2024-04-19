package ArrayListQuestion;

public class RotateArrayK_Steps {
    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,5,6,7 };
        // Rotate array k=2 ; 
        // means at k=1 --->> [50,10,20,30,40] .... complete reverse 50,40,30,20,10 then again reverse form index 1,  50,10,20,30,40
        // at k=2       ---> [50,40,10,20,30]  .... first complete reverse ,50,40,30,20,10 then at index 2 start reverse to end .. 50,40,10,20,30
        // at k=3       ---> [30,50,40,10,20]
        // at k=4       ---> [20,30,50,40,10]
        // means if k== arr.length // then after
        // rotate arr reach original postion
        int k=3;
         k=k%arr.length;
         System.out.println(k);
         int lp=0,rp=arr.length-1;
        
            
         // 2 step solution 
       if(k==0){
        for(int ele:arr){
            System.out.print(ele+" ");
         }
       }
       else{
        reverse(arr, lp, rp);
        reverse(arr, lp, k-1);
        reverse(arr, k, rp);
       }
   
           
          

         
        
         for(int ele:arr){
            System.out.print(ele+" ");
         }




    }
    public static void reverse(int[] arr,int lp,int rp){
        while(lp<rp){
            swap(arr, lp, rp);
            lp++;
            rp--;
        }
    }

    public static void swap(int arr[],int lp,int rp){
        int temp = arr[lp];
        arr[lp] = arr[rp];
        arr[rp] = temp;
    }
    
}
