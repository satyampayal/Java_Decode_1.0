package StringPackage;

public class TogelString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello Satyam");

        // System.out.println((int)str.charAt(0));
        for(int i=0 ;i<str.length();i++){
            int ascii=(int) str.charAt(i);
            if(ascii>=97 && ascii<=122){
                char ch=(char)(ascii-32);
                str.setCharAt(i, ch);
            }
            else if(ascii>=65 && ascii<=90){
                char ch=(char)(ascii+32);
                str.setCharAt(i, ch);
            }
            else{
                continue;
            }
        }
        System.out.println(str);
    }
}
