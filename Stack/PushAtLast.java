package Stack;
import java.util.Stack;
public class PushAtLast {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> stTemp=new Stack<>();
        int idx=2;
        st1.push(1);
        st1.push(2);
        st1.push(3);
        while(idx!=0){
            stTemp.push(st1.peek());
            st1.pop();
            idx--;
        }
        st1.push(4);
        while(stTemp.size()!=0){
            st1.push(stTemp.peek());
            stTemp.pop();
        }
        System.out.println(st1);

    }
}
