package ArraysQuestions;

public class q1 {
    public static void print(int[] arr){
        for (int i : arr) 
            System.out.print(i+" ");
        System.out.println();
    }
    public static void reverse(int[] arr,int i,int ele){
        if((arr.length-1)==i) {arr[0]=arr[i]; return;}
       
        reverse(arr, i+1, arr[i+1]);
        arr[arr.length-i-1]=ele;

    }
    public static void main(String[] args) {
        int[] arr={3};
        print(arr);
        reverse(arr, 0, arr[0]);
        print(arr);

    }
}
