package Recursion;

public class PowerOfAb {
    public static int pow(int a, int b){
        if(a==0 && b==0){{
            System.out.println("Not Defined");
            return -1;
        }
        }
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        return a*pow(a, b-1);
    }
    public static int efdPow(int a,int b){
        if(b==0) return 1;
        int  ans=efdPow(a, b/2);
        if(b%2==0) return ans*ans;
        else   return ans*ans*a;
    }
    public static void main(String[] args) {
        System.out.println(pow(0, 0));
        System.out.println(efdPow(15, 3));
    }
}
