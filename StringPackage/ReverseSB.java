package StringPackage;

public class ReverseSB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Satyam payal");
        int lp=0;
        int rp=sb.length()-1;
        while(lp<rp){
            char fc=sb.charAt(lp);
            char bc=sb.charAt(rp);
            sb.setCharAt(lp, bc);
            sb.setCharAt(rp, fc);
            lp++;
            rp--;
        }
        System.out.println(sb);
    }
}
