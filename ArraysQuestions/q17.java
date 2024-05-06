package ArraysQuestions;

public class q17 {

    // Not Proper Logic implmented
    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int i=0;
        int j=1;
        int count=0;
        while(i<n && j<n){
            if(i==j) j=i+1;
            else if(arr[i]+arr[j]==k) {
                count++;
                i++;
            }
            else{
                j++;
            }
        }

        while(i==n && j<n){
            if(arr[i-1]+arr[j]==k){
                count++;
            }
            j++;
        }
        while(j==n && i<n){
            if(arr[j-1]+arr[i]==k){
                count++;
            }
            i++;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int n=arr.length;
        int k=2;
        System.out.println(getPairsCount(arr, n, k));
    }
}
