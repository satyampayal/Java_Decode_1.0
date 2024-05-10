package CodingQuestion;

class q1{
    public static void main(String[] args) {
        String s="CampusMonk";

       for(int i=0;i<s.length();i++){
        if(i%2==0){
            int ascii=(int)s.charAt(i);
            if(ascii<97){

                s=s.substring(0, i) +(char)(ascii+32) +s.substring(i+1);
            }
        }
        else{
            int ascii=(int)s.charAt(i);
            if(ascii>=97){

                s=s.substring(0, i) +(char)(ascii-32) +s.substring(i+1);
            }
        }
       }
       System.out.println(s);
    }
}