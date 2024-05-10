package CodingQuestion;

public class q5 {
    public static void main(String[] args) {
    int a=3521;
    int b=2452;
    int c=1352;
    int ans=0;
     for(int i=0;i<4;i++) {
        if(i%2==0){
          ans+=Math.pow(10, i)* Math.max(Math.max(a%10,b%10),c%10);
        }else{
            ans+=Math.pow(10, i)*  Math.min(Math.min(a%10,b%10),c%10);

        }
        a/=10;
        b/=10;
        c/=10;
     }
     // now you can reverse
     // else you do ans+=pow(10,i)*max(...);
     System.out.println(ans);
    }
}
