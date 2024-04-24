package StringPackage;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str="anagram";
        String check="nagaram";

        boolean result=isAnagaram( str, check);
        System.out.println(result);
    }
    public static boolean isAnagaram(String a,String b){
        if(a.length()!=b.length()){
            return false;
          }
        
      else {  char[] first=a.toCharArray();
        char[] second=b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
          for(int i=0;i<a.length();i++){
            if(first[i]==second[i]){
                continue;
            }
            else{
                return false;
            }
          }
}
        return true;

    }
}
