package StringPackage;

public class ReverseEachWord {
    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder("I am Satyam Payal");
        StringBuilder result=new StringBuilder();

        int lp=0,rp=0;

         for(int i=0;i<sb.length();i++){
            char  ch=sb.charAt(i);
         
            if(ch==' '){
                StringBuilder temp=new StringBuilder(sb.substring(lp,rp));
                temp.reverse();
                if(i!=1){
                    temp.insert(0, " ");
                }
                result.append(temp);
                lp=rp+1;
                rp=lp;
            }
            else{
              rp++;
            }
         }
         System.out.println(result);
    }
}
