package AdvanceSorting;
public class MergeTwoSortedArray {

    public static void print(int[] arr){
        for (int i : arr) System.out.print(i+" ");

        System.out.println();
    }
    public static  void merge(int[] a,int[] b,int[] ans){
        int n=a.length+b.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) {
                ans[k]=b[j];
                k++;
                j++;
            }
            else{
                ans[k]=a[i];
                i++;
                k++;
            }
        }

        while(i==a.length && k<n){
            ans[k]=b[j];
            j++;
            k++;
        }
        while(j==b.length && k<n){
            ans[k]=a[i];
            i++;
            k++;
        }

   
    
    }
    public static void main(String[] args) {
        
        int[] a={40,50,60,70};
        int[] b={10,20,30,80};
        int[] ans=new int[a.length+b.length];
        merge(a, b, ans);

        print(ans);


    }
}
