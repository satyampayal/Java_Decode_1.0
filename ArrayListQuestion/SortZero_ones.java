package ArrayListQuestion;

public class SortZero_ones {
    public static void main(String[] args) {
        int[]  arr={1,0,0,1,1,1,0,0,1,0};
        int lp=0;
        int rp=arr.length-1;
        while(lp<rp){
            if(arr[lp]==1 ){
                if(arr[rp]==0)
                {
                    arr[lp]=0;
                    arr[rp]=1;
                    lp++;
                    rp--;
                }else{
                    rp--;
                }
               
            }
            else{
                lp++;
            }

        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }

    }
}
