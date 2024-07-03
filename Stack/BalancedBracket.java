package Stack;

import java.util.Stack;

public class BalancedBracket {
    public static  boolean isValid(String s){
        if(s.length()==1){
            return false;
        }
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
            }
            else if(c=='['){
                st.push(']');
            }
           else  if(c=='{'){
                st.push('}');
            }
            else if(st.isEmpty() || st.pop()!=c){
             return false;
            }
           
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValid("{{"));
  
    }
}
