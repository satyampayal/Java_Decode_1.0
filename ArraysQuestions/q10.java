package ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class q10 {
       public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
         ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<n-1){
            if(arr[i]==arr[j]){
                if(res.size()==0 || res.get(res.size()-1)!=arr[i])
                { res.add(arr[i]);
                i=j+1;
                j=i+1;
                    
                }
                else {
                    i=j+1;
                    j=i+1;
                }
                 
                 
                
            }
            else {
                i++;
                j++;
            }
        }
         if(res.size()==0  )
     {     res.add(-1);
       return res;
    }
         else return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,3};
       
        int n=arr.length;
        System.out.println(duplicates(arr, n));

    }
    
}
