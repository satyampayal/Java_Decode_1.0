package StringPackage;

import java.util.Arrays;

public class MaxCharOccurence {
    public static void main(String[] args) {
        String str="aaabbdiedbsjs";
        char[] ch=str.toCharArray();
         Arrays.sort(ch);
         int max=0;
         int currMax=1;
         char c=' ';

         for(int i=1;i<ch.length;i++){
            if(ch[i-1]==ch[i]){
                currMax++;
                if(currMax>max){
                    max=currMax;
                    c=ch[i];
                }
            }
            else{
             currMax=1;
            }
         }
         System.out.println("Maximum Occrence is :"+c+" "+max);
    }
}
