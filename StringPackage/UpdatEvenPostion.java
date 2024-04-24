package StringPackage;

public class UpdatEvenPostion {
    public static void main(String[] args) {
        
        String str="Hi i am Satyam";
        String result="";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                result+='a';
            }
            else{
                result+=str.charAt(i);
            }
            
        }
        System.out.println(result);
    }
}
