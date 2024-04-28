package Recursion;

public class StringTraversal {
    public static void trav(String str,int i){
        if(i==str.length()) return;
        System.out.print(str.charAt(i));
        trav(str, i+1);
    }
    public static void main(String[] args) {
        String str="Satyam Payal";
        int i=0;
        trav(str, i);
    }
}
