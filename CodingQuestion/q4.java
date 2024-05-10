package CodingQuestion;

import java.util.HashMap;

public class q4 {
    public static int fact(int n){
        if(n==0 || n==1 ) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        String s="abcc";
        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            int count=mp.containsKey(s.charAt(i))? mp.get(s.charAt(i)):0;
            mp.put(s.charAt(i), count+1);
        }

        int ans=fact(s.length());
        for(int freq:mp.values()){
            ans=ans/fact(freq);
         
        }
        System.out.println(ans);
    }
}
