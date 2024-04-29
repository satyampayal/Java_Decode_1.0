package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
    static List<String> res;
    public static List<String> printPren(int n){
        res=new ArrayList<>();
        String s="";
        int ob=0;
        int cb=0;
        helper(n,s,ob,cb);
        return res;

    }

    public static void helper(int n,String s,int ob,int cb){

        if(n*2==s.length()){
       // System.out.println(s);
            res.add(s);
            return;
        }
        if(ob<n)
        helper( n, s+"(",ob+1,cb);
        if(cb<ob  )
        helper( n, s+")",ob,cb+1);

    }
    public static void main(String[] args) {

        System.out.println(printPren(3));
        
    }
}
