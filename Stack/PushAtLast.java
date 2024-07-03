package Stack;
import java.util.Stack;
public class PushAtLast {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> stTemp=new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        while(st1.size()!=0){
            stTemp.push(st1.peek());
            st1.pop();
        }
        st1.push(4);
        while(stTemp.size()!=0){
            st1.push(stTemp.peek());
            stTemp.pop();
        }
        System.out.println(st1);

    }
}
