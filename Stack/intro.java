package Stack;
import  java.util.Stack;
public class intro {
    
  public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    System.out.println(st.peek());

    // access first element
    while(st.size()>1){
        st.pop();
    }
    System.out.println(st.peek());
  }
}
