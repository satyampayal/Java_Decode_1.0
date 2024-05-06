package ArraysQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q14 {

    static List<String> ans;
    // Brute force method T.C(n!*n)  ->> which much much bigger T.C
    public static void generatePermutation(String s,String res){
        if(s.length()==0){
            ans.add(res);
            return;

        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0, i);
            String right=s.substring(i+1);
            generatePermutation(left+right, res+ch);
        }
    }

      static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        String s="";
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
        }

        generatePermutation(s, "");
        // sort them
        Collections.sort(ans);
       int idx= ans.indexOf(s);
        if(idx==ans.size()-1){
            idx=0;

        }else idx=idx+1;
        String x= ans.get(idx);
        System.out.println(x);
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<x.length();i++){
            a.add((int)x.charAt(i)-48);
        }

        return a;

    }
    public static void main(String[] args) {
        ans=new ArrayList<>();
        int arr[]={3,1,1};
        int n=arr.length;
       System.out.println( nextPermutation(n, arr));

    }
    
}
