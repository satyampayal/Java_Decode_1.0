package StringPackage;

public class IsoMorphicString {
  public static void main(String[] args) {
    if(isIsoMorphic("race", "mood")){
        System.out.println("True ");
    }
    else{
        System.out.println("False");
    }
  }   

  public static boolean isIsoMorphic(String s,String t){
    int[] arr=new int[26];
     
    if(s.length()!=t.length()){
        return false;
    }
   for(int i=0;i<s.length();i++){
    if(arr[(int)(s.charAt(i))-97]==0  || arr[(int)(s.charAt(i))-97]==t.charAt(i) ){
        arr[(int)(s.charAt(i))-97]=t.charAt(i);
    }
    else{
        return false;
    }
   }
   return true;

     
  }
}
