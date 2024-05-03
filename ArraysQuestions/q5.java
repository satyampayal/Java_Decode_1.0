package ArraysQuestions;

public class q5 {
    public static void print(int[] arr){
        for (int i : arr) 
            System.out.print(i+" ");
        System.out.println();
    }
    public static void segregateElements(int a[], int n) {
        // Your code goes here
        int[] b=new int[n];
        int i=0;
        int j=n-1;
        int lo=0;
        int hi=n-1;
        while(i<=j && lo<n && hi>=0){
            if(a[lo]>=0){
                b[i]=a[lo];
                lo++;
                i++;
                
            }
            else   lo++;
             if(a[hi]<0){
                b[j]=a[hi];
                j--;
                hi--;
            }
             else {
              
                hi--;
            }
          
        }
        // System.out.println("High last value"+lo);
        // print(b);
        for(int k=0;k<n;k++){
            a[k]=b[k];
        }
    }
    public static void main(String[] args) {
        int[] a={1, -1, 3, 2, -7, -5, 11, 6 };
        int n=a.length;
        print(a);
        segregateElements(a, n);
        print(a);
    }
}
