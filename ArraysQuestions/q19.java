package ArraysQuestions;

public class q19 {
    public static void print(int[] a){
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void rearrage(int[] arr,int n){
        
        int j=n-2;
        for(int i=0;i<n;i++){
            if(i%2==0){
                swap(arr,i,n-1);
                if(arr[n-2]<arr[n-1]){
                    swap(arr,n-2,n-1);
                }
            }
            else{
                swap(arr,i,n-1);
                if(j>i){
                    j--;
                }
            }

        }
    }
   public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9};
    int n=arr.length;
    print(arr);
    rearrage(arr, n);
    print(arr);
    
   } 
}
