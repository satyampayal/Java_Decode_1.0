package Recursion;

public class Hcf {
    public static void findHCF(int a,int b,int result){

        if(b%a==0) {
            System.out.println(a);
            return;
        }

        findHCF(b%a, a, a);

    }
    public static void main(String[] args) {
        int a=410,b=41;
        // for(int i=Math.min(a,b);i>=1;i--){
        //     if(a%i==0 && b%i==0){
        //         System.out.println(i);
        //         break;
        //     }
        // }
         // a should be gertrher then b
        findHCF(a, b,1);
        
    }
}
