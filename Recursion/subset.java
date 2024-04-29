package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subset {
   static  ArrayList<String> arr=new ArrayList<>();
   public static void printSubset(int i,String s,String ans){
    if(s.length()==i){
        // System.out.println(ans);
        arr.add(ans);
        return;
    }
    char ch=s.charAt(i);
    printSubset(i+1, s, ans);// not take
    printSubset(i+1, s, ans+ch);// take

   }
    static List<List<Integer>> result;// we need static 2D Array

     public static List<List<Integer>> subsets(int[] nums) {
        result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        helper(0,nums,ans);
        return result;
        
    }

    public static void helper(int i,int[] nums,List<Integer> ans){
        if(i==nums.length) {
            ArrayList<Integer> l=new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                l.add(ans.get(j));
            }
            result.add(l);
            return;
        }
        helper(i+1, nums, ans);// not take part
        ans.add(nums[i]);
        helper(i+1, nums, ans);// take
        ans.remove(ans.size()-1);
    }
     public static void main(String[] args) {
        // String s="abc";
        // printSubset(0, s, "");
        // System.out.println(arr);

        // array subSet
        int[] nums={1,2,3};
        subsets(nums);
        System.out.println(result);
        
     }
}