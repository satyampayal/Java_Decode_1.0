package BinaryTree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class Implemet {
    public static void displayTree(Node a){
        if(a==null){
            return;
        }
        System.out.print(a.val+" ");
        displayTree(a.left);
        displayTree(a.right);
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
        System.out.println(a.val+" >>"+a.left.val);
        System.out.println(a.left.left.val);
        displayTree(a);
    }
}
