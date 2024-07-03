package Stack;
import java.util.Stack;
public class ReverseStack {
    
   public static void main(String[] args) {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    st1.push(1);
    st1.push(2);
    st1.push(3);
    st1.push(4);
    st1.push(5);

    while(st1.size()!=0){
        st2.push(st1.peek());
        st1.pop();
    }
    System.out.println(st2);
   }
}
