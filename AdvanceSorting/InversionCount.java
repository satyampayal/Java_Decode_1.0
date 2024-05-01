package AdvanceSorting;

public class InversionCount {
    static int count;
    public static void countInversion(int[]a,int[] b){
        int i=0;
        int j=0;
        while (i<a.length && j<b.length) {
            if(a[i]>b[j]){
                count+=(a.length-i);
                j++;
            }
            else i++;
            
        }
        

    }

    public static void merge(int[] a,int[] b ,int[] ans){

        int n=a.length+b.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) {
                ans[k]=b[j];
                k++;
                j++;
                // you can do this at side also
                count+=(a.length-i);// but this is for only Condition a[i]> b[j]
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

    public static void merge_sort(int[] input){
        int n=input.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<a.length;i++) a[i]=input[i];
        for(int i=0;i<b.length;i++) b[i]=input[n/2+i];

        merge_sort(a);
        merge_sort(b);

        // magic doing
        // sort them

        merge(a,b,input);

        // count inversion 
      //  countInversion(a, b);

    }
    public static void main(String[] args) {
        count=0;
     int[]  arr={80,70,60,50,40,30,20,10};
     merge_sort(arr);
     System.err.println(count);
    }
}
