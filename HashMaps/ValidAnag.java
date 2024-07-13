package HashMaps;

import java.util.HashMap;

public class ValidAnag {
    public static boolean check(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i)))
            map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            else map1.put(s.charAt(i), 1);
        }
        
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i)))
            map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
            else  map2.put(t.charAt(i),1);
        }

        System.out.println(map1);
        System.out.println(map2);
        for (Character c : map1.keySet()) {
            if(map1.get(c)!=map2.get(c)){
                return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {

        String s="anagram";
        String t="nagaam";
        System.out.println(check(s, t));

       
    }
}
