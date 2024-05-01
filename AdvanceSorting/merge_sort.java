package AdvanceSorting;

public class merge_sort {
    public static void print(int[] arr){
        for (int i : arr) System.out.print(i+" ");

        System.out.println();
    }

    public static void merge(int[] a,int[] b,int[] ans){
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
    public static void mergeSort(int[] input){
        int n=input.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<a.length;i++) a[i]=input[i];
        for(int i=0;i<b.length;i++) b[i]=input[i+n/2];

        mergeSort(a);
        mergeSort(b);

        //now merge  array
        merge(a, b, input);
        // for efiicen Space comlexity
        a=null;
        b=null;


    }
    public static void main(String[] args) {
        int[] input={80,60,70,40,50,100,70};
        print(input);
        mergeSort(input);
        print(input);

    }
}
