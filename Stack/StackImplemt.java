package Stack;

class StackArray{
    int[] arr=new int[5];
    int size=5;
    int idx=-1;
    void push(int x){
        if(isFull()){
             System.out.println("Overflow");
           return;
        }
        idx++;

        arr[idx]=x;
    }
    void pop(){
        if(isEmpty()){
             System.out.println("under flow");
           return;
        }
        arr[idx]=0;
        idx--;
    }
    int peek(){
        if(idx<0 || idx>=size){
            return -1;
        }
        return arr[idx];
    }
    boolean isFull(){
        if(idx==size-1){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(idx==-1){
            return true;
        }
        return false;
    }
}
public class StackImplemt {
    public static void main(String[] args) {
        StackArray st=new StackArray();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(4);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
     System.out.println(st.idx);
     


    }
  
}
