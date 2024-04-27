package Sorting;

public class PushZeroesEnd {
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[] arr={1,0,4,0,2,-10,100,0,5};
        int[] result=new int[arr.length];
        print(arr);

        // count zeroes
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int idx=0;
// push all non-zero number in solution
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
              result[idx]=arr[i];
              idx++;
            }
        }

        while (count!=0) {
            result[idx]=0;
            idx++;
            count--;

            
        }
        print(result);
        

    }
}
