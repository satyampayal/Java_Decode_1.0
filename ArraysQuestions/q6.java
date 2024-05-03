package ArraysQuestions;

public class q6 {
    public static void print(int[] arr){
        for (int i : arr) 
            System.out.print(i+" ");
        System.out.println();
    }
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int count=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                count++;
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                count++;
                j++;
            }
            else{
                count++;
                i++;
            }
        }
        while (i<n && j==m ) {
            count++;
            i++;
            
        }
        while (i==n && j<m) {
            count++;
            j++;
            
        }


        return count;
    }
   public static void main(String[] args) {
    int a[]={1,2,3,4};
    int[] b={1,2,3,4,5};
    int n=a.length;
    int m=b.length;
    System.out.println(doUnion(a,n,b,m));


   } 
}
