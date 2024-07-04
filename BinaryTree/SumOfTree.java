package BinaryTree;

public class SumOfTree {
    static int ans=0;
    public static void sumTree(Node a){

        if(a==null){
            return ;
        }
        ans+=a.val;
        sumTree(a.left);
        sumTree(a.right);
    }
    public static int sum(Node a){
        if(a==null){
            return 0;
        }

        return a.val+sum(a.left)+sum(a.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
        ans=0;
        sumTree(a);
        System.out.println(ans);
        System.out.println(sum(a));
    }
}
