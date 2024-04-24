package StringPackage;

public class CountVowels {
    public static void main(String[] args) {
        String str="Raghav Sir is Teacher";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(isVowel(ch)==true){
                    count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o'|| ch=='u' ||ch=='A' || ch=='E' || ch=='I' ||  ch=='O'|| ch=='U'  ){
            return true;
        }
        return false;
    }
}
