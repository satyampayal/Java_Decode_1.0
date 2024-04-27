package BinarySearch;

public class FindFstlstOccur {
 public static void main(String[] args) {
    int[] arr={5,7,7,8,8,10};
    int[] result={-1,-1};
    int n=arr.length;
    int x=8;
    // return  first occurence of x and last occurence of x 
    // int lb=-1,ub=0;
    int lo=0,hi=n-1;

    // while(lo<=hi){
    //     int mid=lo+(hi-lo)/2;
    //   if(arr[mid]>=x) {
    //     if(arr[mid]==x){
    //         lb=mid;
    //     }
    //     hi=mid-1;    
    // }
    //   else lo=mid+1;
    // }
    // // reset low and high
    // lo=0;
    // hi=n-1;
    // while(lo<=hi){
    //     int mid=lo+(hi-lo)/2;
    //   if(arr[mid]>x) {
    //     ub=mid;
    //     hi=mid-1;    
    // }
    //   else lo=mid+1;
    // }


    int fp=-1;
    int lp=-1;
    while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==x){
            boolean flag=true;
             fp=mid;
            lp=mid;
            while(fp>=0 && lp<n-1 ){
                if(fp>=1 && flag==true){
                    if(arr[fp-1]==x) fp--;
                    else flag=false;
                }
               
                else if(arr[lp+1]==x) lp++;
                else break;
            }
            break;
        }
        else if(arr[mid]>x) hi=mid-1;
        else lo=mid+1;
    }
    result[0]=fp;
    result[1]=lp;
    System.out.println("First Position:"+result[0]);
    System.out.println("last Position:"+result[1]);
 }

}
