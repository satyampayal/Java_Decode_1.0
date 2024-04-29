package Recursion;

public class BinaryStr {
    public static void printBinary(int n,String ans){
        if(n==0){
            System.out.println(ans);
          
            return;
        }

        printBinary(n-1, ans+0);
        if(ans.length()==0 ||   ans.charAt(ans.length()-1)=='0'){
            printBinary(n-1, ans+1);

        }
    }
 public static void main(String[] args) {
    printBinary(4, "");
 }   
}
