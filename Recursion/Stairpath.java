package Recursion;

public class Stairpath {
    public static int climpPath(int n){
      if(n<=2) return n;

        return climpPath(n-1) +climpPath(n-2);
    }
    public static void main(String[] args) {
        System.out.println(climpPath(45));
    }
}
