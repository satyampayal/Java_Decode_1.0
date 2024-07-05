package BinaryTree;

public class FIndMax {
    public static int findMax(Node a){
        if(a==null)
        return 0;

        return Math.max(a.val,Math.max(findMax(a.left),findMax(a.right)));
    }
    public static int size(Node a){
        if(a==null)
         return 0;

         return 1+size(a.left) +size(a.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(41);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(10);
        Node g=new Node(5);
        Node h=new Node(20);
    
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g; 
        e.right=h;
        System.out.println("Max element is: "+findMax(a));
        System.out.println("Size of tree is: "+size(a));

    }


}
