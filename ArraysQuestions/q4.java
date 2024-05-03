package ArraysQuestions;

public class q4 {

    public static void print(int[] a){
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void sort012(int a[])
    {
        // code here 
        int lo=0;
        int hi=a.length-1;
        int i=0;
        while(i<=hi){
            if(a[i]==0){
                swap(a,i,lo);
                lo++;
                i++;
                
            }
            else if(a[i]==2){
                if(a[hi]!=2) swap(a,i,hi);
                   hi--;
            }
            else if(a[i]==1) i++;
        }
    }
    public static void main(String[] args) {
        
        int[] a={2,1,0};
        print(a);
        sort012(a);
        print(a);
    }
}
