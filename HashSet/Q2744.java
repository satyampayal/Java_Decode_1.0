package HashSet;

public class Q2744 {
    public static  String reverse(String n){
        String reverse="";
        for(int i=(n.length()-1);i>=0;i--){
            reverse=reverse+n.charAt(i);
        }
        return reverse ;
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int pair=0;
        for(int i=0;i<words.length;i++){
            String rev=reverse(words[i]);
            System.out.println(rev);
            for(int j=i+1;j<words.length;j++){
                if(rev.equals(words[j])){
                    pair=pair+1;
                }
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }
}
