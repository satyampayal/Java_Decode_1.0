package Recursion;

public class Pip {
    // Zig Zag Printing
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" ");//pre
        pip(n-1);
        System.out.print(n+" ");//In
        pip(n-1);
        System.out.print(n+" ");//Post
    }
    public static void main(String[] args) {
        pip(3);
    }
}
