package Stack;

import java.util.Stack;

public class NextGreteher {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={10,4,2,20,40,12,20};
        int n=arr.length;
        int[] ans=new int[arr.length];
        ans[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i])
              st.pop();
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);

        }

        for (int ele : ans) {
            System.out.print(ele+" ");
            
        }

    }
}
