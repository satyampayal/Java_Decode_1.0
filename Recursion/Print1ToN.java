package Recursion;

public class Print1ToN {
    public static void print(int n,int temp){
        if(temp==(n+1)){
            return ;
        }
        System.out.println(temp);
        print(n, ++temp);
    }
    public static void printN(int n){
      if(n==0){
        return;
      }
      printN(n-1);
      System.out.println(n);
    }
    public static void main(String[] args) {
      //  print(10, 1);// with exter prameter
        printN(10);
    }
}
