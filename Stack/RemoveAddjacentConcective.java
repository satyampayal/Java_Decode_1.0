package Stack;

import java.util.Stack;

public class RemoveAddjacentConcective {
   public static StringBuilder removeConcChar(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }
            else if(st.peek()==c){
                st.pop(); 
            }else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0){
            sb.append(st.peek());
            st.pop();
        }
        sb=sb.reverse();
        return sb;
        
    }
    public static void main(String[] args) {
        System.out.println(removeConcChar("aaabb"));

    }
}
