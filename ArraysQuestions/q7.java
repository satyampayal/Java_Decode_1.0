package ArraysQuestions;

public class q7 {
    public static void print(int[] arr){
        for (int i : arr) 
            System.out.print(i+" ");
        System.out.println();
    }
    public static void reverse(int[] arr,int i,int j){
        
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int arr[], int n)
    {
        reverse(arr,0,n-1);
        reverse(arr,1,n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        print(arr);
        rotate(arr, n);
        print(arr);

    }
}
