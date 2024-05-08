package ArraysQuestions;

import java.util.Arrays;

public class q20 {
    public    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int sum=0;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            temp[i]=sum;
            
            
        }
        // check duplicacy
        Arrays.sort(temp);
        for(int i=0;i<n-1;i++){
            if(temp[i]==temp[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={4,2,-3,1,6};
        int n=arr.length;
        System.out.println(findsum(arr, n));
        
    }
}
