package BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        
        int x=17;
        int lo=0,hi=x;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid==x/mid) break;
            else if(mid>x/mid) hi=mid-1;
            else lo=mid+1;
        }
        System.out.println(hi);
    }
}
