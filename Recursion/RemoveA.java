package Recursion;

public class RemoveA {
    public static void removeA(String str,String result,int i){
    if(i==str.length()) {
        System.out.println(result);
        return;

    }
    if(str.charAt(i)=='a') removeA(str, result, i+1);
    else removeA(str, result+ str.charAt(i), i+1);
    }
    public static void main(String[] args) {
        String str="satyam payal";
        int i=0;
        removeA(str, " ", i);

    }
}
